package J04015;

public class Teacher {
	private String ID, name;
	private long salary, allowance, coefficient;
	public Teacher(String iD, String name, long salary) {
		super();
		ID = iD;
		this.name = name;
		this.salary = salary;
		this.all();
		this.coe();
	}
	
	private void all() {
		allowance = 500000;
		if(ID.startsWith("HP")) {
			allowance = 900000;
		}else if(ID.startsWith("HT")){
			allowance = 2000000;
		}
	}
	
	private void coe() {
		coefficient = Long.parseLong(ID.substring(2));
	}

	@Override
	public String toString() {
		return ID + " " + name + " " + coefficient + " " + allowance + " " + (allowance + (salary * coefficient));
	}
	
	
	
}
