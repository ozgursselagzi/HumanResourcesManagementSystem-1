package kodlamaio.HRMS.entities.Concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Departments")
public class Department {
	
	@Id
	@GeneratedValue
	
	@Column(name="Id")
	private int id;
	
	@Column(name="Details")
	private String details;
	
	public Department() {
	}
	
	public Department(int id, String details) {
		super();
		this.id = id;
		this.details = details;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	
	

}
