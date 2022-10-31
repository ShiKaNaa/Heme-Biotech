package com.hemebiotech.analytics;

public class SymptomReaderController {
	
	static ISymptomReader symptorInterface;
	
	public static void main (String args[]) {
		
		try {
			symptorInterface.GetSymptoms().toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(symptorInterface);
	}
}

