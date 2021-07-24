package com.takim4.bagisProject.exception;

@SuppressWarnings("serial")
public class InstitutionsNotFoundException extends NotFoundException {

	public InstitutionsNotFoundException(Integer institutionsId) {
		super(String.format("Bağış Bulunamadı! (Id = %s)", institutionsId));
	}
}
