package com.coderscampus;


public class JobsFilteringApplication {

	public static void main(String[] args) {

		 JobService printJobs = new JobService();
		 printJobs.readJobsFromFile("jobs.txt");
	}
}
