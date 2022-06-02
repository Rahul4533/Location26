package com.location26.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.location26.entities.Location;
import com.location26.repository.LocationRepository;
@Service
public class LocationServiceimpl implements LocationService {
	@Autowired
	private LocationRepository locationrepo;

	@Override
	public void savelocation(Location location) {
		locationrepo.save(location);

	}

	@Override
	public List<Location> getalllocations() {
         List<Location> locations = locationrepo.findAll();
		return locations;
	}

	@Override
	public void deleteLocationById(long id) {
		locationrepo.deleteById(id);
		
		
	}

	@Override
	public Location getlocationById(long id) {
		 Optional<Location> findById = locationrepo.findById(id);
		 Location location = findById.get();
		 return location;
	}


	

}
