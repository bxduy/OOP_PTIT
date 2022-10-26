package test9;

public class DT {
	private String tiD, nameT, topicN;
	public static int cnt = 1;
	public DT(String nameT, String topicN) {
		super();
		this.tiD = "DT" + String.format("%03d", cnt++);
		this.nameT = nameT;
		this.topicN = topicN;
	}
	/**
	 * @return the tiD
	 */
	public String getTiD() {
		return tiD;
	}
	
	public String toString() {
		return topicN + " " + nameT;
	}
	
	
}
