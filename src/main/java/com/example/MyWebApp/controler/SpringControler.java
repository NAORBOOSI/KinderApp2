package com.example.MyWebApp.controler;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.MyWebApp.repository.KinderRepository;
import com.example.MyWebApp.repository.ParentRepository;
import com.example.MyWebApp.repository.UserAccountRepository;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/naor")
@Api()
public class SpringControler {

	@Autowired
	UserAccountRepository userAccountRepository;
	@Autowired
	ParentRepository parentRepository;

	@Autowired
	KinderRepository kinderRepository;

	@Autowired
	private CreateFile createFile;

	@GetMapping("/child/{chfirstname}")

	public @ResponseBody List<Child> getById(@PathVariable String chfirstname) {
		Iterable<Child> Child = userAccountRepository.findByChfirstname(chfirstname);
		List<Child> target = new ArrayList<>();
		Child.forEach(target::add);
		if (target.equals(chfirstname)) {
			return target;
		} else
			return null;

	}
	
	@SuppressWarnings("hiding")
	@GetMapping("/parent/{fatherId}")
	public @ResponseBody <Parents> Parents getByFatherId (@PathVariable String fatherId){
		
		  Parents  parent =   (Parents) parentRepository.getByFatherId(fatherId);
		 
		
		return parent;
	}

	

	/*
	 * @GetMapping(path = "/update/{childId}/{age}")
	 * 
	 * @ResponseBody public String updateUser(@PathVariable double
	 * age, @PathVariable("childId") Integer childId) {
	 * 
	 * StringBuffer retBuf = new StringBuffer();
	 * 
	 * List<Child> userAccountList = userAccountRepository.findBychildId(childId);
	 * 
	 * if (userAccountList != null) { for (Child userAccount : userAccountList) {
	 * 
	 * userAccount.setAge(age); userAccountRepository.save(userAccount); }
	 * 
	 * }
	 * 
	 * retBuf.append("User update successfully."); return retBuf.toString();
	 * 
	 * }
	 */

	@RequestMapping(value = "/Parents", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<String> persistParents(@RequestBody Parents parent) {

		createFile.appendToFile("The father is : " + parent.getFathername() + " , " + " The mather is: "
				+ parent.getMathername() + "   " + parent.getLastname(), parent);

		parentRepository.save(parent);
		return ResponseEntity.status(HttpStatus.CREATED).body("The father is : " + parent.getFathername() + " , "
				+ " The mather is: " + parent.getMathername() + "   " + parent.getLastname());
	}

	@RequestMapping(value = "/child", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<Child>> persistChild(@RequestBody Child child) {

		createFile.appendToFile(" The child is: " + child.getChfirstname() + "  " + child.getChlastname() + " ,  "
				+ "The age is:" + child.getAge(), child);

		userAccountRepository.save(child);

		Iterable<Child> allChildren = userAccountRepository.findAll();
		List<Child> target = new ArrayList<>();
		allChildren.forEach(target::add);
		return ResponseEntity.status(HttpStatus.CREATED).body(target);
	}

	@RequestMapping(value = "/kinder", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<String> persistKinder(@RequestBody Kindergarten kinder, @RequestBody Child child) {

		createFile.appendToFile("The Kindergarten is : " + kinder.nameKinder + " , " + " The name of child is: "
				+ child.getChfirstname(), kinder);

		kinderRepository.save(kinder);

		return ResponseEntity.status(HttpStatus.CREATED).body("The Kindergarten is : " + kinder.nameKinder + " , "
				+ " The name of child is: " + child.getChfirstname());

	}

	@PutMapping("/parent/{fatherId}")
	public ResponseEntity<Parents> updateEmployee(@PathVariable(value = "fatherId") String fatherId,
			@Valid @RequestBody Parents parentsDetails) throws ResourceNotFoundException {

		Parents updateFather = parentRepository.getByFatherId(fatherId);
//		Parents parentsResult = new Parents();
		updateFather.setChildren(parentsDetails.getChildren());
		 Parents updateEmployee = parentRepository.save(updateFather);

		
		return ResponseEntity.ok(updateFather);
	}

	@RequestMapping(value = "/child/{childId}", method = RequestMethod.DELETE)
	@ResponseBody
	public ResponseEntity<String> deleteUser(@PathVariable("childId") Integer childId) {

		if (userAccountRepository.findBychildId(childId) == null) {
			return new ResponseEntity<String>("user not found ", HttpStatus.NOT_FOUND);
		} else {
			userAccountRepository.deleteByChildId(childId);
			return new ResponseEntity<String>("user deleted successfuly", HttpStatus.OK);
		}
	}

	public String createUser() {

		return "create user was called";
	}

	@PutMapping()

	public String upDateUser() {

		return "up date user ";
	}

	@DeleteMapping("/delete")
	public void delete(@PathVariable String childId) {

	}

}
