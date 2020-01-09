package kcp.spring.tyre;

public class Bridgestone_tyres implements CarTyre {

    @Override
    public String getDimension() {
	 return "Section Width	160 Millimeters\r\n" + 
			"Aspect Ratio	0.5\r\n" + 
			"Construction	R (radial)";
    }

    @Override
    public String getTyrePrice() {
	
	return " Bridgestone_tyres Price: Rs.2,100 – Rs.28,335 ";
    }

}
