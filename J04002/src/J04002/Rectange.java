package J04002;

public class Rectange {
	private double width, height;
	private String color;
	public Rectange(double width, double height, String color) {
		super();
		if(width > 0 && height > 0) {
			this.width = width;
			this.height = height;
			this.color = "";
			for(int i = 0; i < color.length(); i++) {
				if(i == 0) {
					this.color = this.color + Character.toUpperCase(color.charAt(i));
				}else {
					this.color += Character.toLowerCase(color.charAt(i));
				}
			}
		}
	}
	
	
	
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}



	/**
	 * @param color the color to set
	 */
	


	public double findArea() {
		return this.width * this.height;
	}
	
	public double findPerimeter() {
		return 2 *(this.width + this.height);
	}
	
}
