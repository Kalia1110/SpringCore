package kcp.spring.beans;

import java.util.Date;

public class WishMessage {
	private Date date;
	public WishMessage(Date date) {
		this.date=date;
	}
	

	@SuppressWarnings("deprecation")
	public String wishMessageGeneretor(String string) {
		int hr=date.getHours();
		if (hr<12) {
			return " gud morng "+string;
		}else if (hr<16) {
			return " good Afternoon "+string;
		}else if (hr<20) {
			return " good evening "+string;
		}else {
			return " good Night "+string;
		}
	}

	

}
