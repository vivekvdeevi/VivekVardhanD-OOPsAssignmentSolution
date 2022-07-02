package com.gl.departmentservice;

public class HrDepartment extends SuperDepartment {

	public HrDepartment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String departmentName() {
		return "HR Department";
	}

	@Override
	public String getTodaysWork() {
		return "Fill today’s worksheet and mark your attendance";

	}

	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String doActivity() {
		return "team Lunch";
	}

}
