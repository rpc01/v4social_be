package com.v4social.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.net.URL;

@Entity
public class Organization implements Serializable {
    @Id
    @GeneratedValue
    private Integer code;

    @Column
    private String name;
    
    @Column
    private URL logo;
        
    @Column
    private String email;
    
    @Column
    private String phone;
        
    @Column
    private String password;
    
    protected Organization() {
    }

	public Organization(Integer code, String name, URL logo, String email, String phone, String password) {
		this.code = code;
		this.name = name;
		this.logo = logo;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public URL getLogo() {
		return logo;
	}

	public void setLogo(URL logo) {
		this.logo = logo;
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

	public Integer getCode() {
		return code;
	}
	
	@Override
	public boolean equals (Object o) {
		if (this == o) return true;
		if (o==null || getClass()!=o.getClass()) return false;
		Organization organization = (Organization) o;
		return 	Objects.equals(code, organization.code) &&
				Objects.equals(name, organization.name);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(code, name);
	}
	
    
    
}
