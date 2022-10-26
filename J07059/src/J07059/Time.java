package J07059;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time implements Comparable<Time>{
	public static int cnt = 1;
	private String iD, date, hour, room, time;

	public Time(String date, String hour, String room) {
		super();
		this.date = date;
		this.hour = hour;
		this.iD = "C" + String.format("%03d", cnt);
		cnt++;
		this.time = date + " " + hour;
		this.room = room;
	}
	
	public String toString() {
		return iD + " " + time + " " + room;
	}
	
	public int compareTo(Time o) {
		SimpleDateFormat sp = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Date date1 = null, date2 = null;
		try {
			date1 = sp.parse(this.time);
			date2 = sp.parse(o.time);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		int i = date1.compareTo(date2);
		if(i != 0) {
			return i;
		}
		return this.iD.compareTo(o.iD);
	}
	
}
