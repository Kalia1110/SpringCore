package kcp.spring.service;

import kcp.spring.dto.CustomerDTO;

public interface CustomerService {
    public String customerRegister(CustomerDTO dto) throws Exception;
}
