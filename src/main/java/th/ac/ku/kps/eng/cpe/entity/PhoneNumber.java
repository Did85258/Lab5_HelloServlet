package th.ac.ku.kps.eng.cpe.entity;

import java.io.Serializable;

public class PhoneNumber implements Serializable{
	private String number;

	public PhoneNumber(String number) {
		this.number = number;
	}
	public PhoneNumber() {
		
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
}
