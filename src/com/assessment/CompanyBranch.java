package com.assessment;

public class CompanyBranch {
	
	private String branch;
	private String branchManagerName;
	private double managerAllowance;
	
	
	
	
	public CompanyBranch() {
		
	}
	
	
	public CompanyBranch(String branchManagerName, String branch,double managerAllowance) {
		super();
		this.branchManagerName = branchManagerName;
		this.branch = branch;
		this.managerAllowance = managerAllowance;
	}
	public String getBranchManagerName() {
		return branchManagerName;
	}
	public void setBranchManagerName(String branchManagerName) {
		this.branchManagerName = branchManagerName;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public double getManagerAllowance() {
		return managerAllowance;
	}
	
	public void setManagerAllowance(double managerAllowance) {
		this.managerAllowance = managerAllowance;
	}
	
	
	public double xtraSalaryAllowance(double basicSalary) {
		
		double amount = basicSalary+3000;
		return amount;
		
	}

}
