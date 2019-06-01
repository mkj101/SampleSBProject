package com.manish.sampleproject1.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class College implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 12345L;
	@Id
	@Column(name = "college_id")
	private Integer id;
	@Column(name="name")
	private String name;	
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL)
	private List<Student> student;
	
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
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
