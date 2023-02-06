package com.assessment;

import java.time.LocalDate;

public class TestMain {

	public static void main(String[] args) {

		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		emp1.setName("Puneeth");
		emp1.setAge(23);
		emp1.setAddress("Banglore");
		emp1.setEmpId(1403);
		emp1.setDepartMent("Plumber");
		emp1.setBasicSalary(12000.00);
		emp1.setBand("lower Band");
		emp1.setJoinDate(LocalDate.now());
		
		emp2.setName("Kumar");
		emp2.setAge(24);
		emp2.setAddress("Banglore");
		emp2.setEmpId(1403);
		emp2.setDepartMent("Plumber");
		emp2.setBasicSalary(12000.00);
		emp2.setBand("lower Band");
		emp2.setJoinDate(LocalDate.now());
		
		
		Customer customer = new Customer();
		
		customer.setName("Swadhish");
		customer.setAge(26);
		customer.setAddress("Puducherry");
		
		CompanyBranch branch = new CompanyBranch();
		
		branch.setBranch("Marathahalli");
		branch.setBranchManagerName("Faisal");
		branch.setManagerAllowance(branch.xtraSalaryAllowance(12000));
		
	
		
		
		Company company = new Company();
		
		company.addListOfEmployee(emp1);
		company.addListOfEmployee(emp2);
		company.addListOfBranches(branch);
		company.addListOfcustomer(customer);

		for(Employee employee:company.getListOfEmployee()) {
			System.out.println(employee.getName());
			System.out.println(employee.getDepartMent());
		}
		
		System.out.println("********Showing the details of branch Manager ************Details");
		
		for(CompanyBranch branchs: company.getListOfBranches()) {
			System.out.println("Branch Manage Name: "+branchs.getBranchManagerName());
			System.out.println("Manager Allowance: "+branchs.getManagerAllowance());
		}
		
//		System.out.println(company.getListOfEmployee().get(0).getName());
		
	}

}
