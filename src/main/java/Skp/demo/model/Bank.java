package Skp.demo.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Bank implements Serializable{
	@Id
	@GeneratedValue
	@Column(name="bank_id")
	int id;
	String Name;
	String region;
	@OneToMany( targetEntity = Branch.class,cascade = CascadeType.ALL)
	@JoinColumn(name="br_id_fkey", referencedColumnName = "bank_id")
	List<Branch> branch;
	

}
