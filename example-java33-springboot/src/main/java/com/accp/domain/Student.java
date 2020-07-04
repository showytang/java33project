package com.accp.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Student {
    private Integer id;

    private String name;

    private Integer age;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    
    private Clazz clz;
    
    private Integer cid;
    
    private String url;
    
    public void setUrl(String url) {
		this.url = url;
	}
    
    public String getUrl() {
		return url;
	}
    
    
    
    public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

    public Student(Integer id, String name, Integer age, Date birthday, Clazz clz) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.birthday = birthday;
		this.clz = clz;
	}

	public Student(String name, Integer age, Date birthday, Clazz clz) {
		super();
		this.name = name;
		this.age = age;
		this.birthday = birthday;
		this.clz = clz;
	}

	public Clazz getClz() {
		return clz;
	}

	public void setClz(Clazz clz) {
		this.clz = clz;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}