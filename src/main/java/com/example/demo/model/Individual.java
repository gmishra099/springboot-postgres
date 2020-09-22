package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Builder
@Table(name = "individual")
public class Individual {
	@Id
	@Column(name = "SFID")
	private String SFID;
	@Column(name = "shouldForget")
	private String shouldForget;
	@Column(name = "hasOptedOut")
	private String hasOptedOut;
}
