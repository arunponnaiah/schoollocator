package com.schoollocator.model;


public class Results {
    private Geometry geometry;

	public Geometry getGeometry() {
		return geometry;
	}

	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}

	@Override
	public String toString() {
		return "Results [geometry=" + geometry + "]";
	}
    
}
