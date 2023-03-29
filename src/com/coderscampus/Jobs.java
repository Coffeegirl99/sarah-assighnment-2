package com.coderscampus;

public class Jobs {

	private String title;
	private String company;
	private String compensation;

	public Jobs(String title, String company, String compensation) {
		this.title = title;
		this.company = company;
		this.compensation = compensation;
	}

	public String getTitle() {
		return title;
	}

	public String getCompany() {
		return company;
	}

	public String getCompensation() {
		return compensation;
	}

	@Override
	public String toString() {
		return title + "/n" + company + "/n" + compensation + "/n";
	}
}
//Jobs "[title + "/n" + company + "/n" + compensation + "/n"]"