package kcp.spring.service;

import kcp.spring.bo.PassangerBO;
import kcp.spring.dao.PassengerInfoDAO;
import kcp.spring.dto.PassengerDTO;

public class PassengerServiceImpl implements PassengerService {
    private PassengerInfoDAO dao;

    public PassengerServiceImpl(PassengerInfoDAO dao) {
	this.dao = dao;
    }

    @Override
    public String registerDetails(PassengerDTO dto) throws Exception {
	int passengerAge=dto.getAge();
	double discountAmount=0.0;
	if(passengerAge>60)
	     discountAmount = dto.getJouranyAmount()*20/100;
	else
	    discountAmount=0;
	PassangerBO bo=new PassangerBO();
	bo.setPassangerName(dto.getPassangerName());
	bo.setAge(dto.getAge());
	bo.setAddress(dto.getAddress());
	bo.setSourcePoint(dto.getSourcePoint());
	bo.setDestinationPoint(dto.getDestinationPoint());
	bo.setTotalDistance(dto.getTotalDistance());
	bo.setDiscoutAmount(discountAmount);
	bo.setJouranyAmount(dto.getJouranyAmount());
	int count=dao.insertInfromation(bo);
	if(count==0) {
	   return "registration  failed "+
		   " Total Amount::"+dto.getJouranyAmount()+
		   "Discount "+discountAmount; 
	}
	return "registration  successed \n"+
		"\njourany "+dto.getSourcePoint()+" to "+dto.getDestinationPoint()+
		   " \nTotal Amount::"+dto.getJouranyAmount()+
		   "\nDiscount "+discountAmount; 
    }

}
