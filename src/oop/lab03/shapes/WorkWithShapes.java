package oop.lab03.shapes;

import oop.lab03.shapes.interfaces.Shape;

public class WorkWithShapes {
	
	public static void calcolaAreaEPerimetro(Shape shape){
		System.out.println(shape.calcolaArea());
		System.out.println(shape.calcolaPerimetro());
	}
	
	public static void main(String[] args) {
		
		Shape cerchio = new Circle(3);
		Shape quadrato = new Square(6);
		Shape rettangolo = new Rectangle(3,4);
		Shape triangolo = new Triangle(9,8,7);
		
		WorkWithShapes.calcolaAreaEPerimetro(cerchio);
		WorkWithShapes.calcolaAreaEPerimetro(quadrato);
		WorkWithShapes.calcolaAreaEPerimetro(rettangolo);
		WorkWithShapes.calcolaAreaEPerimetro(triangolo);
			
		
	
	}
	
	
}
