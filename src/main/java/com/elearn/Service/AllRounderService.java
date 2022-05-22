package com.elearn.Service;

import java.util.Optional;

import com.elearn.Entity.Allrounder;

public interface AllRounderService {
	
	Allrounder addCricketer( Allrounder bat);
	
	Optional<Allrounder> showCricketer( String name);
	
	String deleteAllRounder( String name);

}
