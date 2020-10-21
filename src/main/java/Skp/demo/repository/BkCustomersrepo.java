package Skp.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import Skp.demo.model.Customers;

public interface BkCustomersrepo extends JpaRepository<Customers, Integer> {
	
	Optional<Customers>findByName(String name);

}
