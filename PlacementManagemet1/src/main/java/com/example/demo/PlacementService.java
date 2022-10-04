package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PlacementService 
{
	@Autowired
	private PlacementRepository repo;
	
	//to retrieve all the data of student class
	public List<Placement> ListAll()
	{
		return repo.findAll();
	}
	
	//insert or create a data
	public void create(Placement p)
	{
		repo.save(p);
	}

	//retrieve a single record
	public Placement retrieve(Integer id)
	{
		return repo.findById(id).get();
	}
	
	//to delete a data
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}
}