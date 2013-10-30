package com.schoollocator.util;


public class GoogleGeocodeUrl {
	private int zipcode;
	private static String googleGeocodeBaseUrl = "http://maps.googleapis.com/maps/api/geocode/json?sensor=false&address=";
	
	private GoogleGeocodeUrl(int zipcode){
		this.zipcode = zipcode;
	}
	public static class Builder{
		private int zipcode;
		
		public Builder zipcode(int zipcode){
			this.zipcode = zipcode;
			return this;
		}

		public GoogleGeocodeUrl build() {
			return new GoogleGeocodeUrl(zipcode);
		}
	}
	
	@Override
	public String toString() {
		return googleGeocodeBaseUrl+zipcode;
	}
}
