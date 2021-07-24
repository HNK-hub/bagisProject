package com.takim4.bagisProject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GrantorDto {
	
    private int grantorId;
	private String identity;
	private String grantorName;
	
}
