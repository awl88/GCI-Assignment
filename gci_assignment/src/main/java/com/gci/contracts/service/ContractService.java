package com.gci.contracts.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.gci.contracts.json.Contract;
import com.gci.contracts.json.ServiceOrder;
import com.gci.contracts.json.Site;

public class ContractService {
	private static Contract contract = new Contract();
	private static ServiceOrder serviceOrder = new ServiceOrder();
	
	static { init(); }
	
	private static void init() {
		Site site1 = new Site(1, 100, 7422);
		Site site2 = new Site(2, 100, 245);
		Site site3 = new Site(3, 100, 3325);
	
		List<Site> sites = new ArrayList<>();
		sites.add(site1);
		sites.add(site2);
		sites.add(site3);
		
		Contract con = new Contract("HB-134", 
				LocalDate.of(2014,2, 1), 
				LocalDate.of(2016, 2, 28), 
				sites);
		contract = con;
		
		ServiceOrder so = new ServiceOrder("WT-239",
				LocalDate.of(2015, 11, 24),
				275, 
				3, 
				2,
				"Configuration and Testing of Equipment",
				3485,
				"Remote Site VPN",
				275);
		serviceOrder = so;
	}

	public static Contract getContract() {
		return contract;
	}
	
	public static ServiceOrder getServiceOrder() {
		return serviceOrder;
	}
}
