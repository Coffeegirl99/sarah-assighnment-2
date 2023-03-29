package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JobsFilteringApplication {

	public static void main(String[] args) {

		BufferedReader fileReader = null;
		try {
			fileReader = new BufferedReader(new FileReader("jobs.txt"));

			String line;
			while ((line = fileReader.readLine()) != null) {
				System.out.println(line);
			}
			System.out.println(fileReader.toString());
		} catch (FileNotFoundException e) {
			System.out.println("There was an exception");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("There was an I/O problem");
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
