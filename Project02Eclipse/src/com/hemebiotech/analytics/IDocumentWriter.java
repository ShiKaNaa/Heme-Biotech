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

	void writingFile(TreeMap<String, Integer> symptomeFrequencyMap) throws IOException;
	
}
