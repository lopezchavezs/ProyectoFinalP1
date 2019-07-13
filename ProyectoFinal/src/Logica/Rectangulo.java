package Logica;

public class Rectangulo extends Prisma {
	private int vertice3;

	public Rectangulo(int altura, int vertice1, int vertice2, int vertice3) {
		super(altura, vertice1, vertice2);
		this.vertice3 = vertice3;
	}

	public int getVertice3() {
		return vertice3;
	}

	public void setVertice3(int vertice3) {
		this.vertice3 = vertice3;
	}
	

}
