package kcp.spring.dao;

import kcp.spring.bo.CustomerBO;

public interface CustomerDAO {
    public int insertData(CustomerBO bo) throws Exception;
}
