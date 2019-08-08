package com.example.MyWebApp.controler;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/naor")

public class SpringControler {

	@GetMapping(path = "/{userId}")
	public String getUser(@PathVariable String userId) {
		return "we get user :" + userId;
	}

	/*
	 * @RequestMapping(method = RequestMethod.POST) public ResponseEntity<String>
	 * persistPerson(@RequestBody Calculation sum) { int res = 0;
	 * 
	 * if (sum.getOperator().equals("+")) { res = sum.getNum1() + sum.getNum2(); }
	 * else if (sum.getOperator().equals("/")) { res = sum.getNum1() /
	 * sum.getNum2(); } else if (sum.getOperator().equals("*")) { res =
	 * sum.getNum1() * sum.getNum2(); }
	 * 
	 * CreateFile.AppendToFile("The number 1 :" + sum.getNum1() + " , " +
	 * " number 2 :  " + sum.getNum2() + "  " + "The opertor is :  " +
	 * sum.getOperator() + "   The result is :  " + res + "   ", sum);
	 * 
	 * return ResponseEntity.status(HttpStatus.CREATED).body("The parameters is :" +
	 * sum.getNum1() + " and " + sum.getNum2() + "  " + "The opertor is :  " +
	 * sum.getOperator() + "   the result is :  " + res);
	 * 
	 * }
	 */

	@RequestMapping(value="/Parents",method = RequestMethod.POST)

	public ResponseEntity<String> persistParents(@RequestBody Parents ParentType) {

		CreateFile.AppendToFile("The father is : " + ParentType.getFathername() + " , " + " The mather is: "
				+ ParentType.getMathername() + "   " + ParentType.getLastname(), ParentType);

		return ResponseEntity.status(HttpStatus.CREATED).body("The father is : " + ParentType.getFathername() + " , "
				+ " The mather is: " + ParentType.getMathername() + "   " + ParentType.getLastname());
	}

	@RequestMapping(value="/child",method = RequestMethod.POST)

	public ResponseEntity<String> persistChild(@RequestBody Child nameChild) {

		CreateFile.AppendToFile(" The child is: " + nameChild.getChfirstname() + "  " + nameChild.getChlastname()
				+ " ,  " + "The age is:" + nameChild.getAge(), nameChild);

		return ResponseEntity.status(HttpStatus.CREATED).body(" The child is: " + nameChild.getChfirstname() + "  "
				+ nameChild.getChlastname() + " ,  " + "The age is:" + nameChild.getAge());
	}

	/*
	 * @RequestMapping( method = RequestMethod.POST) public ResponseEntity<String>
	 * persistPerson(@RequestBody Login login) { Date date = new Date();
	 * System.out.println(date.toString()); System.out.println("The result is : ");
	 * return ResponseEntity.status(HttpStatus.CREATED).body("The date is : " +
	 * date.toString());
	 * 
	 * 
	 * }
	 */
	public String createUser() {

		return "create user was called";
	}

	@PutMapping()

	public String upDateUser() {

		return "up date user ";
	}

	@DeleteMapping
	public String deleteUser() {

		return "delete user ";
	}

	/*
	 * public static int calculet (int num1 ,int num2) {
	 * 
	 * int sum= num1+num2; return sum;
	 * 
	 * 
	 * }
	 */
}
