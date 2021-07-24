package com.takim4.bagisProject.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="user")
@Data
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="declaration", nullable=false)
	private String declaration;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at")
	private Date createdAt;
	
	@Column(name="mail", nullable=false)
	private String mail;

	@Column(name="phone", nullable=false)
	private String phone; 
	
	@Column(name="payment_total", nullable=false)
	private String paymentTotal;
	
	@Column(name="grantor_type", nullable=false)
	private String grantorType;

}
