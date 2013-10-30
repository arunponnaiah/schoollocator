package com.schoollocator.webclient;

import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.schoollocator.model.GooglePlaceNearBySearchResults;
import com.schoollocator.model.GooglePlacesNearBySearchResponse;
import com.schoollocator.model.School;
import com.schoollocator.util.GooglePlacesUrl;

public class GooglePlacesWebclient {
	public Gson gson;
	
	public GooglePlacesWebclient(){
		this.gson = new Gson();
	}
	
	public List<School> nearBySearch(String keyword,String location, int miles) throws Exception{
		double radius = (miles * 1609.3);
		keyword = keyword.replace(" ", "");
		String url = new GooglePlacesUrl.Builder().keyword(keyword).location(location).radius(radius).build().toString();
		URL google = new URL(url);
		HttpURLConnection connection = (HttpURLConnection) google.openConnection();
		connection.setDoOutput(true);
		Reader reader = new InputStreamReader(connection.getInputStream());
		GooglePlacesNearBySearchResponse googlePlacesNearBySearchResponse = this.gson.fromJson(reader, GooglePlacesNearBySearchResponse.class);
		GooglePlaceNearBySearchResults results[] = googlePlacesNearBySearchResponse.getResults();
		System.out.println(results.length);
		List<School> schools = new ArrayList<School>();
		
		for(GooglePlaceNearBySearchResults result: results){
			School school = new School();
			school.setName(result.getName());
			schools.add(school);
		}
		return schools;
		
	}
}

