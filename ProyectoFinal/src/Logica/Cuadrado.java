package Logica;

public class Cuadrado extends Prisma {

	public Cuadrado(int altura, Vertice vertice1, Vertice vertice2) {
		super(altura, vertice1, vertice2);
		// TODO Auto-generated constructor stub
	}

	private float lado (Vertice vertice1, Vertice vertice2) {
		return (float) Math.sqrt( (Math.pow(vertice2.getX() - vertice1.getX(), 2)) + (Math.pow(vertice2.getY() - vertice2.getY(), 2)) );	
	}
	
	@Override
	float area() {
		return (float) Math.pow(lado(vertice1, vertice2), 2);
	}
	
}
