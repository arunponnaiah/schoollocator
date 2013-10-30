package com.schoollocator.util;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GoogleGeocodeUrlTest {
	private int zipcode;
	
	@Before
	public void setUp() throws Exception {
		this.zipcode=11753;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBuild() {
		 String googleGeocodeUrl= new GoogleGeocodeUrl.Builder().zipcode(zipcode).build().toString();
		System.out.println(googleGeocodeUrl);
		Assert.assertNotNull(googleGeocodeUrl);
	}

}
