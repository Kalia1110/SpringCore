package kcp.spring.tyre;

public class Michelin_tyres implements CarTyre {

    @Override
    public String getDimension() {
	
	 return "Section Width	170 Millimeters\r\n" + 
		"Aspect Ratio	0.7\r\n" + 
		"Construction	R (radial)";
    }

    @Override
    public String getTyrePrice() {
	
	return "Michelin_tyres Price: Rs.1,600 – Rs.18,000 ";
    }

}
