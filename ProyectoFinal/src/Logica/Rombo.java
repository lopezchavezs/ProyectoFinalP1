package Logica;

public class Rombo extends Prisma {
	
	private int vertice3;
	private int vertice4;

	public Rombo(int altura, int vertice1, int vertice2, int vertice3, int vertice4) {
		super(altura, vertice1, vertice2);
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
	

}
