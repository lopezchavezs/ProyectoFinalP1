package Logica;

import java.io.Serializable;
import java.util.ArrayList;
import Logica.Prisma;




public class Centro_Estudiooo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private static final long serialVersionUID = 1L;
	private ArrayList<Estudiante> misEstudiantes;
	private ArrayList<Prisma> misPrismas;
	private static Centro_Estudiooo centro = null;
	private static Estudiante loginestudiante;
	
	public Centro_Estudiooo() {
		super();
		this.misEstudiantes = new ArrayList<>();
		this.misPrismas = new ArrayList<>();
	}
	
	public static Centro_Estudiooo getInstance() {
		if(centro == null ) {
			centro = new Centro_Estudiooo();
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
	
	public static Centro_Estudiooo getCentro() {
		return centro;
	}

	public static void setCentro(Centro_Estudiooo centro) {
		Centro_Estudiooo.centro = centro;
	}

	public static Estudiante getLoginestudiante() {
		return loginestudiante;
	}

	public static void setLoginestudiante(Estudiante loginestudiante) {
		Centro_Estudiooo.loginestudiante = loginestudiante;
	}
   
	
	
	
	
	public void regEstudiantes(Estudiante est) {
    	misEstudiantes.add(est);
    }
	
    public boolean Login(String usuario, String confin) {
    	boolean login = false;
    	for (Estudiante estudiante : misEstudiantes) {
			if(estudiante.getUsuario().equals(usuario) && estudiante.getContrasenia().equals(confin)) {
				loginestudiante = estudiante;
				login = true;
			}
		}
    	return login;
    }
    
    public void insertarPrisma (Prisma aux) {
    	System.out.println(aux.getNombre().toString() + " aqui");
		//aux.setCodigo(1000+misPrismas.size());
		misPrismas.add(aux);
	}
	

}
