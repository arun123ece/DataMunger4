package com.stackroute.datamunger.query;

//this class contains the data type definitions
public class DataTypeDefinitions {
	String[] dataTypes;

	public DataTypeDefinitions(String[] dataTypes) {
		super();
		this.dataTypes = dataTypes;
	}

	public void setDataTypes(String[] dataTypes) {
		this.dataTypes = dataTypes;
	}

	/*
	 * this class should contain a member variable which is a String array, to hold
	 * the data type for all columns for all data types and should override toString() method as well.
	 */	
	public String[] getDataTypes() {
		return dataTypes;
	}


}