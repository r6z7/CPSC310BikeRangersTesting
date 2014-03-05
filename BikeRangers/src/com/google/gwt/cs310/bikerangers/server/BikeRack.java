package com.google.gwt.cs310.bikerangers.server;

public class BikeRack {

	private int streetNum;
	private String streetName;
	private String streetSide;
	private String skytrainStationName;
	private String bia;
	private int numOfRacks;

	public BikeRack(){

	}

	public BikeRack(int streetNum, String streetName, String streetSide, String skytrainStationName, String bia, int numOfRacks){
		this.streetNum=streetNum;
		this.streetName=streetName;
		this.streetSide=streetSide;
		this.skytrainStationName=skytrainStationName;
		this.bia=bia;
		this.numOfRacks=numOfRacks;
	}

	public int getStreetNum(){
		return streetNum;
	}

	public String getStreetName(){
		return streetName;
	}

	public String getStreetSide(){
		return streetSide;
	}
	public String getSkyTrainStationName(){
		return skytrainStationName;
	}
	public String getBIA(){
		return bia;
	}
	public int getNumOfRacks(){
		return numOfRacks;
	}
}
