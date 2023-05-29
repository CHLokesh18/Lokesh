package com.bidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dto_AdharNumber {
	
	@Id
	private int id;
	
	private long adhar;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getAdhar() {
		return adhar;
	}

	public void setAdhar(long adhar) {
		this.adhar = adhar;
	}
	
	

}
