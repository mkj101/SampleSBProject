package com.manish.sampleproject1.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 12346L;
	@Id
	@Column(name = "student_id")
	private Integer id;
	@Column(name="name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name="college_id")
	private College college;
	
	@Column(name="address")
	private String address;
	
	public long getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
