package com.takim4.bagisProject.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
	private int id;
	private String declaration;
	private String mail;
	private String phone; 
	private String paymentTotal;
	private String grantorType;
}
