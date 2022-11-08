/**
 * 
 */
package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

/**
 * Class with one method that will create a file "result.out" 
 * @author Raphaël
 *
 */
public class DocumentWriter implements IDocumentWriter {
	
	/**
	 * Method that will write create a file "result.out"  
	 * @param symptomeFrequencyMap A TreeMap of the data that will be stored in a new file 
	 * @throws IOException
	 */
	public void writingFile(TreeMap<String, Integer> symptomeFrequencyMap) throws IOException{
		
		FileWriter resultsDocument = new FileWriter("result.out");
		
		for(String symptom : symptomeFrequencyMap.keySet()) {
			try {
				resultsDocument.write(symptom + ": "  + symptomeFrequencyMap.get(symptom) +  "\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		resultsDocument.close();
	}

}
