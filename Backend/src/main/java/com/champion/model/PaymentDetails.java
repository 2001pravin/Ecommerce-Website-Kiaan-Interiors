package com.champion.model;

public class PaymentDetails {
	private String paymentMethod;
	private String Status;
	private String paymentId;
	private String razorpaypaymentLinkId;
	private String razorpaypaymentLinkReferenceId;
	private String razorpaypaymentLinkStatus;
	private String razorpaypaymentId;
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public String getRazorpaypaymentLinkId() {
		return razorpaypaymentLinkId;
	}
	public void setRazorpaypaymentLinkId(String razorpaypaymentLinkId) {
		this.razorpaypaymentLinkId = razorpaypaymentLinkId;
	}
	public String getRazorpaypaymentLinkReferenceId() {
		return razorpaypaymentLinkReferenceId;
	}
	public void setRazorpaypaymentLinkReferenceId(String razorpaypaymentLinkReferenceId) {
		this.razorpaypaymentLinkReferenceId = razorpaypaymentLinkReferenceId;
	}
	public String getRazorpaypaymentLinkStatus() {
		return razorpaypaymentLinkStatus;
	}
	public void setRazorpaypaymentLinkStatus(String razorpaypaymentLinkStatus) {
		this.razorpaypaymentLinkStatus = razorpaypaymentLinkStatus;
	}
	public String getRazorpaypaymentId() {
		return razorpaypaymentId;
	}
	public void setRazorpaypaymentId(String razorpaypaymentId) {
		this.razorpaypaymentId = razorpaypaymentId;
	}
	public PaymentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PaymentDetails(String paymentMethod, String status, String paymentId, String razorpaypaymentLinkId,
			String razorpaypaymentLinkReferenceId, String razorpaypaymentLinkStatus, String razorpaypaymentId) {
		super();
		this.paymentMethod = paymentMethod;
		Status = status;
		this.paymentId = paymentId;
		this.razorpaypaymentLinkId = razorpaypaymentLinkId;
		this.razorpaypaymentLinkReferenceId = razorpaypaymentLinkReferenceId;
		this.razorpaypaymentLinkStatus = razorpaypaymentLinkStatus;
		this.razorpaypaymentId = razorpaypaymentId;
	}
	
	

}
