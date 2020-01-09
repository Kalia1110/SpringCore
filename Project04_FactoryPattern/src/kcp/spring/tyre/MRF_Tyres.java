package kcp.spring.tyre;

public class MRF_Tyres implements CarTyre {

    @Override
    public String getDimension() {
	
	return "Section Width	165 Millimeters\r\n" + 
		"Aspect Ratio	0.8\r\n" + 
		"Construction	R (radial)";
    }

    @Override
    public String getTyrePrice() {
	
	return "MRF tyres Price: Rs.1,800 – Rs.13,375 ";
    }

}
