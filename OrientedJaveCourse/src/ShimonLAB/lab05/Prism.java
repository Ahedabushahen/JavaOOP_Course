package ShimonLAB.lab05;
public class Prism {
	private double height;
	private Shape2D base;
	private double volume;
	public Prism(Shape2D base,double height) {
		this.base = base;
		this.height = height;
		
	}
	public double volume() {
		volume = (this.base.area()) * (this.height);
		return volume;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public Shape2D getBase() {
		return base;
	}
	public void setBase(Shape2D base) {
		this.base = base;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	@Override
	public String toString() {
		return "Prism [height=" + height + ", base=" + base + ", volume=" + volume + "]";
	}
	}


