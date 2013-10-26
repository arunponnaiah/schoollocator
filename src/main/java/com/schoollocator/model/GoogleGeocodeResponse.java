package com.schoollocator.model;

import java.util.Arrays;


public class GoogleGeocodeResponse {
	private String status;
	private Results results[];
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Results[] getResults() {
		return results;
	}
	public void setResults(Results[] results) {
		this.results = results;
	}
	@Override
	public String toString() {
		return "GoogleGeocodeResponse [status=" + status + ", results="
				+ Arrays.toString(results) + "]";
	}
}
