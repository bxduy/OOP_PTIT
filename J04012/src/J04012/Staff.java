package J04012;

public class Staff {
	private String name, position, ID;
	private long salary, workDay, allowance, bonus;
	
	public Staff(String name, String position, long salary, long workDay) {
		super();
		ID = "NV01";
		this.name = name;
		this.position = position;
		this.salary = salary;
		this.workDay = workDay;
		this.All();
		this.Bonus();
	}
	
	private void All() {
		allowance = 150000;
		if(position.equals("TP")) {
			allowance = 180000;
		}else if(position.equals("PGD")) {
			allowance = 200000;
		}else if(position.equals("GD")) {
			allowance = 250000;
		}
	}
	
	private void Bonus() {
		bonus = 0;
		if(workDay >= 22 && workDay < 25) {
			bonus = workDay * salary / 10;
		}else if(workDay >= 25) {
			bonus = workDay * salary / 5;
		}
	}

	@Override
	public String toString() {
		return ID + " " + name + " " + workDay*salary + " " + bonus + " " + allowance + " " + (bonus + allowance + salary*workDay);
	}
	
	
	
}
