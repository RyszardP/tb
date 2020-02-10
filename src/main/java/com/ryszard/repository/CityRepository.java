package com.ryszard.repository;

import com.ryszard.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface CityRepository extends JpaRepository<City,Integer> {

  City findByName(String name);


}
