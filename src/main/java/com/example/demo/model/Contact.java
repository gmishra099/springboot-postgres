package com.example.demo.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Builder
@Table(name = "contact")
public class Contact {
	@Id
	private String contactId;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "phone")
	private String phone;
	@Column(name = "SFID")
	private String SFID;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SF", referencedColumnName = "SFID")
	private Individual individual;
	

}
