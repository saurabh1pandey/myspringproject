package Skp.demo.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import Skp.demo.model.Accounts;
import Skp.demo.model.Customers;
import Skp.demo.repository.Acountrepo;
import Skp.demo.repository.BkCustomersrepo;
import Skp.demo.repository.customerrepo;
import javassist.expr.NewArray;

@Service
public class Acctservice {

	@Autowired
	Acountrepo acountrepo;
	@Autowired
	BkCustomersrepo bkCustomersrepo;

	@Transactional

	public ResponseEntity<Object> createAct(Accounts act) {
		Accounts ac = new Accounts();
		ac.setAcc_no(act.getAcc_no());
		ac.setIfsc_code(act.getIfsc_code());
		ac.setBal(act.getBal());
		ac.setDeposit(act.getWithdraw());
		List<Accounts> acct = new ArrayList<Accounts>();
		acct.add(ac);

		for (int i = 0; i < act.getCustomers().size(); i++) {

			if (!bkCustomersrepo.findByName(act.getCustomers().get(i).getC_name()).isPresent()) {
				Customers newact = act.getCustomers().get(i);
				newact.setAccount(acct);
				Customers savedact = bkCustomersrepo.save(newact);
				if (!bkCustomersrepo.findById(savedact.getCr_id()).isPresent())
					return ResponseEntity.unprocessableEntity().body("Account creation failed");

			} else
				return ResponseEntity.unprocessableEntity().body("This customer is already present");
		}
		return ResponseEntity.ok("Account created Successfully");

	}
//For Update 

}
