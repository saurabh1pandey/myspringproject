package Skp.demo.controler;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Skp.demo.DTo.Orderrequest;
import Skp.demo.Entity.Customer;
import Skp.demo.Entity.Products;
import Skp.demo.repository.customerrepo;
import Skp.demo.repository.productrepo;

@RestController
public class customercontroler {
	@Autowired
	productrepo prorep;
	@Autowired
	customerrepo cusrepo;
	//@Autowired
	//Customer customer;
	//@Autowired
	//Products product;
	//@Autowired
	//Orderrequest ordreq;
	
	
	/*@GetMapping("/getorder")
	public Customer getorder() {
		
		customer.setC_name("saurabh");
		customer.setC_email("abx@gmail.com");
		
		List<Products> prod = new ArrayList<>();
		product.setOrder_id(001);
		product.setProduct_id("pc");
		product.setProdut_name("lappy");
		product.setPrice(100);
		prod.add(product);
		customer.setOrder(prod);
		if(customer!= null) {
        return cusrepo.save(customer) ;
		}else {
			System.out.println("Data not populated");
		}
		return customer;
		
	}	
	*/
@PostMapping("/placorder")
           public Customer placeorder(@RequestBody Orderrequest orderreq) {
			return cusrepo.save(orderreq.getCustomer()) ;
			//SessionFactory sf =
	
	
	
}
@GetMapping("/allorder")
         public List<Customer> getallorders(){
	 
	        return cusrepo.findAll();
}        
@GetMapping("/getorders")
  public List<Products> getorders(){
	return prorep.findAll();
			
}


@GetMapping("getorderById/{id}")
           public Optional<Customer> getorderById(@PathVariable(value="id") int id ){
	      
	    		return cusrepo.findById(id);
	
}

	}
	