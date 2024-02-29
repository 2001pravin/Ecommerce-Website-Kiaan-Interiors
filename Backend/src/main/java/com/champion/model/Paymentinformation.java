package com.champion.model;

import jakarta.persistence.Column;

public class Paymentinformation {
	@Column(name="cardholder_name")
	private String cardholderName;
	
	@Column(name="card_number")
    private String cardNumber;
	
	@Column(name="expirstion_date")
    private String expirstionDate;
	
	@Column(name="cvv")
	private String cvv;
}
