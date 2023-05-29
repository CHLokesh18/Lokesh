package com.bidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class dto_Persion_Details {
	@Id
	private int id;
	private String name;
	private int age;
	
	@OneToOne
	private Dto_AdharNumber d;
	
	
	public Dto_AdharNumber getD() {
		return d;
	}
	public void setD(Dto_AdharNumber d) {
		this.d = d;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
