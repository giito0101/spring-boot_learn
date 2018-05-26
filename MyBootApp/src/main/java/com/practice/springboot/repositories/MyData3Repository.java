package com.practice.springboot.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.springboot.MyData3;

@Repository
public interface MyData3Repository extends JpaRepository<MyData3,Long>{
	public Optional<MyData3> findById(Long name);
	public List<MyData3> findByNameLike(String name);
	public List<MyData3> findByIdIsNotNullOrderByIdDesc();
	public List<MyData3> findByAgeGreaterThan(Integer age);
	public List<MyData3> findByAgeBetween(Integer age1,Integer age2);
}
