package com.location26.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.location26.dto.LocationData;
import com.location26.entities.Location;
import com.location26.services.LocationService;
import com.location26.utility.EmailService;

@Controller
public class Locationcontroller {
	
	@Autowired
	private LocationService locationservice;
	
	@Autowired
	private EmailService emailSender;
	
	//handler method
	@RequestMapping("/show")
     public String ShowLocationPage() {
    	 return "Create_Location";
	}
	
	//handler method
//@RequestMapping("/savelocation")
//	public String  savelocation(Location location) {
//	locationservice.savelocation(location);
//		return "Create_Location";
//		
//	}
	@RequestMapping("/savelocation")
	public String  savelocation(LocationData loc,ModelMap model) {
	Location location=new Location();
	location.setId(loc.getId());
	location.setName(loc.getName());
	location.setCode(loc.getCodes());
	location.setType(loc.getType());
	model.addAttribute("msg","Location is save");
	locationservice.savelocation(location);
	emailSender.sendSimpleMessage("Rahuldon4533@gmail.com", "test", "fuck you man");
		return "Create_Location";
		
	}
	@RequestMapping("/listall")
	public String listall(ModelMap  model) {
		List<Location> locations = locationservice.getalllocations();
		model.addAttribute("locations",locations);
		return  "search_result";
	}
	
	@RequestMapping("/delete")
	public String deleteLocation(@RequestParam("id") long id,ModelMap model) {
		locationservice.deleteLocationById(id);
		List<Location> locations = locationservice.getalllocations();
		model.addAttribute("locations",locations);
		return  "search_result";
		
	}
	@RequestMapping("/update")
	public String UpdateLocation(@RequestParam("id") long id,ModelMap model) {
		Location location = locationservice.getlocationById(id);
		model.addAttribute("location",location);
		return "Update_Location";
		
	}
	@RequestMapping("/updateData")
	public String  updateLocationData(@ModelAttribute("loc")    Location location,ModelMap model) {
	locationservice.savelocation(location);
	model.addAttribute("msg","location is updated");
	return "Update_Location";

}
	
	
}
