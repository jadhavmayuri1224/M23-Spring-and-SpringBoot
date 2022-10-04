package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CollegeService 
{
	@Autowired
	private CollegeRepository repo;
	
	//to retrieve all the data of student class
	public List<College> ListAll()
	{
		return repo.findAll();
	}
	
	//insert or create a data
	public void create(College c)
	{
		repo.save(c);
	}
	
	//to retrieve a single record
	public College retrieve(Integer id)
	{
		return repo.findById(id).get();
	}

	//to delete a data
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}
}