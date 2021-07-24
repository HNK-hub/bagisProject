package com.takim4.bagisProject.exception;

@SuppressWarnings("serial")
public class GrantorNotFoundException extends NotFoundException {

	public GrantorNotFoundException(Integer grantorId) {

		super(String.format("Bağış Bulunamadı! (Id = %s)", grantorId));

	}
}
