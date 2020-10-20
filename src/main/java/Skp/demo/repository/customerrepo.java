package Skp.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Skp.demo.Entity.Customer;

public interface customerrepo extends JpaRepository<Customer, Integer> {
	

}
