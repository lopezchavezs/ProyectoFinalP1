package Logica;

public class Triangulo extends Prisma {
	private int alt_base;

	public Triangulo(int altura, int vertice1, int vertice2, int alt_base) {
		super(altura, vertice1, vertice2);
		this.alt_base = alt_base;
	}

	public int getAlt_base() {
		return alt_base;
	}

	public void setAlt_base(int alt_base) {
		this.alt_base = alt_base;
	}
	

}
