package Logica;

import java.io.Serializable;
public abstract class Prisma implements Serializable{
	
	protected static final long serialVersionUID = 1L;
	//protected int codigo;
	protected float altura;
	protected String nombre;
	protected Vertice vertice1;
	protected Vertice vertice2;
	
	public Prisma( float altura, String nombre, Vertice vertice1, Vertice vertice2) {
		super();
		//this.codigo = codigo;
		this.altura = altura;
		this.nombre = nombre;
		this.vertice1 = vertice1;
		this.vertice2 = vertice2;
	}

	/*public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}*/

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	abstract float perimetro();
	
	public float volumen() {
		return area() * altura;
	}
	
	public float areaLateral() {
		return perimetro() * altura;
	}
	
	public float areaTotal() {
		return areaLateral() + (2*area());
	}


}
