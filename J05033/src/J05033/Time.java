package J05033;

public class Time implements Comparable<Time>{
	private int hour, minute, second;

	public Time(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public int compareTo(Time o) {
		if(this.hour > o.hour) {
			return 1;
		}
		if(this.hour == o.hour) {
			if(this.minute > o.minute) {
				return 1;
			}else if(this.minute == o.minute){
				if(this.second > o.second) {
					return 1;
				}else if(this.second == o.second) {
					return 0;
				}
				return -1;
			}
		}
		return -1;
	}
	
	public String toString() {
		return hour + " " + minute + " " + second;
	}
	
}
