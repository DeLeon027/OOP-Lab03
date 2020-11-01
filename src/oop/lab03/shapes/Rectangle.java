package oop.lab03.shapes;

import oop.lab03.shapes.interfaces.Polygon;

public class Rectangle implements Polygon {

	static int NUM_LATI = 4;

	
	private double base;
	private double altezza;
	
	
	
	public Rectangle(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}


	public double calcolaArea() {
		
		return base*altezza;
	}

	
	public double calcolaPerimetro() {
		
		return base*2+altezza*2;
	}

	
	public int getEdgeCount() {
		
		return NUM_LATI;

	}

	

}
