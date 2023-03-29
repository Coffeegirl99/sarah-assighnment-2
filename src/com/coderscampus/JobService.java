package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JobService {

	private Jobs createJobs (String username, String password) {
		Jobs jobs = new Jobs(password, password, password);
		jobs.setUsername(username);
		jobs.setPassword(password);
		return jobs;
	}

	public List<Jobs> filteredJobs(List<Jobs> jobs) {
		List<Jobs> filteredJobs = new ArrayList<>();
		for (Jobs job : jobs) {
			if (job.getCompensation() != null) {
				filteredJobs.add(job);
			}
		}
		return filteredJobs;
	}
}
