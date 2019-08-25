package com.example.MyWebApp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.example.MyWebApp.controler.Child;

@Transactional
public interface UserAccountRepository extends CrudRepository<Child, String> {

	List<Child> findByChfirstname(String chfirstname);

	List<Child> findBychildId(Integer childId);

	List<Child> findByChlastname(String chlastname);

	
  
	void save(String child);
	
	

	void deleteByChildId(Integer childId);

	

	

}

