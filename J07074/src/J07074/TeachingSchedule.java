package J07074;

public class TeachingSchedule extends Subject{

	public TeachingSchedule(String iD, String name, String numOfCre) {
		super(iD, name, numOfCre);
		// TODO Auto-generated constructor stub
	}
	private String iDG, iD, day, time, nameTea, room;
	public static int cnt = 1;
	public TeachingSchedule(String iD, String name, String numOfCre, String iD2, String day, String time,
			String nameTea, String room) {
		super(iD, name, numOfCre);
		this.iDG = "HP" + String.format("%03d", cnt);
		cnt++;
		this.iD = iD2;
		this.day = day;
		this.time = time;
		this.nameTea = nameTea;
		this.room = room;
	}
	
	
	
}
