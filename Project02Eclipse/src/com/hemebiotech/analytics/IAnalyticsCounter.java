package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 * countingSymptoms method to count each occurrences and order alphabetically 
 */

public interface IAnalyticsCounter {

	/** Method that will count each occurrence of a symptom.
	 * It will check if a symptom is already in the TreeMap as a key.
	 * If true it will add 1 to the counter, else it will create the key and initialize it at 1
	 * @param listOfSymptoms A List of symptoms that need to be counted and ordered
	 * @return A TreeMap of the data
	 */
	TreeMap<String, Integer> countingSymptoms(List<String> listOfSymptoms);
	
}
