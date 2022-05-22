package com.elearn.controller;

import com.elearn.Entity.Allrounder;
import com.elearn.Exceptions.ApiException;
import com.elearn.Respository.AllRounderRepo;
import com.elearn.Service.AllRounderService;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/AllRounders")
public class AllrounderController { 

    @Autowired
    AllRounderService service;

    @PostMapping("/addAllRounder")
    public Allrounder addCricketer(@RequestBody Allrounder bat) {
        return service.addCricketer(bat);
    }
    @GetMapping("/findAllrounder")
    public Optional<Allrounder> showCricketer(@RequestParam String name) {
    	return service.showCricketer(name);
    }
    
    @DeleteMapping("/deleteAllrounder")
    public String deletebatsmen(@RequestParam String name) {
    	service.deleteAllRounder(name);
        return "Player Deleted Successfully";
    }

}
