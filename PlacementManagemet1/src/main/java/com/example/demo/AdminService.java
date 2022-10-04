package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AdminService 
{
	@Autowired//because we have to use the DI using setters 
	private AdminRepository repo;
	
	//to retrieve all the data of student class
	public List<Admin> ListAll()
	{
		return repo.findAll();
	}
	
	//insert or create a data
	public void create(Admin a)
	{
		repo.save(a);
	}
	
	//to retrieve a single record
	public Admin retrieve(Integer id)
	{
		return repo.findById(id).get();
	}
	
	//to delete a data
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}

}