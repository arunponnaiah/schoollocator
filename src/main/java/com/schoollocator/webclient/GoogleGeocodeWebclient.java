package com.schoollocator.webclient;

import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;
import com.schoollocator.model.GoogleGeocodeResponse;
import com.schoollocator.model.Location;
import com.schoollocator.util.GoogleGeocodeUrl;

public class GoogleGeocodeWebclient {

	private Gson gson;
	
	public GoogleGeocodeWebclient() {
		this.gson = new Gson();
	}
	
	public String getPlaceLocation(int zipcode) throws Exception {
		String geocodeUrl = new GoogleGeocodeUrl.Builder().zipcode(zipcode).build().toString();
		URL url = new URL(geocodeUrl);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setDoOutput(true);
		Reader reader = new InputStreamReader(connection.getInputStream());
		GoogleGeocodeResponse googleGeocodeResponse = this.gson.fromJson(reader, GoogleGeocodeResponse.class);
		Location location = googleGeocodeResponse.getResults()[0].getGeometry().getLocation();
		String latLng = location.getLat()+","+location.getLng();
		System.out.println(latLng);
		return latLng;
	}

}
