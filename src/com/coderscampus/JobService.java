package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JobService {

	public void readJobsFromFile(String fileName) {
		
		List<Jobs> jobsList = new ArrayList<>();

		BufferedReader fileReader = null;

		try {
			fileReader = new BufferedReader(new FileReader(fileName));
			String line;

			while ((line = fileReader.readLine()) != null) {
				String[] jobsArray = line.split("\",\"");
				String title = jobsArray[0].replace("\"", "");
				String company = jobsArray[1];
				String compensation = jobsArray[2].replace("\"", "");

				if (!compensation.equals("")) {
					Jobs job = new Jobs(title, company, compensation);
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

				}
			}
		}
	}
}