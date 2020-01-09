package kcp.spring.controller;

import kcp.spring.dto.CustomerDTO;
import kcp.spring.service.CustomerService;
import kcp.spring.vo.CustomerVO;

public class CustomerController {
    private CustomerService service;
    public CustomerController(CustomerService service) {
	this.service=service;
    }
    public String processData(CustomerVO vo) throws Exception{
	CustomerDTO dto=new CustomerDTO();
	dto.setCustomerName(vo.getCustomerName());
	dto.setCustomerAddress(vo.getCustomerAddress());
	dto.setCustomerID(Integer.parseInt(vo.getCustomerID()));
	dto.setPrincipleAmount(Double.parseDouble(vo.getPrincipleAmount()));
	dto.setRateAmount(Double.parseDouble(vo.getRateAmount()));
	String result=service.customerRegister(dto);
	return result;
	
    }

}
