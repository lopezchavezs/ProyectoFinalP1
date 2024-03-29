package Logica;

public class Cuadrado extends Prisma {

	public Cuadrado( float altura, Vertice vertice1, Vertice vertice2, String nombre) {
		super(altura, nombre, vertice2, vertice1);
		// TODO Auto-generated constructor stub
	}

	private float lado (Vertice vertice1, Vertice vertice2) {
		return (float) Math.sqrt( (Math.pow(vertice2.getX() - vertice1.getX(), 2)) + (Math.pow(vertice2.getY() - vertice2.getY(), 2)) );	
	}
	
	@Override
	float area() {
		return (float) Math.pow(lado(vertice1, vertice2), 2);
	}
	
	@Override
	float perimetro() {
		return (float) (lado(vertice1, vertice2) * 4);
	}

	
}
