package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

/**
 * Main class used to launch the Application
 * @author Raphaël
 *
 */

public class AnalyticsInitializer {
	
	/**
	 * Main function of the Application that will first open the document and put it in a List of String.
	 * Then it will count each occurrences and order it alphabetically returning a TreeMap.
	 * Finally it will write the results in a file named "result.out".
	 * @param args
	 * @throws IOException
	 */
	public static void main(String args[]) throws IOException {
		
		// First open the document, read each line, and put the data inside a List of String
		ISymptomReader fileReader = new ReadSymptomDataFromFile();
		List<String> listOfSymptomsToAnalyze = fileReader.listOfSymptoms("symptoms.txt");

		// Then parse the data to count and order it alphabetically
		IAnalyticsCounter symptomsCount = new AnalyticsCounter();
		TreeMap<String, Integer> symptomsOrdered = symptomsCount.countingSymptoms(listOfSymptomsToAnalyze);
		
		// Finally put the data inside a new file
		IDocumentWriter fileWriter = new DocumentWriter();
		fileWriter.writingFile(symptomsOrdered);
		
	}
}
