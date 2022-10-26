package test8;

public class DeTai implements Comparable<DeTai>{
	private String iD, tName, topicName;
	public static int cnt = 1;
	public DeTai(String tName, String topicName) {
		super();
		this.iD = "DT" + String.format("%03d", cnt++);
		this.tName = tName;
		this.topicName = topicName;
	}
	
	public int compareTo(DeTai o) {
		return this.topicName.compareTo(o.topicName);
	}
	
	public String toString() {
		return tName + " " + topicName;
	}

	/**
	 * @return the iD
	 */
	public String getiD() {
		return iD;
	}

	/**
	 * @param iD the iD to set
	 */
	public void setiD(String iD) {
		this.iD = iD;
	}
	
}
