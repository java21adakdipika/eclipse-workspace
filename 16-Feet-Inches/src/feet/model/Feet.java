package feet.model;

public class Feet {
	
	private int inches;
	private int feet;
	
	public Feet(int inches, int feet) {
		super();
		this.inches = inches;
		this.feet = feet;
	}
	
	public int getInches() {
		return inches;
	}
	
	public void setInches(int inches) {
		this.inches = inches;
	}
	
	public int getFeet() {
		return feet;
	}
	
	public void setFeet(int feet) {
		this.feet = feet;
	}
	
	@Override
	public String toString() {
		return "Feet [inches=" + inches + ", feet=" + feet + "]";
	}
}
