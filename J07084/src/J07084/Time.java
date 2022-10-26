package J07084;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time implements Comparable<Time>{
	private String name, begin, end;
	private long total;
	
	public Time(String name, String begin, String end) throws ParseException {
		super();
		this.name = name;
		this.begin = begin;
		this.end = end;
		this.total = cal();
	}
	
	private long cal() throws ParseException {
		SimpleDateFormat sp = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d1 = sp.parse(this.begin), d2 = sp.parse(this.end);
		return (d2.getTime() - d1.getTime())/(1000*60);
	}
	
	public int compareTo(Time o) {
		if(this.total > o.total) return -1;
		if(this.total < o.total) return 1;
		return this.name.compareTo(o.name);
	}
	
	public String toString() {
		return name + " " + total;
	}
	
}
