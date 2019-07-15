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
	

}
