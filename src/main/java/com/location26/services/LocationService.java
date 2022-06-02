package com.location26.services;

import java.util.List;


import org.springframework.stereotype.Service;

import com.location26.entities.Location;



@Service
public interface LocationService {
public void savelocation(Location location);

public List<Location> getalllocations();

public void deleteLocationById(long id);


public Location getlocationById(long id);


}
