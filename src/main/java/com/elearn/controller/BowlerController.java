package com.elearn.controller;

import com.elearn.Entity.Bowlers;
import com.elearn.Service.BowlerService;

import static com.elearn.util.ConstantsValue.*;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(BOWLERROUNDERURL)
public class BowlerController {
    
	@Autowired
	BowlerService service;
	

    @PostMapping(ADDBOWLER)
    public Bowlers addCricketer(@RequestBody Bowlers bat) {
        return service.addCricketer(bat);
    }
    @GetMapping(GETBOWLER)
    public Optional<Bowlers> showCricketer(@RequestParam String name) {
    	return service.showCricketer(name);
    }
    @DeleteMapping(DELETEBOWLER)
    public String deletebatsmen(@RequestParam String name) {
        return service.deletebatsmen(name);
    }
}
