package com.schoollocator.webclient;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.schoollocator.model.School;

public class GooglePlacesWebclientTest {
	
	private GooglePlacesWebclient googlePlacesWebclient;
	private String keyword;
	private String location;
	private int miles;
	
	@Before
	public void setUp() throws Exception {
		this.googlePlacesWebclient = new GooglePlacesWebclient();
		this.keyword="school";
		this.location="40.78530840000001,-73.54174399999999";
		this.miles=5;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testNearBySearch() throws Exception {
		List<School> schools = this.googlePlacesWebclient.nearBySearch(keyword, location, miles);
		assertNotNull(schools);
	}

}
