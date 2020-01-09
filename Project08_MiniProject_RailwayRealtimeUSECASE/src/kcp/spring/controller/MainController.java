package kcp.spring.controller;

import kcp.spring.dto.PassengerDTO;
import kcp.spring.service.PassengerService;
import kcp.spring.vo.PassengerVO;

public class MainController {
    private PassengerService service;

    public MainController(PassengerService service) {
	this.service = service;
    }

    public String processData(PassengerVO vo) throws Exception {
	PassengerDTO dto= new PassengerDTO();
	dto.setPassangerName(vo.getPassangerName());
	dto.setAge(Integer.parseInt(vo.getAge()));
	dto.setAddress(vo.getAddress());
	dto.setSourcePoint(vo.getSourcePoint());
	dto.setDestinationPoint(vo.getDestinationPoint());
	dto.setJouranyAmount(Double.parseDouble(vo.getJouranyAmount()));
	dto.setTotalDistance(Integer.parseInt(vo.getTotalDistance()));
	String result=service.registerDetails(dto);
	return result;
	
    }
}
