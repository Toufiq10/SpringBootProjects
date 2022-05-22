package com.elearn.Service;

import java.util.Optional;

import com.elearn.Entity.Bowlers;

public interface BowlerService {

	Bowlers addCricketer(Bowlers bat);

	Optional<Bowlers> showCricketer(String name);

	String deletebatsmen(String name);

}
