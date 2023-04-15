package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JobService {

	private List<Jobs> jobsList = new ArrayList<>();

	BufferedReader fileReader = null;
	{
		try {
			fileReader = new BufferedReader(new FileReader("jobs.txt"));
			String line;

			while ((line = fileReader.readLine()) != null) {
				String[] jobsArray = line.split("\",\"");
				String title = jobsArray[0].replace("\"", "");
				String company = jobsArray[1];
				String compensation = jobsArray[2].replace("\"", "");

				if (!compensation.equals("")) {
					Jobs job = createJobs(title, company, compensation);
					jobsList.add(job);
				}
			}

			for (Jobs jobs : jobsList) {
				System.out.println(jobs.getTitle());
				System.out.println(jobs.getCompany());
				System.out.println(jobs.getCompensation());
				System.out.println();
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error reading file");
		} finally {
			if (fileReader != null) {
				try {
					fileReader.close();
				} catch (IOException e) {
					System.out.println("Error closing file");
				}
			}
		}
	}

	private Jobs createJobs(String title, String company, String compensation) {
		Jobs jobs = new Jobs();
		jobs.setTitle(title);
		jobs.setCompany(company);
		jobs.setCompensation(compensation);
		return jobs;
	}
}

//package com.coderscampus;
//
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class JobService {
//
//	BufferedReader fileReader = null;
//	{
//		try {
//			fileReader = new BufferedReader(new FileReader("jobs.txt"));
//			// Split each line into different places
//			String line;
//
//			while ((line = fileReader.readLine()) != null) {
//				String[] jobsArray = line.split("\",\"");
//				for (String jobs : jobsArray) {
//					System.out.println(jobs);
//				}
//				// Store each piece into an array for each line
//
//				String title = jobsArray[0];
//				String company = jobsArray[1];
//				String compensation = jobsArray[2];
//				
//            Jobs[] job = new Jobs[30];
//			
//			for (int i = 0; i < 30; i++) {
//			 job[i] = createJobs(title + (i+1), company, compensation);
//			}
//			
//			System.out.println(job);
//			}
//
////Assign each item in the array into variables such as title, company, compensation	
////Need to remove filter/remove the jobs that don't have compensation				
//
//		} catch (
//
//		FileNotFoundException e) {
//			System.out.println("There was an exception");
//
//		} catch (IOException e) {
//			System.out.println("There was an IO Exeption");
//
//		} finally {
//			try {
//				fileReader.close();
//			} catch (IOException e) {
//				System.out.println("There was closing IO exception");
//			}
//		}
//	}
//
////Create a method to create a user job using those variables
//	private Jobs createJobs(String title, String company, String compensation) {
//		Jobs jobs = new Jobs();
//		jobs.setTitle(title);
//		jobs.setCompany(company);
//		jobs.setCompensation(compensation);
//		return jobs;
////Make use of createJobs method to create "Job" objects for each job.
