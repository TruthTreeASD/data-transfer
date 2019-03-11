package edu.neu.cs6510.model;

import javax.persistence.*;

@Entity
@Table(name = "gov_fin_lookup")
public class LookUpData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    
    int attribute_mapping_id;
    int location_id;
    int year;
    
    double value;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getAttribute_mapping_id() {
		return attribute_mapping_id;
	}
	public void setAttribute_mapping_id(int attribute_mapping_id) {
		this.attribute_mapping_id = attribute_mapping_id;
	}
	public int getLocation_id() {
		return location_id;
	}
	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
}
