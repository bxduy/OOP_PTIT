package J07046;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Stay implements Comparable<Stay>{
	public static int cnt = 1;
	private String iD, name, iDRoom, arrivalDate, leaveDate;
	private long totalDays;
	
	public Stay(String name, String iDRoom, String arrivalDate, String leaveDate) throws ParseException {
		super();
		this.iD = "KH" + String.format("%02d", cnt);
		cnt++;
		this.name = name;
		this.iDRoom = iDRoom;
		this.arrivalDate = arrivalDate;
		this.leaveDate = leaveDate;
		SimpleDateFormat sp = new SimpleDateFormat("dd/MM/yyyy");
		Date date1 = sp.parse(arrivalDate);
		Date date2 = sp.parse(leaveDate);
		long tmp = date2.getTime() - date1.getTime();
		long total = TimeUnit.MILLISECONDS.toDays(tmp);
		this.totalDays = total;
	}
	
	public int compareTo(Stay o) {
		if(this.totalDays > o.totalDays) return -1;
		if(this.totalDays < o.totalDays) return 1;
		return 0;
	}
	
	public String toString() {
		return iD + " " + name + " " + iDRoom + " " + totalDays;
	}

	/**
	 * @return the arrivalDate
	 */
	public String getArrivalDate() {
		return arrivalDate;
	}

	/**
	 * @return the leaveDate
	 */
	public String getLeaveDate() {
		return leaveDate;
	}

	
}
