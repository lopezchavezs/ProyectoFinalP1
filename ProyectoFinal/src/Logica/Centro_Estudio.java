package Logica;

import java.util.ArrayList;

public class Centro_Estudio {
	private ArrayList<Prisma> misPrismas;
	private ArrayList<Estudiante> misEstudiantes;
	private static Centro_Estudio centro = null;

	public Centro_Estudio() {
		super();
		misPrismas = new ArrayList<>();
		misEstudiantes = new ArrayList<>();
	}
	
	public static Centro_Estudio getInstance() {
		if(centro == null ) {
			centro = new Centro_Estudio();
		}
		return centro;
	}

	public ArrayList<Prisma> getMisPrismas() {
		return misPrismas;
	}

	public void setMisPrismas(ArrayList<Estudiante> misEstudiantes) {
		this.misEstudiantes = misEstudiantes;
	}
	
	public ArrayList<Estudiante> getMisEstudiantes() {
		return misEstudiantes;
	}

	public void setMisEstudiantes(ArrayList<Estudiante> misEstudiantes) {
		this.misEstudiantes = misEstudiantes;
	}
	
	

}
