package com.v4social.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
public class Consultation {
    @Id
    private int code;

    @Column
    private String name;

    @Column
    private String description;
    
    @Column
    private Date dateIni;
    
    @Column
    private Date dateEnd;

	public Consultation(String name, String description, Date dateIni, Date dateEnd) {
		super();
		this.name = name;
		this.description = description;
		this.dateIni = dateIni;
		this.dateEnd = dateEnd;
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

	public int getCode() {
		return code;
	}
       
    
}
