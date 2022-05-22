package com.elearn.Respository;

import com.elearn.Entity.Allrounder;
import com.elearn.Entity.Batsmen;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface AllRounderRepo extends JpaRepository<Allrounder, String> {

}
