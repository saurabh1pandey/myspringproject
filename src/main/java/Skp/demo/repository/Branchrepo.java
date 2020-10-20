package Skp.demo.repository;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;

import org.springframework.data.jpa.repository.JpaRepository;

import Skp.demo.model.Branch;
import ch.qos.logback.core.Context;

public interface Branchrepo  extends JpaRepository<Branch, Integer>{
	

}
