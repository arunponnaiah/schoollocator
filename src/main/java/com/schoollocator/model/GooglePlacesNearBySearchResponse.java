package com.schoollocator.model;



public class GooglePlacesNearBySearchResponse {
	private String status;
	private GooglePlaceNearBySearchResults results[];
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public GooglePlaceNearBySearchResults[] getResults() {
		return results;
	}
	public void setResults(GooglePlaceNearBySearchResults[] results) {
		this.results = results;
	}

	
	
}
