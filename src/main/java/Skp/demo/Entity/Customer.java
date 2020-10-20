package Skp.demo.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table (name="customer")
public class Customer {
	
	@Id
	@GeneratedValue
	
	private int C_id;
	@Column(name="cus_name")
	private String c_name;
	@Column(name="cus_email")
	private String c_email;
	@Column(name="mob_no")
	private String mob_no;
	@OneToMany (targetEntity = Products.class, cascade = CascadeType.ALL )
	@JoinColumn(name = "cf_id", referencedColumnName = "C_id")
	List<Products> order;
	
	
}
