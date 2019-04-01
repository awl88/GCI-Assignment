package com.gci.contracts.json;

import java.time.LocalDate;
import java.util.List;

public class Contract {
	
	private String conNm;
	private LocalDate startDt;
	private LocalDate endDt;
	private List<Site> sites;
	
	// constructors
	public Contract() {} 
	
	public Contract(String conNm, LocalDate startDt, LocalDate endDt, List<Site> sites) {
		super();
		this.conNm = conNm;
		this.startDt = startDt;
		this.endDt = endDt;
		this.sites = sites;
	}

	// getters & setters
	public String getConNm() {
		return conNm;
	}

	public void setConNm(String conNm) {
		this.conNm = conNm;
	}

	public LocalDate getStartDt() {
		return startDt;
	}

	public void setStartDt(LocalDate startDt) {
		this.startDt = startDt;
	}

	public LocalDate getEndDt() {
		return endDt;
	}

	public void setEndDt(LocalDate endDt) {
		this.endDt = endDt;
	}

	public List<Site> getSites() {
		return sites;
	}

	public void setSites(List<Site> sites) {
		this.sites = sites;
	}
}
