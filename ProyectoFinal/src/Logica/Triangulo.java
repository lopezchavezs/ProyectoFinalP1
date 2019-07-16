package Logica;

public class Triangulo extends Prisma {
	private Vertice alt_base;

	public Triangulo(int altura, Vertice vertice1, Vertice vertice2, Vertice alt_base) {
		super(altura, vertice1, vertice2);
		this.alt_base = alt_base;
	}

	public Vertice getAlt_base() {
		return alt_base;
	}

	public void setAlt_base(Vertice alt_base) {
		this.alt_base = alt_base;
	}
	

	@Override
	float area() {
		float m1 = (vertice1.getX() * vertice2.getY()) + (vertice2.getX()*alt_base.getY()) + (alt_base.getX() * vertice1.getY());
		float m2 = -(vertice2.getX() * vertice1.getY()) - (alt_base.getX()*vertice2.getY()) - (vertice1.getX() * alt_base.getY());
		
		return (Math.abs(m1+m2))/2;
	}

	@Override
	float perimetro() {
		float lado1 = (float) Math.sqrt( (Math.pow(vertice2.getX() - vertice1.getX(), 2)) + (Math.pow(vertice2.getY() - vertice1.getY(), 2)) );
		float lado2 = (float) Math.sqrt( (Math.pow(alt_base.getX() - vertice1.getX(), 2)) + (Math.pow(alt_base.getY() - vertice1.getY(), 2)) );
		float lado3 =	(float) Math.sqrt( (Math.pow(alt_base.getX() - vertice2.getX(), 2)) + (Math.pow(alt_base.getY() - vertice2.getY(), 2)) );
				return lado1+lado2+lado3;
	}

};
