package com.example.MyWebApp.controler;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//(name = "Kindergarten")
@Entity
public class Kindergarten   {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
	
	public String nameKinder;
	
	public Kindergarten(String sex, String fathername, String mathername, String lastname,
			String chfirstname, String chlastname,int childId, double age, String nameKinder) {
		super();
		this.nameKinder = nameKinder;
	}

	public String getnameKinder() {
		return nameKinder;
	}

	public void setnameKinder(String nameKinder) {
		this.nameKinder = nameKinder;
	}
//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	//private List<Kindergarten> Kinder;
	
	


}
