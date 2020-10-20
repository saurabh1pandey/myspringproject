package Skp.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="Products")
public class Products {
	@Id
	@Column(name="order_id")
	private  int order_id;
	@Column(name="product_id")
	private String product_id;
	@Column(name="Produt_name")
	private String Produt_name;
	@Column(name="Price")
	private long price;
	
	

}
