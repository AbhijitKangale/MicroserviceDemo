package com.sapient.springboot.model;

public class Count {

	private int deptId;
	private int count;

	public Count() {
		super();
	}
	
	public Count(int deptId, int count) {
		super();
		this.deptId = deptId;
		this.count = count;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
