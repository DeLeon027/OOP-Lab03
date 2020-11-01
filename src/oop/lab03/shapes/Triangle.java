package oop.lab03.shapes;

import oop.lab03.shapes.interfaces.Polygon;

public class Triangle implements Polygon {
	
	static int NUM_LATI = 3;


	private double lato1;
	private double lato2;
	private double lato3;
	
	
	public Triangle(double lato1, double lato2, double lato3) {

		this.lato1 = lato1;
		this.lato2 = lato2;
		this.lato3 = lato3;
	}


	public double calcolaArea() {
		double semiperimetro=calcolaPerimetro()/2;
		
		return Math.sqrt(semiperimetro*(semiperimetro-lato1)*(semiperimetro-lato2)*(semiperimetro-lato3));
	}

	
	public double calcolaPerimetro() {
		
		return lato1+lato2+lato3;
	}

	
	public int getEdgeCount() {
	
		return NUM_LATI;
	}



}
