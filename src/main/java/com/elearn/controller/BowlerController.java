package com.elearn.controller;

import com.elearn.Entity.Bowlers;
import com.elearn.Exceptions.ApiException;
import com.elearn.Respository.BowlerRepo;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Bowlers")
public class BowlerController {
    @Autowired
    BowlerRepo repo;

    @PostMapping("/addBowler")
    public Bowlers addCricketer(@RequestBody Bowlers bat) {
        return repo.save(bat);
    }
    @GetMapping("/findBowler")
    public Optional<Bowlers> showCricketer(@RequestParam String name) {
    	if(repo.findById(name).isEmpty()) {
     	   throw new ApiException(HttpStatus.NOT_FOUND, Arrays.asList("The Bowler named "+name+" doesn't exits"));
        }
    return repo.findById(name);
    }
    @DeleteMapping("/deleteBowler")
    public String deletebatsmen(@RequestParam String name) {
        repo.deleteById(name);
        return "Player " +name +" Deleted Successfully";
    }
}
