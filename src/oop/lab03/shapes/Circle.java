package oop.lab03.shapes; 
import oop.lab03.shapes.interfaces.Shape;

public class Circle implements Shape {

	private double raggio;
	

	public Circle(double raggio) {
		this.raggio = raggio;
	}

	public double calcolaPerimetro() {
		
		return (2*Math.PI*this.raggio);
		
	}

	public double calcolaArea() {
		return (Math.PI*Math.pow(this.raggio, 2));
	}

}
