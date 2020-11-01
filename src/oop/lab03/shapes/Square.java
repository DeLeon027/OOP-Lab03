package oop.lab03.shapes;

import oop.lab03.shapes.interfaces.Polygon;

public class Square implements Polygon {
	
	static int NUM_LATI = 4;

	private double lato;
	
	public Square(double lato) {

		this.lato = lato;
	}


	public double calcolaArea() {
		
		return this.lato*this.lato;
	}

	
	public double calcolaPerimetro() {
		
		return this.lato*4;
	}

	
	public int getEdgeCount() {
		
		return NUM_LATI;
	}

	

}
