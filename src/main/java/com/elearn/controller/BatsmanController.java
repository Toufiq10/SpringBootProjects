package com.elearn.controller;

import com.elearn.Entity.Batsmen;
import com.elearn.Service.BatsmanService;

import static com.elearn.util.ConstantsValue.*;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(BATSMANROUNDERURL)
@ApiResponses(value =
@ApiResponse(responseCode = "200", description = "Batsman details", content = {
		@Content(mediaType = "application/json",
		schema = @Schema(implementation = String.class)), //examples = @ExampleObject(name = "Batsman", value = ConstantsValue.EXAMPLESCHEMA))
}))
public class BatsmanController {
	
	@Autowired
	BatsmanService service;

    @PostMapping(ADDBASTMAN)
    public Batsmen addCricketer(
    		@RequestBody 
    		@Parameter(description=BATSMANDETAILS)
    		Batsmen bat) {
        return service.addCricketer(bat);
    }
    @GetMapping(GETBATSMAN)
    public Optional<Batsmen> showCricketer(@RequestParam String name) {
    	return service.showCricketer(name);
    }
    
    @DeleteMapping(DELETEBATSMAN)
    public String deletebatsmen(@RequestParam String name) {
        return service.deletebatsmen(name);
    }
}
