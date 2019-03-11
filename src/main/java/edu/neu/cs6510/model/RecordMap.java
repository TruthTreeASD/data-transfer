package edu.neu.cs6510.model;

import java.util.Map;

public class RecordMap {
	
	int id;
	
    String name;
    
    int year;
    
    Map<Integer,Integer> data;

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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Map<Integer, Integer> getData() {
		return data;
	}

	public void setData(Map<Integer, Integer> data) {
		this.data = data;
	}
	

}
