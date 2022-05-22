package com.elearn.ServiceImpl;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.elearn.Entity.Bowlers;
import com.elearn.Exceptions.ApiException;
import com.elearn.Respository.BowlerRepo;
import com.elearn.Service.BowlerService;

@Service
public class BowlerServiceImpl implements BowlerService {
	
	@Autowired
    BowlerRepo repo;
	

	@Override
	public Bowlers addCricketer(@RequestBody Bowlers bat) {
        return repo.save(bat);
    }
	

	@Override
	public Optional<Bowlers> showCricketer(@RequestParam String name) {
    	if(repo.findById(name).isEmpty()) {
     	   throw new ApiException(HttpStatus.NOT_FOUND, Arrays.asList("The Bowler named "+name+" doesn't exits"));
        }
    return repo.findById(name);
    }
	
	@Override
	public String deletebatsmen(@RequestParam String name) {
        repo.deleteById(name);
        return "Player " +name +" Deleted Successfully";
    }

}
