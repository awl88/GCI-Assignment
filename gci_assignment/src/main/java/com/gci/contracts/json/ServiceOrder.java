package com.gci.contracts.json;

import java.time.LocalDate;

public class ServiceOrder {
	
	private String serviceOrderNm;
	private LocalDate soDt;
	private long soCost;
	private int termLength;
	private int nmOfService;
	private String nonRecurringCostsCode;
	private long nonRecurringCostsAmount;
	private String recurringCostsCode;
	private long reccuringCostsAmount;

	// constructor
	public ServiceOrder() {};
	
	public ServiceOrder(String serviceOrderNm, LocalDate soDt, long soCost, int termLength, int nmOfService,
			String nonRecurringCostsCode, long nonRecurringCostsAmount, String recurringCostsCode,
			long reccuringCostsAmount) {
		super();
		this.serviceOrderNm = serviceOrderNm;
		this.soDt = soDt;
		this.soCost = soCost;
		this.termLength = termLength;
		this.nmOfService = nmOfService;
		this.nonRecurringCostsCode = nonRecurringCostsCode;
		this.nonRecurringCostsAmount = nonRecurringCostsAmount;
		this.recurringCostsCode = recurringCostsCode;
		this.reccuringCostsAmount = reccuringCostsAmount;
	}

	// getters & setters
	public String getServiceOrderNm() {
		return serviceOrderNm;
	}

	public void setServiceOrderNm(String serviceOrderNm) {
		this.serviceOrderNm = serviceOrderNm;
	}

	public LocalDate getSoDt() {
		return soDt;
	}

	public void setSoDt(LocalDate soDt) {
		this.soDt = soDt;
	}

	public long getSoCost() {
		return soCost;
	}

	public void setSoCost(long soCost) {
		this.soCost = soCost;
	}

	public int getTermLength() {
		return termLength;
	}

	public void setTermLength(int termLength) {
		this.termLength = termLength;
	}

	public int getNmOfService() {
		return nmOfService;
	}

	public void setNmOfService(int nmOfService) {
		this.nmOfService = nmOfService;
	}

	public String getNonRecurringCostsCode() {
		return nonRecurringCostsCode;
	}

	public void setNonRecurringCostsCode(String nonRecurringCostsCode) {
		this.nonRecurringCostsCode = nonRecurringCostsCode;
	}

	public long getNonRecurringCostsAmount() {
		return nonRecurringCostsAmount;
	}

	public void setNonRecurringCostsAmount(long nonRecurringCostsAmount) {
		this.nonRecurringCostsAmount = nonRecurringCostsAmount;
	}

	public String getRecurringCostsCode() {
		return recurringCostsCode;
	}

	public void setRecurringCostsCode(String recurringCostsCode) {
		this.recurringCostsCode = recurringCostsCode;
	}

	public long getReccuringCostsAmount() {
		return reccuringCostsAmount;
	}

	public void setReccuringCostsAmount(long reccuringCostsAmount) {
		this.reccuringCostsAmount = reccuringCostsAmount;
	}
}
