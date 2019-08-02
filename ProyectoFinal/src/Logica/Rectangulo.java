package Logica;

public class Rectangulo extends Prisma {
	
	private Vertice vertice3;
	
	public Rectangulo( String nombre, float altura, Vertice vertice1, Vertice  vertice2, Vertice vertice3) {
		super( altura, nombre, vertice2, vertice1);
		this.vertice3 = vertice3;
	}

	public Vertice getVertice3() {
		return vertice3;
	}

	public void setVertice3(Vertice vertice3) {
		this.vertice3 = vertice3;
	}
	
	
	private float lado (Vertice vertice1, Vertice vertice2) {
		return (float) Math.sqrt( (Math.pow(vertice2.getX() - vertice1.getX(), 2)) + (Math.pow(vertice2.getY() - vertice2.getY(), 2)) );	
	}
	
	private float ladoAltura (Vertice vertice1, Vertice vertice3) {
		return (float) Math.sqrt( (Math.pow(vertice1.getY() - vertice3.getY(), 2)) );	
	}
	
	@Override
	float area() {
		return (lado(vertice1, vertice2) * ladoAltura(vertice1, vertice3));
	}

	@Override
	float perimetro() {
		
		return ( lado(vertice1, vertice2) + ladoAltura(vertice1, vertice3) ) * 2;
	}

}
