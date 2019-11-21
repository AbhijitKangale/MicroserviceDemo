package com.sapient.springboot.model;

public class Department {

	private long id;
	private String name;
	private String description;
	private int count;

	public Department() {

	}

	public Department(long id, String name, String description, int count) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.count = count;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
