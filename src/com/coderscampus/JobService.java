package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JobService {

	BufferedReader fileReader = null;
	{
		try {
			fileReader = new BufferedReader(new FileReader("jobs.txt"));
			// Split each line into different places
			String line;

			while ((line = fileReader.readLine()) != null) {
				String[] jobsArray = line.split("\",\"");
				for (String jobs : jobsArray) {
					System.out.println(jobs);
				}
				// Store each piece into an array for each line

				String title = jobsArray[0];
				String company = jobsArray[1];
				String compensation = jobsArray[2];
				
//Assign each item in the array into variables such as title, company, compensation	
//Need to 				
				
			}
		} catch (

		FileNotFoundException e) {
			System.out.println("There was an exception");

		} catch (IOException e) {
			System.out.println("There was an IO Exeption");

		} finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				System.out.println("There was closing IO exception");
			}

		}
	}

//Create a method to create a user JOBSERVICE using those variables
	public Jobs createJobs(String title, String company, String compensation) {
		Jobs jobs = new Jobs();
		jobs.setTitle(title);
		jobs.setCompany(company);
		jobs.setCompensation(compensation);
		return jobs;
	}
}