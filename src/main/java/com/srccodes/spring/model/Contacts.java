package com.srccodes.spring.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Contacts {
	   private Integer contactID;
	   private String firstName;
	   private String lastName;
	   private String email;
	   private String phone;
    
	   public String toString() {
    	   
    	   return "toString called from Contacts :- " + firstName + ":" + lastName + ":" + email + ":" + phone;
       }
	   public String getPhone() {
		return phone;
	   }
	   public void setPhone(String phone) {
		   this.phone = phone;
	   }
	   public void setContactID(Integer contactID) {
	      this.contactID = contactID;
	   }
	   @Id
	   @GeneratedValue
	   public Integer getContactID() {
	      return contactID;
	   }

	   public void setFirstName(String firstName) {
	      this.firstName = firstName;
	   }
	   public String getFirstName() {
		      return firstName;
	   }
	   public void setLastName(String lastName) {
		      this.lastName = lastName;
	   }
	   public String getLastName() {
	      return lastName;
	   }

	   public void setEmail(String email) {
	      this.email = email;
	   }
	   public String getEmail() {
	      return email;
	   }
	}