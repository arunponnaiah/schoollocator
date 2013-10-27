package com.schoollocator.model;


public class GoogleGeocodeResults {
    private Geometry geometry;

	public Geometry getGeometry() {
		return geometry;
	}

	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}

	@Override
	public String toString() {
		return "GoogleGeocodeResults [geometry=" + geometry + "]";
	}
    
}
