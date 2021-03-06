package com.gci.contracts.controller;


import org.springframework.web.bind.annotation.*;

import com.gci.contracts.json.Contract;
import com.gci.contracts.json.ServiceOrder;
import com.gci.contracts.service.ContractService;


@RestController
public class ContractContoller {
	
	  ContractService cs = new ContractService();

	  @RequestMapping(method = RequestMethod.GET, path="/hello")
	  public String hello() {
	        return "hello";
	    }
	  
	  @RequestMapping(method = RequestMethod.GET, path="/contracts")
	  public Contract getContracts() {
		 Contract contract = cs.getContract();
		 return contract;
	  }
	  
	  @RequestMapping(method = RequestMethod.GET, path="/serviceOrder")
	  public ServiceOrder getServiceOrders() {
		  ServiceOrder so = cs.getServiceOrder();
		  return so;
	  }
}
