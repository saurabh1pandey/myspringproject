package Skp.demo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import Skp.demo.model.Customers;
import Skp.demo.repository.Acountrepo;
import Skp.demo.repository.BkCustomersrepo;

@Service
public class Customerservice {

	@Autowired
	BkCustomersrepo bkCustomersrepo;

	@Autowired
	Acountrepo acountrepo;

	public ResponseEntity<Object> createCustomer(Customers model) {
		if (bkCustomersrepo.findByName(model.getC_name()).isPresent()) {
			return ResponseEntity.badRequest().body("this customer is already preent");
		} else {
			Customers newcst = bkCustomersrepo.findById(model.getCr_id()).get();
			newcst.setC_name(model.getC_name());
			newcst.setC_mobno(model.getC_mobno());
			newcst.setEmail_id(model.getEmail_id());
			newcst.setAccount(model.getAccount());
			Customers savecust = bkCustomersrepo.save(newcst);
			if (bkCustomersrepo.findById(savecust.getCr_id()).isPresent())
				return ResponseEntity.ok("customer created succesfully");
			else
				return ResponseEntity.unprocessableEntity().body("Failed to create customer");

		}

	}

//For Update Customers
	@Transactional
	public ResponseEntity<Object> updatecustomer(Customers cust, int id) {
		if (bkCustomersrepo.findById(id).isPresent()) {
			Customers newusr = bkCustomersrepo.findById(id).get();
			newusr.setC_name(cust.getC_name());
			newusr.setC_mobno(cust.getC_mobno());
			newusr.setEmail_id(cust.getEmail_id());
			newusr.setAccount(cust.getAccount());
			Customers upadateuser = bkCustomersrepo.save(newusr);
			if (bkCustomersrepo.findById(upadateuser.getCr_id()).isPresent())
				return ResponseEntity.ok("update succesfully");
			else
				return ResponseEntity.unprocessableEntity().body("Failed T0 updating");

		} else
			return ResponseEntity.unprocessableEntity().body("failed to update customer specified");

	}

//For Delete Customers
	public ResponseEntity<Object> deletecustomer(int id) {
		if (bkCustomersrepo.findById(id).isPresent()) {
			bkCustomersrepo.deleteById(id);
			if (bkCustomersrepo.findById(id).isPresent())
				return ResponseEntity.unprocessableEntity().body("Failed to Delete");
			else
				return ResponseEntity.ok("Deleted successfuly");

		} else
			return ResponseEntity.unprocessableEntity().body("Failed to Delete specified Customer");

	}

}