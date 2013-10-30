package com.schoollocator.util;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GooglePlacesUrlTest {
	private String keyword;
	private String location;
	private double radius;
	
	@Before
	public void setUp() throws Exception {
		this.keyword="Middle School";
		this.location="40.78530840000001,-73.54174399999999";
		this.radius=8046.5; // 5 miles = 8046.5 meters
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBuild() {
		GooglePlacesUrl googlePlacesUrl = new GooglePlacesUrl.Builder().keyword(keyword).location(location).radius(radius).build();
		Assert.assertNotNull(googlePlacesUrl);
	}

}
