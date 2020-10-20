package Skp.demo.model;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
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
public class Branch {

@Id
int brnh_id;
String name;
String location;

//@OneToMany(targetEntity = Accounts.class,cascade = CascadeType.ALL)
//@JoinColumn(name="acc_fk", referencedColumnName = "brnch_id")
  //List<Accounts> account;


}
