package com.takim4.bagisProject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "grantor")
public class Grantor extends User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int grantorId;

    @Column(name = "identity")
	private String identity;
    
    @Column(name = "grantor_name")
	private String grantorName;
}
