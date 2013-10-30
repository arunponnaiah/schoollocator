package com.schoollocator.util;

public class GooglePlacesUrl {
	private String keyword;
	private String location;
	private double radius;
	
	private static String googlePlaceBaseUrl
		="https://maps.googleapis.com/maps/api/place/nearbysearch/json?type=school&sensor=false&key=AIzaSyCPQaOZZ6HRn9z77l5u58VtuaV-Uzcjd-c";

	private GooglePlacesUrl(String keyword,String location,double radius){
		this.keyword=keyword;
		this.location = location;
		this.radius = radius;
	}
	public static class Builder{
		private String keyword;
		private String location;
		private double radius;
		
		public Builder keyword(String keyword){
			this.keyword = keyword;
			return this;
		}
		
		public Builder location(String location){
			this.location = location;
			return this;
		}
		
		public Builder radius(double radius){
			this.radius = radius;
			return this;
		}
		
		public GooglePlacesUrl build(){
			return new GooglePlacesUrl(this.keyword,this.location,this.radius);
		}
	}
	
	public String toString(){
		return googlePlaceBaseUrl+"&keyword="+this.keyword+"&location="+this.location+"&radius="+this.radius;
	}
}
