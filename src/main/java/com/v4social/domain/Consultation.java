package com.v4social.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Consultation implements Serializable {
    @Id
    @GeneratedValue
    private Integer code;

    @Column
    private String name;

    @Column(length=2000)
    private String description;
    
    @Column
    private Date dateIni;
    
    @Column
    private Date dateEnd;
             
	public Consultation(String name, String description, Date dateIni, Date dateEnd) {
		this.name = name;
		this.description = description;
		this.dateIni = dateIni;
		this.dateEnd = dateEnd;
	}
	
	protected Consultation() {		
	}
	
	public Integer getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateIni() {
		return dateIni;
	}

	public void setDateIni(Date dateIni) {
		this.dateIni = dateIni;
	}

	public Date getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}
	
	@Override
	public String toString() {
		return 	"Consultation{" +
				"code: " + code + '\'' +
				"name: " + name + '\'' +
				"description: " + description +
				'}';
	}
	
	@Override
	public boolean equals (Object o) {
		if (this == o) return true;
		if (o==null || getClass()!=o.getClass()) return false;
		Consultation consultation = (Consultation) o;
		return 	Objects.equals(code, consultation.code) &&
				Objects.equals(name, consultation.name) &&
				Objects.equals(description, consultation.description);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(code, name, description, dateIni, dateEnd);
	}
       
}
