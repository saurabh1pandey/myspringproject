package Skp.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Skp.demo.model.Bank;

public interface Bankrepo extends JpaRepository<Bank, Integer> {

}
