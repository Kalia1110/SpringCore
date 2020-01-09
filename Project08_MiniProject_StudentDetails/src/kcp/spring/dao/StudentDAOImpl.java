package kcp.spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.sql.DataSource;

import kcp.spring.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {
    private DataSource dataSource;
    private static final String sql = "insert into studentTable values(?,?,?,?,?,?)";

    public StudentDAOImpl(DataSource dataSource) {
	this.dataSource = dataSource;
    }

    @Override
    public int insertData(StudentBO bo) throws Exception {
	Connection connection = dataSource.getConnection();
	PreparedStatement ps=connection.prepareStatement(sql);
	ps.setString(1,bo.getsName());
	ps.setInt(2,bo.getsRollno());
	ps.setString(3,bo.getsAddress());
	ps.setDouble(4, bo.getTotalMark());
	ps.setString(6,bo.getResult());
	ps.setDouble(5, bo.getAvgMark());
	int count=ps.executeUpdate();
	return count;
    }

}
