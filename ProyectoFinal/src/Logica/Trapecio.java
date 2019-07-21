package Logica;

public class Trapecio extends Prisma {
	private Vertice vertice3;
	private Vertice vertice4;
	private int alt_base;

	public Trapecio(int altura, Vertice vertice1, Vertice vertice2, Vertice vertice3, Vertice vertice4, int alt_base, String nombre) {
		super(altura, vertice1, vertice2, nombre);
		this.alt_base = alt_base;
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

	public int getAlt_base() {
		return alt_base;
	}

	public void setAlt_base(int alt_base) {
		this.alt_base = alt_base;
	}
	
	
	@Override
	float area() {
		float m1 = (vertice1.getX() * vertice2.getY()) + (vertice2.getX()*vertice3.getY()) + (vertice3.getX() * vertice4.getY() + (vertice4.getX() * vertice1.getY()));
		float m2 = -(vertice2.getX() * vertice1.getY()) - (vertice3.getX()*vertice2.getY()) - (vertice4.getX() * vertice3.getY()) - (vertice1.getX() * vertice4.getY());
		
		return (Math.abs(m1+m2))/2;
	}

	@Override
	float perimetro() {
		float lado1 = (float) Math.sqrt( (Math.pow(vertice2.getX() - vertice1.getX(), 2)) + (Math.pow(vertice2.getY() - vertice1.getY(), 2)) );
		float lado2 = (float) Math.sqrt( (Math.pow(vertice3.getX() - vertice2.getX(), 2)) + (Math.pow(vertice3.getY() - vertice2.getY(), 2)) );
		float lado3 = (float) Math.sqrt( (Math.pow(vertice4.getX() - vertice3.getX(), 2)) + (Math.pow(vertice4.getY() - vertice3.getY(), 2)) );
		float lado4 = (float) Math.sqrt( (Math.pow(vertice1.getX() - vertice4.getX(), 2)) + (Math.pow(vertice1.getY() - vertice4.getY(), 2)) );
		return lado1+lado2+lado3+lado4;
	}
	

}
