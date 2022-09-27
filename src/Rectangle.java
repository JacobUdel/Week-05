
public class Rectangle {
	
	private double width;
	private double length;
	private double area;
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
		this.area = width * length;
	}
	
	public double getWidth() {
		return width;
	}
	public double getLenght() {
		return length;
	}
	public double getArea() {
		return area;
	}
	public void setWidth(double width) {
		this.width = width;
		area = width *length;
	}
	public void setLength(double length) {
		this.length = length;
		area = width *length;
	}

}
