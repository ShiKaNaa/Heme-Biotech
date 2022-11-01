package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 * 
 * @author Raphaël
 *
 */

public class AnalyticsCounter implements IAnalyticsCounter {

	static TreeMap<String, Integer> symptomeFrequencyMap = new TreeMap<String, Integer>();

	/** Method that will count each occurrence of a symptom
	 * It will check if a symptom is already in the HashMap as a key
	 * If true it will add 1 to the counter, else it will create the key and initialize it at 1
	 */
	@Override
	public TreeMap<String, Integer> countingSymptoms(List<String> listOfSymptoms) {
		
		// Iterate over the list of symptoms
		for(String symptom : listOfSymptoms) {
			if(symptomeFrequencyMap.containsKey(symptom)) {
				symptomeFrequencyMap.put(symptom, symptomeFrequencyMap.get(symptom) + 1);
			}
			else {
				symptomeFrequencyMap.put(symptom, 1);
			}
		}
		return symptomeFrequencyMap;
	}
}
