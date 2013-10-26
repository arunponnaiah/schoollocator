package com.schoollocator.webclient;


import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.schoollocator.webclient.GoogleGeocodeServiceClient;

public class GoogleGeocodeClientTest{
	private GoogleGeocodeServiceClient googleGeocodeServiceClient;
	private int zipCode;
	
	@Before
	public void setUp() throws Exception {
		this.googleGeocodeServiceClient = new GoogleGeocodeServiceClient();
		this.zipCode=11753;
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testGetPlaceLocation() throws Exception{
		String location= this.googleGeocodeServiceClient.getPlaceLocation(zipCode);
		assertNotNull(location);
	}
	
}
