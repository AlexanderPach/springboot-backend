package com.alexsExample.springboot.controller;

import com.alexsExample.springboot.model.Cat;
import com.alexsExample.springboot.service.CatService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cats")
public class CatController {

    private CatService catService;

    /**
     * @param catService - handles the business logic of our program
     * @constructor - creates dependency injection, allowing to not rely on strict source object
     */
    public CatController(CatService catService) {
        super();
        this.catService = catService;
    }

    /**
     * @param cat - Cat Object being created
     * @return if POST request is successful, to return a successful HTTP status.
     */
    @PostMapping()
    public ResponseEntity<Cat> saveCat(@RequestBody Cat cat){
        return new ResponseEntity<>(catService.saveCat(cat), HttpStatus.CREATED);
    }

    /**
     * @return returns all Cats preceded with GET request
     */
    @GetMapping
    public List<Cat> getAllCats(){
        return catService.getAllCats();
    }

    /**
     * @param catId - allows access to data from id endpoint
     * @return - returns a successful HTTP status after completion of GET request
     */
    @GetMapping("{id}")
    public ResponseEntity<Cat> getCatById(@PathVariable("id") long catId){
        return new ResponseEntity<>(catService.getCatById(catId), HttpStatus.OK);
    }

    /**
     * @param id - access data from id endpoint
     * @param cat - returns specific Cat object converted from API
     * @return - updates Cat information and returns OK HTTP status
     */
    @PutMapping("{id}")
    public ResponseEntity<Cat> updateCat(@PathVariable("id") long id,@RequestBody Cat cat){
        return new ResponseEntity<>(catService.updateCat(cat,id), HttpStatus.OK);

    }

    /**
     * @param id - access data from id endpoint
     * @return - returns a successful message that Cat has been deleted
     */
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteCat(@PathVariable("id") long id){
        catService.deleteCat(id);

        return new ResponseEntity<>("Cat Deleted!", HttpStatus.OK);
    }

}
