package org.japayments.model;

import java.util.Calendar;
/**
 * 
 * @author Joaquin Pega
 *
 */
public class Alumno {
	private String firstName;
	private String lastName;
	private Calendar birthDate;
	private Integer dni;
	private String contactNumber;
	private String contactName;
	private Cinto cinto;
	public Alumno() {
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

	public Calendar getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Calendar birthDate) {
		this.birthDate = birthDate;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}
	
	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	
	
	public Cinto getCinto() {
		return cinto;
	}

	public void setCinto(Cinto cinto) {
		this.cinto = cinto;
	}

	@Override
	public boolean equals(Object arg0) {
		if(arg0==null) return false;
		if(!(arg0 instanceof Alumno))return false;
		return this.dni.equals(((Alumno)arg0).getDni());
	}
	
	
	
}
