package Logica;

public class Trapecio extends Prisma {
	private int vertice3;
	private int vertice4;
	private int alt_base;

	public Trapecio(int altura, int vertice1, int vertice2, int vertice3, int vertice4, int alt_base) {
		super(altura, vertice1, vertice2);
		this.alt_base = alt_base;
		this.vertice3 = vertice3;
		this.vertice4 = vertice4;
	}

	public int getVertice3() {
		return vertice3;
	}

	public void setVertice3(int vertice3) {
		this.vertice3 = vertice3;
	}

	public int getVertice4() {
		return vertice4;
	}

	public void setVertice4(int vertice4) {
		this.vertice4 = vertice4;
	}

	public int getAlt_base() {
		return alt_base;
	}

	public void setAlt_base(int alt_base) {
		this.alt_base = alt_base;
	}
	

}
