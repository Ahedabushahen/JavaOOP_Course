package ShimonLAB.lab05;

public class Square extends Shape2D {
	private double side;
	public Square(double side) {
		this.side = side;
	}
	@Override
	public double area() {

		return side*side;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}


}
