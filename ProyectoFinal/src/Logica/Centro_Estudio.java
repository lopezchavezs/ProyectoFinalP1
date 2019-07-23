package Logica;

import java.util.ArrayList;

public class Centro_Estudio {
	private ArrayList<Prisma> misPrismas;
	private ArrayList<Estudiante> misEstudiantes;

	public Centro_Estudio() {
		super();
		this.misPrismas = new ArrayList<>();
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
