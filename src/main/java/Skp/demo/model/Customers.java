package Skp.demo.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "cr_id")
public class Customers {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cr_id;
	private String C_name;
	private String C_mobno;
	private String Email_id;
	@ManyToMany(targetEntity = Accounts.class, cascade = CascadeType.ALL)
	//@JoinColumn(name = "cr_fk", referencedColumnName = "cr_id")
	//@JoinTable(name="cust-acounts", joinColumns=@JoinColumn(name="cr_id", referencedColumnName  = "cr_id")
 //  , inverseJoinColumns=@JoinColumn(name="acc_id",referencedColumnName = "acc_id"))
	List<Accounts> account;

}
