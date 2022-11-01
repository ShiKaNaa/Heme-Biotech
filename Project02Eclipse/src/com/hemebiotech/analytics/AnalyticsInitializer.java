package com.hemebiotech.analytics;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

public class AnalyticsInitializer {
	

	public static void main(String args[]) throws IOException {
		
		ISymptomReader fileReader = new ReadSymptomDataFromFile(); 
		List<String> listOfSymptomsToAnalyze = fileReader.listOfSymptoms("symptoms.txt");
		System.out.println(listOfSymptomsToAnalyze);


		IAnalyticsCounter symptomsCount = new AnalyticsCounter();
		TreeMap<String, Integer> symptomsOrdered = symptomsCount.countingSymptoms(listOfSymptomsToAnalyze);
		System.out.println(symptomsOrdered);
		
		IDocumentWriter fileWriter = new DocumentWriter();
		fileWriter.writingFile(symptomsOrdered);
	}
}
