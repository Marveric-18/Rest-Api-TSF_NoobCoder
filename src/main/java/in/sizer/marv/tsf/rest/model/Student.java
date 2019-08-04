package in.sizer.marv.tsf.rest.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="StudentInfo")
@EntityListeners(AuditingEntityListener.class)

public class Student implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)//oko
	private Long enrollId;
	
	@NotBlank
	private String firstName;
	
	@NotBlank
	private String lastName;
	
	@NotBlank
	private String department;
	
	@NotBlank
	private String city;
	
	@NotBlank
	private String pinCode;
	
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date dateofCreated;

	
	public Long getEnrollId() {
		return enrollId;
	}


	public void setEnrollId(Long enrollId) {
		this.enrollId = enrollId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getPinCode() {
		return pinCode;
	}


	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}


	public Date getDateofCreated() {
		return dateofCreated;
	}


	public void setDateofCreated(Date dateofCreated) {
		this.dateofCreated = dateofCreated;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Student [enrollId=" + enrollId + ", firstName=" + firstName + ", lastName=" + lastName + ", department="
				+ department + ", city=" + city + ", pinCode=" + pinCode + ", dateofCreated=" + dateofCreated + "]";
	}
	
	
}
