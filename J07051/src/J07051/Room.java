package J07051;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Room implements Comparable<Room>{
	public static int cnt = 1;
	private String iD, name, iDRoom, arrivalDay, leaveDay;
	private long  serviceFee, totalDays, totalPayment;
	
	public Room(String name, String iDRoom, String arrivalDay, String leaveDay, Long serviceFee) throws ParseException {
		super();
		this.iD = "KH" + String.format("%02d", cnt);
		cnt++;
		this.name = chuanTen(name);
		this.iDRoom = iDRoom;
		this.arrivalDay = chuanNgay(arrivalDay);
		this.leaveDay = chuanNgay(leaveDay);
		this.serviceFee = serviceFee;
		this.totalDays = total(arrivalDay, leaveDay);
		this.totalPayment = fee() * totalDays + serviceFee;
	}
	
	private String chuanTen(String ten) {
		ten = ten.trim().toLowerCase();
		ten = ten.replaceAll("\\s+", " ");
		String tmp[] = ten.split(" ");
		ten = "";
		for(int i = 0; i < tmp.length; i++) {
			ten += String.valueOf(tmp[i].charAt(0)).toUpperCase() + tmp[i].substring(1);
			if(i != tmp.length-1) {
				ten += " ";
			}
		}
		return ten;
	}
	
	
	private String chuanNgay(String day) throws ParseException {
		SimpleDateFormat sp = new SimpleDateFormat("dd/MM/yyyy");
		Date date = sp.parse(day);
		day = sp.format(date);
		return day;
	}
	
	private long total(String day1, String day2) throws ParseException {
		SimpleDateFormat sp = new SimpleDateFormat("dd/MM/yyyy");
		Date date1 = sp.parse(day1);
		Date date2 = sp.parse(day2);
		long totalday = TimeUnit.MILLISECONDS.toDays(date2.getTime() - date1.getTime());
		return totalday + 1;
	}
	
	private long fee() {
		long fee = 25;
		if(iDRoom.charAt(0) == '2') {
			fee = 34;
		}else if(iDRoom.charAt(0) == '3') {
			fee = 50;
		}else if(iDRoom.charAt(0) == '4') {
			fee = 80;
		}
		return fee;
	}
	
	public int compareTo(Room o) {
		if(this.totalPayment > o.totalPayment) return -1;
		if(this.totalPayment < o.totalPayment) return 1;
		return 0;
	}
	
	public String toString() {
		return iD + " " + name + " " + iDRoom + " " + totalDays + " " + totalPayment;
	}
	
}
