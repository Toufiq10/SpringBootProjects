package com.elearn.Respository;

import com.elearn.Entity.Bowlers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface BowlerRepo extends JpaRepository<Bowlers, String> {
}
