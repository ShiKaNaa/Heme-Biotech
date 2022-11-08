/**
 * 
 */
package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.TreeMap;

/**
 * @author Raphaël
 *
 */
public interface IDocumentWriter {

	/**
	 * Method that will write create a file "result.out"  
	 * @param symptomeFrequencyMap A TreeMap of the data that will be stored in a new file 
	 * @throws IOException
	 */
	void writingFile(TreeMap<String, Integer> symptomeFrequencyMap) throws IOException;
	
}
