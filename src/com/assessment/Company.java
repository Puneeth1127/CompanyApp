package com.assessment;

import java.util.ArrayList;
import java.util.List;

public class Company {

	private String CompanyName;
	private String companyAddress;
	
	private List<Customer> listOfcustomer;
	
	private List<Employee> listOfEmployee;
	
	private List<CompanyBranch> listOfBranches;
	
	public Company() {
		listOfcustomer = new ArrayList<Customer>();
		listOfEmployee = new ArrayList<Employee>();
		listOfBranches = new ArrayList<CompanyBranch>();
	}
	
	
	
	public String getCompanyName() {
		return CompanyName;
	}


	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	

	public String getCompanyAddress() {
		return companyAddress;
	}


	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}



	public List<CompanyBranch> getListOfBranches() {
		return listOfBranches;
	}


	public void setListOfBranches(List<CompanyBranch> listOfBranches) {
		this.listOfBranches = listOfBranches;
	}

	public List<Customer> getListOfcustomer() {
		return listOfcustomer;
	}

	public void setListOfcustomer(List<Customer> listOfcustomer) {
		this.listOfcustomer = listOfcustomer;
	}

	public List<Employee> getListOfEmployee() {
		return listOfEmployee;
	}

	public void setListOfEmployee(List<Employee> listOfEmployee) {
		this.listOfEmployee = listOfEmployee;
	}
	
	
	public void addListOfcustomer(Customer customer) {
		
		listOfcustomer.add(customer);
	}
	
	public void addListOfEmployee(Employee employee) {
		
		listOfEmployee.add(employee);
		
	}
	public void addListOfBranches(CompanyBranch companyBranch) {
		listOfBranches.add(companyBranch);
	}
	
	

}
