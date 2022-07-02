package com.gl.departmentdriver;

import com.gl.departmentservice.AdminDepartment;
import com.gl.departmentservice.HrDepartment;
import com.gl.departmentservice.TechDepartment;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HrDepartment hrDept;
		hrDept = new HrDepartment();
		TechDepartment techDept = new TechDepartment();
		AdminDepartment adminDept = new AdminDepartment();

		System.out.println("Welcome to " + adminDept.departmentName() + '\n' + adminDept.getTodaysWork() + '\n'
				+ adminDept.getWorkDeadline() + '\n' + adminDept.isTodayAHoliday() + '\n');

		System.out.println("Welcome to " + hrDept.departmentName() + '\n' + hrDept.doActivity() + '\n'
				+ hrDept.getTodaysWork() + '\n' + hrDept.getWorkDeadline() + '\n' + hrDept.isTodayAHoliday() + '\n');

		System.out.println("Welcome to " + techDept.departmentName() + '\n' + techDept.getTodaysWork() + '\n'
				+ techDept.getWorkDeadline() + '\n' + techDept.getTechStackInformation() + '\n'
				+ techDept.isTodayAHoliday());

	}

}
