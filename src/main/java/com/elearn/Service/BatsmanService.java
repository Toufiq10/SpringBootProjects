package com.elearn.Service;

import java.util.Optional;

import com.elearn.Entity.Batsmen;

public interface BatsmanService {

	Batsmen addCricketer(Batsmen bat);

	Optional<Batsmen> showCricketer(String name);

	String deletebatsmen(String name);

}
