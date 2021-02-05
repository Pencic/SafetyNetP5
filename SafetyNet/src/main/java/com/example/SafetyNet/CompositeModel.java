package com.example.SafetyNet;

import java.util.List;

import com.example.SafetyNet.models.FirestationsModel;
import com.example.SafetyNet.models.MedicalrecordsModel;
import com.example.SafetyNet.models.PersonsModel;

public class CompositeModel {
	
	private static List<PersonsModel> persons;
	private static List<MedicalrecordsModel> medicalrecords;
	private static List<FirestationsModel> firestations;

	public CompositeModel() {
		
	}

	public static List<PersonsModel> getPersons() {
		return persons;
	}

	public static void setPersons(List<PersonsModel> persons) {
		CompositeModel.persons = persons;
	}

	public static List<MedicalrecordsModel> getMedicalrecords() {
		return medicalrecords;
	}

	public static void setMedicalrecords(List<MedicalrecordsModel> medicalrecords) {
		CompositeModel.medicalrecords = medicalrecords;
	}

	public static List<FirestationsModel> getFirestations() {
		return firestations;
	}

	public static void setFirestations(List<FirestationsModel> firestations) {
		CompositeModel.firestations = firestations;
	}
	
	
}
