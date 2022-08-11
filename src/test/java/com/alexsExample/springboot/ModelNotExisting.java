package com.alexsExample.springboot;


import com.alexsExample.springboot.controller.CatController;
import com.alexsExample.springboot.exception.UnknownObjectException;
import com.alexsExample.springboot.model.Cat;
import org.junit.jupiter.api.Test;

public class ModelNotExisting {

    @Test
    public void modelTest(CatController cats, Cat cat){
        UnknownObjectException exe = new UnknownObjectException(cat.getId(),"Cat Database");
        if(cats.getCatById(cat.getId()) == null){
            System.err.println(exe);
        }
    }


}
