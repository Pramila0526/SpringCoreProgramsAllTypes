package com.bridgelabz.spring;
/*******************************************************************************************
 * @author 	:Pramila Tawari
 * Purpose	:Implementing the Tyre Class Using xml File
 * Date		:31/12/2019
 *
 ***************************************************************************************/
public class Tyre {
	private String tyreBrand;
	
	public Tyre(String brand) {
		super();
		this.tyreBrand=brand;
	}

	public String getTyreBrand() {
		return tyreBrand;
	}

	public void setTyreBrand(String tyreBrand) {
		this.tyreBrand = tyreBrand;
	}

	@Override
	public String toString() {
		return "Tyre [tyreBrand=" + tyreBrand + "]";
	}

}
