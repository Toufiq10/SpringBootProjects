package com.elearn.ServiceImpl;

import java.util.Arrays;
import java.util.Optional;
import static com.elearn.util.ConstantsValue.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.elearn.Entity.Batsmen;
import com.elearn.Exceptions.ApiException;
import com.elearn.Respository.BatsmenRepo;
import com.elearn.Service.BatsmanService;

import io.swagger.v3.oas.annotations.Parameter;

@Service
public class BatsmanServiceImpl implements BatsmanService {

	
	@Autowired
    BatsmenRepo repo;
	
	@Override
	 public Batsmen addCricketer(
	    		@RequestBody 
	    		@Parameter(description="Enter all the details of the Batsman")
	    		Batsmen bat) {
	        return repo.save(bat);
	    }

	@Override
	public Optional<Batsmen> showCricketer(@RequestParam String name) {
    	if(repo.findById(name).isEmpty()) {
     	   throw new ApiException(HttpStatus.NOT_FOUND, Arrays.asList("The Batsman named "+name+" doesn't exits"));
        };
        return repo.findById(name);
    }

	@Override
	public String deletebatsmen(@RequestParam String name) {
        repo.deleteById(name);
        return DELETEMESSAGE;
    }
}
