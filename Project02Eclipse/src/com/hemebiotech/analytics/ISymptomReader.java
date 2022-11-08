package com.hemebiotech.analytics;

import java.util.List;

/**
 * Anything that will read symptom data from a source.
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications
 * 
 * The implementation does not need to order the list
 */
public interface ISymptomReader {
	
	/**
	 * This method will read each line of a document given its path
	 * @param documentToParseLocation which is the relative path of the document
	 * @return A List of all symptoms inside file
	 */
	List<String> listOfSymptoms(String documentToParseLocation);
	
}
