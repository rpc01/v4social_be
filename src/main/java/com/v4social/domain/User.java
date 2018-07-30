package com.v4social.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;


@Entity
public class User {
    @Id
    private int code;

    @Column
    private String firstname;
    
    @Column
    private String surname;
    
    @Column
    private String email;
    
    @Column
    private String phone;
    
    @Column
    private String password;
    
    protected User() {
    }

	public User(String firstname, String surname, String email, String phone, String password) {
		super();	
		this.firstname = firstname;
		this.surname = surname;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUserCode() {
		return code;
	}
        
}
