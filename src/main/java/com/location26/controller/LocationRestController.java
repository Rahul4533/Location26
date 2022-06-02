package com.location26.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.location26.entities.Location;
import com.location26.repository.LocationRepository;

@RestController
@RequestMapping("/location/api")
public class LocationRestController {
	
	@Autowired
	private LocationRepository locationrepo;
	
	@GetMapping
	public List<Location> getLocations(){
		List<Location> locations=locationrepo.findAll();
		return locations;
		
	}
	
	@PostMapping
	public void savelocation(@RequestBody Location location) {
		locationrepo.save(location);
	}
	
	@PutMapping
	public void updatelocation(@RequestBody Location location) {
		locationrepo.save(location);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deletelocation(@PathVariable("id") long id) {
		locationrepo.deleteById(id);
	}
	@GetMapping("/get/{id}")
	public Location getLoctionById(@PathVariable("id") long id) {
		try {
			Optional<Location> findById = locationrepo.findById(id);
			Location location = findById.get();
			return location;
		} catch (Exception e) {
          e.printStackTrace();
		}
		return null;
	}

}
