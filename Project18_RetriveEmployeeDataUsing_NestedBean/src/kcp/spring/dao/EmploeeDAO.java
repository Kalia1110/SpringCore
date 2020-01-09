package kcp.spring.dao;

import java.util.List;

import kcp.spring.bo.EmployeeBO;
public interface EmploeeDAO {
    public List<EmployeeBO> getEmploeeData(String deg1,String deg2) throws Exception;
}
