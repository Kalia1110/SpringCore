package kcp.spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import kcp.spring.bo.CustomerBO;

public class CustomerDAOImpl implements CustomerDAO {
    	private DataSource dataSource;
    	private static final String sql="insert into customerTable values(?,?,?,?,?)";
    	public CustomerDAOImpl(DataSource dataSource) {
	   this.dataSource=dataSource;
	}
    @Override
    public int insertData(CustomerBO bo) throws Exception {
	Connection connection=dataSource.getConnection();
	PreparedStatement ps=connection.prepareStatement(sql);
	ps.setString(2,bo.getCustomerName());
	ps.setInt(1, bo.getCustomerID());
	ps.setString(5, bo.getCustomerAddress());
	ps.setDouble(3,bo.getPrincipleAmount() );
	ps.setDouble(4,bo.getRateAmount());
	int count=ps.executeUpdate();
	return count;
    }

}
