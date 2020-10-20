package Skp.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Skp.demo.model.Customers;

public interface BkCustomersrepo extends JpaRepository<Customers, Integer> {

}
