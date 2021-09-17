package com.example.demo.controller;

import com.example.demo.model.Model;
import com.example.demo.repo.MyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.aggregation.ArithmeticOperators;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    MyRepo myRepo;

    @PostMapping("/insert")
    public Model insetValue(@RequestBody Model model){
        myRepo.save(model);
        return model;
    }

    @GetMapping("/")
    public List<Model> getAllValue(){
       return myRepo.findAll();

    }
}
