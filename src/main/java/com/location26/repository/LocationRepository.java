package com.location26.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.location26.entities.Location;
@Repository
public interface LocationRepository extends JpaRepository<Location,Long> {

 
}
