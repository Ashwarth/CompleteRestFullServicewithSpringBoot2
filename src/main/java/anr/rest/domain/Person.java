package anr.rest.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import lombok.Data;

@Data
@Entity
@Table(name = "PERSON")
public class Person {
	@Id
	@GeneratedValue
	private Integer pID;
	
	@Column(name ="FIRST_NAME")
	private String firstName;
	
	@Column(name ="LAST_NAME")
	private String lastName;
	
	@Column(name ="MOBILE_NUMBER")
	private String mobileNumber;

}
