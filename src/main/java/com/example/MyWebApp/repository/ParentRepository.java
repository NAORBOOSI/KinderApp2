package com.example.MyWebApp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.example.MyWebApp.controler.Parents;


@Transactional
public interface ParentRepository extends CrudRepository<Parents, String> {

	 
	public Parents getByFatherId(String fatherId);
	}

	

	

	



