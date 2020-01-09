package kcp.spring.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import kcp.spring.bo.EmployeeBO;
import kcp.spring.dto.EmployeeDTO;

public final class EmploeeDAOImpl implements EmploeeDAO {
    private DataSource source;

    public EmploeeDAOImpl(DataSource source) {
	this.source = source;
    }

    @Override
    public List<EmployeeBO> getEmploeeData(String deg1, String deg2) throws Exception {
	Connection connection = source.getConnection();
	EmployeeBO bo = new EmployeeBO();
	List<EmployeeBO> listBO = null;
	final String sql = "select * from emp where job=" + deg1 + " or  job=" + deg2 + "";
	Statement st = connection.createStatement();
	ResultSet rs = st.executeQuery(sql);
	while (rs.next()) {
	    bo.setEmpno(rs.getInt(1));
	    bo.setEname(rs.getString(2));
	    bo.setJob(rs.getString(3));
	    bo.setMgr(rs.getInt(4));
	    bo.setHireDate(rs.getString(5));
	    bo.setSal(rs.getInt(6));
	    bo.setComm(rs.getInt(7));
	    bo.setDeptno(rs.getInt(8));
	    listBO = new ArrayList<EmployeeBO>();
	    listBO.add(bo);
	}
	return listBO;

    }

}
