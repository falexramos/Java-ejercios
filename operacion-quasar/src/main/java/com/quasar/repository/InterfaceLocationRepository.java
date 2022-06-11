package com.quasar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.quasar.entity.Satelite;
@Repository
public interface InterfaceLocationRepository extends JpaRepository<Satelite, Integer> {
	
	@Query("Select c from Satelite c where c.nombreSatelite = ?1")
	List<Satelite> findByName(String sateliteName);

}
