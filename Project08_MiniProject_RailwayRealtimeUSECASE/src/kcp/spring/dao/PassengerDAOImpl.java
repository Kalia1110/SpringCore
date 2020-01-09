package kcp.spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import kcp.spring.bo.PassangerBO;

public class PassengerDAOImpl implements PassengerInfoDAO {
    private DataSource dataSource;
    private final static String sql="insert into passengerDetails values(?,?,?,?,?,?,?,?)";

    public PassengerDAOImpl(DataSource dataSource) {
	   this.dataSource = dataSource;
    }

    @Override
    public int insertInfromation(PassangerBO bo) throws Exception {
		Connection conn=dataSource.getConnection();
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1,bo.getPassangerName());
		ps.setInt(2,bo.getAge());
		ps.setString(3,bo.getAddress());
		ps.setString(4,bo.getSourcePoint());
		ps.setString(5,bo.getDestinationPoint());
		ps.setInt(6, bo.getTotalDistance());
		ps.setDouble(7, bo.getDiscoutAmount());
		ps.setDouble(8,bo.getJouranyAmount());
		int count=ps.executeUpdate();
		
	return count ;
    }

}
