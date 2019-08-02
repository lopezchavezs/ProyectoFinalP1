package Logica;

public class Rombo extends Prisma {
	
	private Vertice vertice3;
	private Vertice vertice4;

	public Rombo( float altura, Vertice vertice1, Vertice vertice2, Vertice vertice3, Vertice vertice4, String nombre) {
		super(altura, nombre, vertice2, vertice1);
		this.vertice3 = vertice3;
		this.vertice4 = vertice4;
	}

	public Vertice getVertice3() {
		return vertice3;
	}

	public void setVertice3(Vertice vertice3) {
		this.vertice3 = vertice3;
	}

	public Vertice getVertice4() {
		return vertice4;
	}

	public void setVertice4(Vertice vertice4) {
		this.vertice4 = vertice4;
	}
	
	private float D (Vertice vertice1, Vertice vertice3) {
		return (float) Math.sqrt( (Math.pow(vertice3.getX() - vertice1.getX(), 2)) + (Math.pow(vertice3.getY() - vertice1.getY(), 2)) );	
	}
	
	private float d (Vertice vertice2, Vertice vertice4) {
		return (float) Math.sqrt( (Math.pow(vertice4.getX() - vertice2.getX(), 2)) + (Math.pow(vertice4.getY() - vertice2.getY(), 2)) );	
	}
	
	@Override
	float area() {
		return (D(vertice1, vertice3) / d(vertice2, vertice4))/2;
	}

	@Override
	float perimetro() {
		return (float) ((Math.sqrt( (Math.pow(vertice2.getX() - vertice1.getX(), 2)) + (Math.pow(vertice2.getY() - vertice1.getY(), 2)) ) ) * 4);
	}

}
