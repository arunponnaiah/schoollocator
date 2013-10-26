package com.schoollocator.webclient;

import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;
import com.schoollocator.model.GoogleGeocodeResponse;
import com.schoollocator.model.Location;

public class GoogleGeocodeServiceClient {

	private Gson gson;
	
	public GoogleGeocodeServiceClient() {
		this.gson = new Gson();
	}
	
	public String getPlaceLocation(int zipCode) throws Exception {
		String geocodeUrl = "http://maps.googleapis.com/maps/api/geocode/json?address=11753&sensor=false";
		URL google = new URL(geocodeUrl);
		HttpURLConnection connection = (HttpURLConnection) google.openConnection();
		connection.setDoOutput(true);
		Reader reader = new InputStreamReader(connection.getInputStream());
		GoogleGeocodeResponse googleGeocodeResponse = this.gson.fromJson(reader, GoogleGeocodeResponse.class);
		Location location = googleGeocodeResponse.getResults()[0].getGeometry().getLocation();
		String latLng = location.getLat()+","+location.getLng();
		System.out.println(latLng);
		return latLng;
	}

}
