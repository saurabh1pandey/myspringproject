package Skp.demo.controler;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;
import javax.websocket.Session;

import org.hibernate.SessionFactory;
import org.hibernate.mapping.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Skp.demo.DTo.Bankdao;
import Skp.demo.model.Bank;
import Skp.demo.model.Branch;
import Skp.demo.repository.Bankrepo;
import Skp.demo.repository.Branchrepo;

@RestController
public class Bankcontroler {
	@Autowired
	Bankrepo bankrepo;
	@Autowired
	Branchrepo branchrepo;

/*	@RequestMapping("/insertdata")
	public void setbankdetl() {
		List<Branch> br1 = new ArrayList<Branch>();
		List<Branch> br2 = new ArrayList<Branch>();
		br1.add(new Branch(120,"Bob_noida", "noida73"));
		br1.add(new Branch(130, "bob_delhi", "new ashoknagar"));
		br2.add(new Branch(140, "icici_noida", "noida73"));
		br2.add(new Branch(150, "icici_delhi", "new ashoknagar"));
		Bank bk = new Bank();
		bk.setName("bob");
		bk.setRegion("India");
		bk.setBranch(br1);
		Bank bk1 = new Bank();
		bk1.setName("ICIC");
		bk1.setRegion("India");
		bk1.setBranch(br2);
		//Bankdao bank = new Bankdao();
	     // bank.setBank(bk1);
	     // bank.setBank(bk2);
	      
		bankrepo.saveAll(Stream.of(bk1).collect(Collectors.toList()));
		
	}*/

	@GetMapping("/getdata")
	public List<Bank> getdata() {
		return bankrepo.findAll();

	}
@PostMapping("/postdata")
 public Bank setdata(@RequestBody Bankdao bkdao) {
	return bankrepo.save(bkdao.getBank());
	
}
}
