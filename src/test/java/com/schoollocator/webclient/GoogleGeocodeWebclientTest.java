package com.schoollocator.webclient;


import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.schoollocator.webclient.GoogleGeocodeWebclient;

public class GoogleGeocodeWebclientTest{
	private GoogleGeocodeWebclient googleGeocodeWebclient;
	private int zipCode;
	
	@Before
	public void setUp() throws Exception {
		this.googleGeocodeWebclient = new GoogleGeocodeWebclient();
		this.zipCode=11753;
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testGetPlaceLocation() throws Exception{
		String location= this.googleGeocodeWebclient.getPlaceLocation(zipCode);
		assertNotNull(location);
	}
	
}
