package com.sapient.springboot.model;

public class Description {

	private int deptId;
	private String name;
	private String deptDescription;

	public Description() {
		super();
	}

	public Description(int deptId, String deptDescription) {
		this.deptId = deptId;
		this.deptDescription = deptDescription;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeptDescription() {
		return deptDescription;
	}

	public void setDeptDescription(String deptDescription) {
		this.deptDescription = deptDescription;
	}
}
