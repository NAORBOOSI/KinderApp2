package com.example.MyWebApp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.example.MyWebApp.controler.Child;

public interface UserAccountRepository extends CrudRepository<Child, String> {
	
	//List<Child> findByLastname(String lastname);

	/*
     * Get user list by user name. Please note the format should be
     * findBy<column_name>.
     */
    List<Child> findByUsername(String firstname);

    /*
     * Get user list by user name and password. Please note the format should be
     * findBy<column_name_1>And<column_name_2>.
     */
    List<Child> findByLastName(String lastname);

    @Transactional
    void deleteByUsernameAndPassword(String username, String password);

    @Transactional
    void deleteByUsername(String username);
    

    
   

}
