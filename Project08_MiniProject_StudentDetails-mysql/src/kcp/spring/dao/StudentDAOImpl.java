package kcp.spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.sql.DataSource;

import kcp.spring.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {
    private DataSource dataSource;
    //private static final String sql = "insert into studenttable values(?,?,?,?,?,?)";
    private static final String sql = "insert into studenttable"
    	+ "(sName,sAddress,totalMark,result,avgMark) values(?,?,?,?,?)";

    public StudentDAOImpl(DataSource dataSource) {
	this.dataSource = dataSource;
    }

    @Override
    public int insertData(StudentBO bo) throws Exception {
	Connection connection = dataSource.getConnection();
	PreparedStatement ps=connection.prepareStatement(sql);
	ps.setString(1,bo.getsName());
	//ps.setInt(2,bo.getsRollno());
	ps.setString(2,bo.getsAddress());
	ps.setDouble(3, bo.getTotalMark());
	ps.setString(4,bo.getResult());
	ps.setDouble(5, bo.getAvgMark());
	int count=ps.executeUpdate();
	return count;
    }

}
