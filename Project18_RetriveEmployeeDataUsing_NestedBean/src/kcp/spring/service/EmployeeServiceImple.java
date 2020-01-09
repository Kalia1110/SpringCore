package kcp.spring.service;

import java.util.ArrayList;
import java.util.List;

import kcp.spring.bo.EmployeeBO;
import kcp.spring.dao.EmploeeDAO;
import kcp.spring.dto.EmployeeDTO;
import kcp.spring.vo.EmployeeVO;

public class EmployeeServiceImple implements EmployeeService {
    EmploeeDAO dao;

    public EmployeeServiceImple(EmploeeDAO dao) {
	this.dao = dao;
    }

    @Override
    public List<EmployeeDTO> ProcessData(String deg1, String deg2) throws Exception {
	List<EmployeeBO> listBO=dao.getEmploeeData(deg1, deg2);
	//convert listBO to ListDTO
	EmployeeBO bo=new EmployeeBO();
	EmployeeDTO dto=new EmployeeDTO();
	dto.setEname(bo.getEname());
	dto.setEmpno(bo.getEmpno());
	dto.setJob(bo.getJob());
	dto.setMgr(bo.getMgr());
	dto.setHireDate(bo.getHireDate());
	dto.setComm(bo.getComm());
	dto.setSal(bo.getSal());
	dto.setDeptno(bo.getDeptno());
	List<EmployeeDTO> listDTO=new ArrayList<EmployeeDTO>();
	listDTO.add(dto);
	return listDTO;
	
    }

}
