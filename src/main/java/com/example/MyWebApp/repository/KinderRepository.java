package com.example.MyWebApp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.example.MyWebApp.controler.Child;
import com.example.MyWebApp.controler.Kindergarten;
import com.example.MyWebApp.controler.Parents;

@Transactional
public interface KinderRepository extends CrudRepository<Kindergarten, String> {

	 

	

	

}

