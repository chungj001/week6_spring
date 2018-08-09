package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VariableController {
	
	// private variables
	// String is capitalized bec it is a class
	// private means that only the VariableController has access
	private String myName="Jason";
	private int myNumber =52;
	private boolean myBoolean = true;
	private double myDouble = 123.123;
	private float myFloat = 123.123f;
	
	// make a boolean following the same process
	// make a double following the same process
	// make a float following the same process
	
	// listen to an incoming GET request at the specified path
	
	@GetMapping("/name")
	public String getName() {
		//this. is similar to saying ME
		return this.myName;
	}
	
	@GetMapping("/number")
	public int getNumber() {
		return this.myNumber;
	}
	
	@GetMapping("/boolean")
	public boolean getBoolean() {
		return this.myBoolean;
	}
	
	@GetMapping("/number")
	public double getDouble() {
		return this.myDouble;
	}
	
	@GetMapping("/number")
	public float  getFloat() {
		return this.myFloat;
	}
	
	
	

}
