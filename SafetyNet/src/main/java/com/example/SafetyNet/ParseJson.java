package com.example.SafetyNet;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ParseJson {
	
public static void Parse() {
		
		try {
			 CompositeModel model = new ObjectMapper().readValue(new File("src/main/resources/data.json"), CompositeModel.class);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
