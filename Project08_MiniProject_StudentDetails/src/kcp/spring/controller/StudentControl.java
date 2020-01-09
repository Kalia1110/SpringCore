package kcp.spring.controller;

import kcp.spring.dto.StudentDTO;
import kcp.spring.sevice.StudentService;
import kcp.spring.vo.StudentVO;

public class StudentControl {
private StudentService service;
    public StudentControl(StudentService service) {
	this.service=service;
    }
    public String processData(StudentVO vo) throws Exception {
	StudentDTO dto=new StudentDTO();
	dto.setsName(vo.getsName());
	dto.setsRollno(Integer.parseInt(vo.getsRollno()));
	dto.setsAddress(vo.getsAddress());
	dto.setMark1(Integer.parseInt(vo.getMark1()));
	dto.setMark2(Integer.parseInt(vo.getMark2()));
	dto.setMark3(Integer.parseInt(vo.getMark3()));
	dto.setMark4(Integer.parseInt(vo.getMark4()));
	String result=service.studentRegister(dto);
	return result;
	
    }

}
