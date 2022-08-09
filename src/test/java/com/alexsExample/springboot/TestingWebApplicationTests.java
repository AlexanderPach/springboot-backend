package com.alexsExample.springboot;

import com.alexsExample.springboot.controller.CatController;
import com.alexsExample.springboot.model.Cat;
import com.alexsExample.springboot.service.CatService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class TestingWebApplicationTests {

    private CatService service;
    @Autowired
    CatController controller;
    Cat cat;

    @Test
    public void contentLoads(){
        assertThat(controller).isNotNull();
    }

}
