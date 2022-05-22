package com.elearn.controller;

import com.elearn.Entity.Batsmen;
import com.elearn.Exceptions.ApiException;
import com.elearn.Respository.BatsmenRepo;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Optional;

@RestController
@RequestMapping("/Batsmen")
@ApiResponses(value =
@ApiResponse(responseCode = "200", description = "Batsman details", content = {
		@Content(mediaType = "application/json",
		schema = @Schema(implementation = String.class)), //examples = @ExampleObject(name = "Batsman", value = ConstantsValue.EXAMPLESCHEMA))
}))
public class BatsmanController {
    @Autowired
    BatsmenRepo repo;

    @PostMapping("/addBatsman")
    public Batsmen addCricketer(
    		@RequestBody 
    		@Parameter(description="Enter all the details of the Batsman")
    		Batsmen bat) {
        return repo.save(bat);
    }
    @GetMapping("/findBatsman")
    public Optional<Batsmen> showCricketer(@RequestParam String name) {
    	if(repo.findById(name).isEmpty()) {
     	   throw new ApiException(HttpStatus.NOT_FOUND, Arrays.asList("The Batsman named "+name+" doesn't exits"));
        };
        return repo.findById(name);
    }
    @DeleteMapping("/deleteBatsmen")
    public String deletebatsmen(@RequestParam String name) {
        repo.deleteById(name);
        return "Batsmen Deleted Successfully";
    }
}
