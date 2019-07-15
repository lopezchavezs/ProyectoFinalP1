package Logica;

public class Prisma {
	
	protected int altura;
	protected Vertice vertice1;
	protected Vertice vertice2;
	
	public Prisma(int altura, Vertice vertice1, Vertice vertice2) {
		super();
		this.altura = altura;
		this.vertice1 = vertice1;
		this.vertice2 = vertice2;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public Vertice getVertice1() {
		return vertice1;
	}

	public void setVertice1(Vertice vertice1) {
		this.vertice1 = vertice1;
	}

	public Vertice getVertice2() {
		return vertice2;
	}

	public void setVertice2(Vertice vertice2) {
		this.vertice2 = vertice2;
	}
	
	abstract float area();

	

}
