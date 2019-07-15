package Logica;

public class Rombo extends Prisma {
	
	private Vertice vertice3;
	private Vertice vertice4;

	public Rombo(int altura, Vertice vertice1, Vertice vertice2, Vertice vertice3, Vertice vertice4) {
		super(altura, vertice1, vertice2);
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
	

}
