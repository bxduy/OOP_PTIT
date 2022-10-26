package test3;

import java.io.Serializable;

public class Team implements Serializable{
	private String iDT, nameT, nameS;
	public static int cnt = 1;
	
	public Team(String nameT, String nameS) {
		super();
		this.iDT = "Team" + String.format("%02d", cnt++);
		this.nameT = nameT;
		this.nameS = nameS;
	}

	/**
	 * @return the iDT
	 */
	public String getiDT() {
		return iDT;
	}

	/**
	 * @param iDT the iDT to set
	 */
	public void setiDT(String iDT) {
		this.iDT = iDT;
	}
	
	
	public String toString() {
		return nameT + " " + nameS;
	}
	
}
