package com.schoollocator.model;

import java.util.List;

public class NearBySchoolsResponse {
	private String status;
	private List<School> schools;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<School> getSchools() {
		return schools;
	}
	public void setSchools(List<School> schools) {
		this.schools = schools;
	}
	
	
}
