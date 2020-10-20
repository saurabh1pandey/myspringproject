package Skp.demo.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

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
@JsonIdentityInfo(

        generator = ObjectIdGenerators.PropertyGenerator.class,

        property = "acc_id")
public class Accounts {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
    private int acc_id;
    private long acc_no;
    
    private String ifsc_code;
    private long bal;
    private long withdraw;
    private long deposit;
    @ManyToMany(mappedBy = "account" ,targetEntity = Customers.class,cascade = CascadeType.ALL)
   // @JoinColumn(name="ac_fk", referencedColumnName = "acc_id")
    
    List<Customers> customers;
    
   
    
    
}
