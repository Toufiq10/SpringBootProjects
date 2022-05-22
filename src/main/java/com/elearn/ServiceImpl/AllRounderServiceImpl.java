package com.elearn.ServiceImpl;

import java.util.Arrays;
import java.util.Optional;

import static com.elearn.util.ConstantsValue.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.elearn.Entity.Allrounder;
import com.elearn.Exceptions.ApiException;
import com.elearn.Respository.AllRounderRepo;
import com.elearn.Service.AllRounderService;

@Service
public class AllRounderServiceImpl implements AllRounderService {
	@Autowired
	AllRounderRepo repo;
	
	@Override
	public Allrounder addCricketer(@RequestBody Allrounder bat) {
        return repo.save(bat);
    }
	
	@Override
	public Optional<Allrounder> showCricketer(@RequestParam String name) {
        if(repo.findById(name).isEmpty()) {
     	   throw new ApiException(HttpStatus.NOT_FOUND, Arrays.asList("The Allrounder named "+name+" doesn't exits"));
        };
 	return repo.findById(name);
    }
	
	@Override
	public String deleteAllRounder(@RequestParam String name) {
        repo.deleteById(name);
        return DELETEMESSAGE;
    }

}
