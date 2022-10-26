package test3;

import java.io.Serializable;

public class Member implements Serializable, Comparable<Member>{
	private String iDM, nameM, iDT;
	public static int cnt = 1;
	
	public Member(String name, String iDT) {
		super();
		this.iDM = "C" + String.format("%03d", cnt++);
		this.nameM = name;
		this.iDT = iDT;
	}

	@Override
	public int compareTo(Member o) {
		return this.nameM.compareTo(o.nameM);
	}

	/**
	 * @return the iDM
	 */
	public String getiDM() {
		return iDM;
	}

	/**
	 * @param iDM the iDM to set
	 */
	public void setiDM(String iDM) {
		this.iDM = iDM;
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
		return iDM + " " + nameM;
	}
	
}
