package com.schoollocator.dao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.schoollocator.dao.GooglePlacesClient;

public class GooglePlacesClientTest {
	private GooglePlacesClient googlePlacesClient;
	private String location;
	private int zipCode;
	private int miles;
	private int radius;
	private String keyword;
	private enum GoogleResponseStatus{OK};
	
	@Before
	public void setUp() throws Exception {
		this.googlePlacesClient = new GooglePlacesClient();
		this.zipCode=11753;
		this.miles=5;
		this.radius=5*1609.3; // radius in meters
		this.keyword="elementry";
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testGetLatLng(){
		this.location = this.googlePlacesClient.getLatLng(zipCode);
	}
	
	@Test
	public void testSearchNearBySchools() {
		String status = this.googlePlacesClient.searchNearBySchools(this.keyword,this.location,this.radius);
		if(status=GoogleResponseStatus.OK){
		}
	}

}
