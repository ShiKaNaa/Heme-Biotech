/**
 * 
 */
package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

/**
 * @author Raphaël
 *
 */
public class DocumentWriter implements IDocumentWriter {
	
	
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
