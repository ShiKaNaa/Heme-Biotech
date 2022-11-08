package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * It will read the data from a file (.txt)
 * and return a List<String> from said file
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private List<String> listOfSymptoms = new ArrayList<String>();
	
	/**
	 * This method will read each line of a document given its path
	 * @param documentToParseLocation which is the relative path of the document
	 * @return A List<String> of all symptoms inside file
	 */
	@Override
	public List<String> listOfSymptoms(String documentToParse) {

		if(documentToParse != null) {
			try {
				
				BufferedReader parsedFile = new BufferedReader (new FileReader(documentToParse));
				String symptom = parsedFile.readLine();
				
				while (symptom != null) {
					listOfSymptoms.add(symptom);
					symptom = parsedFile.readLine();
				}
				parsedFile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return listOfSymptoms;
	}

}
