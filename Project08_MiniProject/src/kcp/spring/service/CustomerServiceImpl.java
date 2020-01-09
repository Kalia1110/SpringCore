package kcp.spring.service;

import kcp.spring.bo.CustomerBO;
import kcp.spring.dao.CustomerDAO;
import kcp.spring.dto.CustomerDTO;

public class CustomerServiceImpl implements CustomerService {
    private CustomerDAO dao;

    public CustomerServiceImpl(CustomerDAO dao) {
	this.dao = dao;
    }

    @Override
    public String customerRegister(CustomerDTO dto) throws Exception {
		double totalAmout=dto.getPrincipleAmount()*dto.getRateAmount()/100;
		CustomerBO bo= new CustomerBO();
		bo.setCustomerName(dto.getCustomerName());
		bo.setCustomerAddress(dto.getCustomerAddress());
		bo.setCustomerID(dto.getCustomerID());
		bo.setPrincipleAmount(dto.getPrincipleAmount());
		bo.setRateAmount(dto.getRateAmount());
		bo.setTotalAmount(dto.getTotal());
		int count=dao.insertData(bo);
		if (count==0) {
		    return "Customer not register"+totalAmout;
		}else {
		    return "Customer is register with "+totalAmout;
		}
	  }
}
