package Skp.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Skp.demo.Entity.Products;

public interface productrepo extends JpaRepository<Products, Integer> {

}
