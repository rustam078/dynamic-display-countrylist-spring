package com.example.demo.Repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.State;

@Repository
public interface StateRepo extends JpaRepository<State, Serializable> {

	public List<State> findByCountryid(Integer countryid);
}
