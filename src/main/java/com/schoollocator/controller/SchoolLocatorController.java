package com.schoollocator.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.schoollocator.model.School;
import com.schoollocator.webclient.GoogleGeocodeWebclient;
import com.schoollocator.webclient.GooglePlacesWebclient;

@Controller
public class SchoolLocatorController {

    @RequestMapping("/home")
    public String home() {
        return "home";
    }

    @RequestMapping("/nearBySearch")
    public String nearBySearch(String keyword,int radius,int zipcode,Map<String, Object> map) {
    	GoogleGeocodeWebclient googleGeocodeWebclient = new GoogleGeocodeWebclient();
    	String location;
		try {
			location = googleGeocodeWebclient.getPlaceLocation(zipcode);
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
    	GooglePlacesWebclient googlePlacesWebclient = new GooglePlacesWebclient();
    	List<School> schools=null;
		try {
			schools = googlePlacesWebclient.nearBySearch(keyword, location, radius);
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		System.out.println(" No of schools : "+schools.size());
		System.out.println("############## SCHOOLS #################");
		for(School school:schools){
			System.out.println(school.getName());
		}
		
    	map.put("schools",schools);
    	return "nearBySchools";
    }
    
    /*
    
    @RequestMapping("/people")
    public String listPeople(Map<String, Object> map) {

        map.put("person", new Person());
        map.put("peopleList", personService.listPeople());

        return "people";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addPerson(@ModelAttribute("person") Person person, BindingResult result) {

        personService.addPerson(person);

        return "redirect:/people/";
    }

    @RequestMapping("/delete/{personId}")
    public String deletePerson(@PathVariable("personId") Integer personId) {

        personService.removePerson(personId);

        return "redirect:/people/";
    }*/
}
