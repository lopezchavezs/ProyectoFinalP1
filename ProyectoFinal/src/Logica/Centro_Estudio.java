package Logica;

import java.io.Serializable;
import java.util.ArrayList;

public class Centro_Estudio implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private ArrayList<Estudiante> misEstudiantes;
	private static Centro_Estudio centro = null;
	private static Estudiante loginestudiante;
	private ArrayList<Prisma> misPrismas;

	
	public Centro_Estudio() {
		super();
		
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

	public void setMisPrismas(ArrayList<Prisma> misPrismas) {
		this.misPrismas = misPrismas;
	}
	
	public ArrayList<Estudiante> getMisEstudiantes() {
		return misEstudiantes;
	}

	public void setMisEstudiantes(ArrayList<Estudiante> misEstudiantes) {
		this.misEstudiantes = misEstudiantes;
	}
	
	public static Centro_Estudio getCentro() {
		return centro;
	}

	public static void setCentro(Centro_Estudio centro) {
		Centro_Estudio.centro = centro;
	}

	public static Estudiante getLoginestudiante() {
		return loginestudiante;
	}

	public static void setLoginestudiante(Estudiante loginestudiante) {
		Centro_Estudio.loginestudiante = loginestudiante;
	}
    public void regEstudiantes(Estudiante est) {
    	misEstudiantes.add(est);
    }
	
    public boolean Login(String usuario, String confin) {
    	boolean login = false;
    	for (Estudiante estudiante : misEstudiantes) {
			if(estudiante.getUsuario().equals(usuario)) {
				loginestudiante = estudiante;
				login = true;
			}
		}
    	return login;
    }
	

}
