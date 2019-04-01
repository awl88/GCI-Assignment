package com.gci.contracts.json;

public class Site {

	private Integer siteNm;
	private Integer service;
	private Integer price;
	
	
	// constructor
	public Site(Integer siteNm, Integer service, Integer price) {
		super();
		this.siteNm = siteNm;
		this.service = service;
		this.price = price;
	}

	// getters & setters
	public Integer getSiteNm() {
		return siteNm;
	}
	public void setSiteNm(Integer siteNm) {
		this.siteNm = siteNm;
	}
	public Integer getService() {
		return service;
	}
	public void setService(Integer service) {
		this.service = service;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
}
