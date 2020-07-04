package com.accp.domain;

import java.util.List;

public class Clazz {
	
	private Integer id;
	private String name;
	
	
	private List<Student> slist;
	
	
	
	public List<Student> getSlist() {
		return slist;
	}
	public void setSlist(List<Student> slist) {
		this.slist = slist;
	}
	public Integer getId() {
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
	
	public Clazz() {
		// TODO Auto-generated constructor stub
	}
	public Clazz(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	

}
