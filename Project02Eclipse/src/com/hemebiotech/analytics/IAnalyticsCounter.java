package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 * Anything that will read symptom data from a source
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications
 * 
 * The implementation does not need to order the list
 * 
 */

public interface IAnalyticsCounter {

	/** Method that will count each occurrence of a symptom
	 * It will check if a symptom is already in the HashMap as a key
	 * If true it will add 1 to the counter, else it will create the key and initialize it at 1
	 */
	TreeMap<String, Integer> countingSymptoms(List<String> listOfSymptoms);

	/**
	 * If no data is available, return an empty List
	 * 
	 * @return a raw listing of all Symptoms obtained from a data source, duplicates are possible/probable
	 */
	
	
	
}
