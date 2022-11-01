package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * It will read the data from a file
 * and return a List<String>
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private List<String> listOfSymptoms = new ArrayList<String>();
	
	/**
	 * This method will read each line of a document given its path
	 * @param String
	 * @return List<String>
	 * @throws IOException
	 */
	@Override
	public List<String> listOfSymptoms(String documentToParse) throws IOException{

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
