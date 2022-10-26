package J05011;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time implements Comparable<Time>{
	private String iD, name, begin, end;
	private long totalTime, hour, minute;

	public Time(String iD, String name, String begin, String end) throws ParseException {
		super();
		this.iD = iD;
		this.name = name;
		this.begin = begin;
		this.end = end;
		this.totalTime = cal();
		this.hour = totalTime / 60;
		this.minute = totalTime % 60;
	}
	
	public int compareTo(Time o) {
		if(this.totalTime > o.totalTime) return -1;
		if(this.totalTime < o.totalTime) return 1;
		return 0;
	}
	
	private long cal() throws ParseException {
		SimpleDateFormat sp = new SimpleDateFormat("HH:mm");
		Date time1 = sp.parse(begin), time2 = sp.parse(end);
		long time = (time2.getTime() - time1.getTime())/(1000*60);
		return time;
	}
	
	public String toString() {
		return iD + " " + name + " " + hour + " gio " + minute + " phut";
	}
	
}
