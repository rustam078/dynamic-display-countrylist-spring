package com.example.demo.Repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.City;
import com.example.demo.entity.State;

@Repository
public interface CityRepo extends JpaRepository<City, Serializable> {

	public List<City> findByStateid(Integer stateid);
}
