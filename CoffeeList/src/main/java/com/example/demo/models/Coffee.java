package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="coffee")

public class Coffee {
	
	@Id // primary key 
	@GeneratedValue(strategy=GenerationType.AUTO) // primary key can be auto generated 
	// run, look at Hibernate result
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public boolean isTasteGood() {
		return TasteGood;
	}
	public void setTasteGood(boolean tasteGood) {
		TasteGood = tasteGood;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	private Integer id;
	private boolean TasteGood;
	private String source;
	
	
	
	
	

}
