package Skp.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Skp.demo.model.Accounts;
import Skp.demo.model.Branch;
import Skp.demo.model.Customers;
import Skp.demo.repository.Acountrepo;
import Skp.demo.repository.BkCustomersrepo;
import Skp.demo.repository.Branchrepo;
import Skp.demo.repository.customerrepo;

@RestController
public class Accountcontroler {
	@Autowired
	Acountrepo  accountrepo;
	@Autowired
	BkCustomersrepo customerepo;
	
	
	@PostMapping("/insertcustomer")
	public Customers insertbranch(@RequestBody Customers cust) {
		return  customerepo.save(cust);
		
		
		
	}
	@PostMapping("/insertacct")
	public Accounts setaccont(@RequestBody Accounts acount) {
	  return accountrepo.save(acount);
	}
	
	@GetMapping("/getaccounts")
	public List<Customers> getact(){
		
		return customerepo.findAll();
	}
	

}
