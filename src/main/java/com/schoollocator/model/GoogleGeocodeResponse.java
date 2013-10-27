package com.schoollocator.model;

import java.util.Arrays;


public class GoogleGeocodeResponse {
	private String status;
	private GoogleGeocodeResults results[];
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public GoogleGeocodeResults[] getResults() {
		return results;
	}
	public void setResults(GoogleGeocodeResults[] results) {
		this.results = results;
	}
	@Override
	public String toString() {
		return "GooglePlacesNearBySearchResponse [status=" + status + ", results="
				+ Arrays.toString(results) + "]";
	}
}
