package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListController {
	// simple array
	
	private String[] myArray = { "aa","b","c","d"};
	
	//array list
	// an arraylist is a list
	private List <String> myArrayList = new ArrayList <String>();
	
	
	// no good way to start with arraylist items
	// use a constructor
	public ListController() {
		myArrayList.add("gi");
		myArrayList.add("ele");
		myArrayList.add("dog");
		myArrayList.add("cat");
		myArrayList.add("wof");
		myArrayList.add("phe");
	}
		
	
	
	// get the whole array 
	@GetMapping("/array")
	// type http://localhost:8080/array
	public String[] getArray() {
		return this.myArray;
	}
	
	
	// get an time out of the array by its index
	public String getArrayItem(@PathVariable int index) {
		return myArray[index];
	}
	
	
			
	
	// get the whole list
	@GetMapping("/list")
	public List<String> getList(){
		return this.myArrayList;
	}
	
	// get an item out of the arralylist by its index
	@GetMapping("/list/{index}")
	// postman type /list/6
	public String getListItem(@PathVariable int index) {
		return myArrayList.get(index);
	}
	
	
	

}
