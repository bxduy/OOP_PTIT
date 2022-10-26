package J04020;

public class Pair<Key, Val> {
	private Key key;
	private Val val;
	
	public Pair(Key key, Val val) {
		super();
		this.key = key;
		this.val = val;
	}
	
	private static boolean isPrime(Integer num) {
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) return false;
		}
		return num > 1;
	}
	
	public boolean isPrime() {
		if(key.getClass().equals(Integer.class) && val.getClass().equals(Integer.class)) {
			return Pair.isPrime((Integer)this.key) && Pair.isPrime((Integer)this.val);
		}
		return false;
	}
	
	public String toString() {
		return key + " " + val;
	}
	
}
