package kcp.spring.tyre;

public class CEAT_Tyres implements CarTyre {

    @Override
    public String getDimension() {
	return "Section Width	168 Millimeters\r\n" + 
		"Aspect Ratio	0.9\r\n" + 
		"Construction	R (radial)";
    }

    @Override
    public String getTyrePrice() {
	
	return " CEAT_Tyres Price: Rs.1,085 – Rs.7,900";
    }

}
