package com.schoollocator.dao;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.schoollocator.model.NearBySchoolsResponse;

public class GooglePlacesClientTest{
	private WebClient webClient;
	private String location;
	private int zipCode;
	private int miles;
	private int radius;
	private String keyword;
	private enum ResponseStatus{OK};
	
	@Before
	public void setUp() throws Exception {
		this.webClient = new WebClient();
		this.zipCode=11753;
		this.miles=5;
		this.radius=5000; // radius in meters
		this.keyword="elementry";
		this.location="40.78530840000001,-73.54174399999999"; //jericho,NY location
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testGetLatLng(){
		String location= this.webClient.getLocation(zipCode);
		assertNotNull(location);
	}
	
	@Test
	public void testSearchNearBySchools() {
		NearBySchoolsResponse nearBySchoolsResponse
			= this.webClient.searchNearBySchools(this.keyword,this.location,this.radius);
		assertEquals(ResponseStatus.OK, nearBySchoolsResponse.getStatus());
		
	}

}
