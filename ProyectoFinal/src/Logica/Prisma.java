package Logica;

public class Prisma {
	protected int Altura;
	protected int vertice1;
	protected int vertice2;
	
	public Prisma(int altura, int vertice1, int vertice2) {
		super();
		this.Altura = altura;
		this.vertice1 = vertice1;
		this.vertice2 = vertice2;
	}

	public int getAltura() {
		return Altura;
	}

	public void setAltura(int altura) {
		Altura = altura;
	}

	public int getVertice1() {
		return vertice1;
	}

	public void setVertice1(int vertice1) {
		this.vertice1 = vertice1;
	}

	public int getVertice2() {
		return vertice2;
	}

	public void setVertice2(int vertice2) {
		this.vertice2 = vertice2;
	}
	
	

}
