package com.elearn.controller;


import com.elearn.Entity.Allrounder;
import com.elearn.Service.AllRounderService;

import static com.elearn.util.ConstantsValue.*;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(ALLROUNDERURL)
public class AllrounderController { 

    @Autowired
    AllRounderService service;

    @PostMapping(ADDALLROUNDER)
    public Allrounder addCricketer(@RequestBody Allrounder bat) {
        return service.addCricketer(bat);
    }
    @GetMapping(GETALLROUNDER)
    public Optional<Allrounder> showCricketer(@RequestParam String name) {
    	return service.showCricketer(name);
    }
    
    @DeleteMapping(DELETEALLROUNDER)
    public String deletebatsmen(@RequestParam String name) {
    	service.deleteAllRounder(name);
        return "Player Deleted Successfully";
    }

}
