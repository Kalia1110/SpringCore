package kcp.spring.service;

import java.util.List;

import kcp.spring.dto.EmployeeDTO;

public interface EmployeeService {
    public List<EmployeeDTO> ProcessData(String deg1, String deg2) throws Exception;
}
