package Logica;

import java.io.Serializable;
import java.util.ArrayList;
import Logica.Prisma;




public class Centro_Estudio implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private static final long serialVersionUID = 1L;
	private ArrayList<Estudiante> misEstudiantes;
	private ArrayList<Prisma> misPrismas;
	private static Centro_Estudio centro = null;
	private static Estudiante loginestudiante;
	public static String usuarioestudiante;
	
	public Centro_Estudio() {
		super();
		this.misEstudiantes = new ArrayList<>();
		this.misPrismas = new ArrayList<>();
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
	
	public static String getUsuarioestudiante() {
		return usuarioestudiante;
	}

	public static void setUsuarioestudiante(String usuarioestudiante) {
		Centro_Estudio.usuarioestudiante = usuarioestudiante;
	}

	public void regEstudiantes(Estudiante est) {
    	misEstudiantes.add(est);
    }
	
	public boolean Login(String usuarion, String confin) {
    	boolean login = false;
    	for (Estudiante estudiante : Centro_Estudio.getInstance().getMisEstudiantes()) {
			if(estudiante.getUsuario().equals(usuarion) && estudiante.getContrasenia().equals(confin)) {
				loginestudiante = estudiante;
				login = true;
				Centro_Estudio.usuarioestudiante = estudiante.getUsuario();
			}
		}
    	return login;
    }
    
    
    public void insertarPrisma (Cuadrado aux, String usuario) {
    	//System.out.println(aux.getNombre().toString() + " aqui");
		//aux.setCodigo(1000+misPrismas.size());
    	Estudiante student = findEstudiantebyUsuario(usuario);
    	//Cuadrado aux = new Cuadrado(altura, vert1, vert2, nombre);
    //	getMisPrismas().add(aux);
    	student.getMisPrismas().add(aux);
	}
    public void insertarPrisma (Rectangulo aux, String usuario) {
    	System.out.println(aux.getNombre().toString() + " aqui");
		//aux.setCodigo(1000+misPrismas.size());
    	Estudiante student = findEstudiantebyUsuario(usuario);
		//misPrismas.add(aux);
    	student.getMisPrismas().add(aux);
	}
    public void insertarPrisma (Triangulo aux, String usuario) {
    	System.out.println(aux.getNombre().toString() + " aqui");
		//aux.setCodigo(1000+misPrismas.size());
    	Estudiante student = findEstudiantebyUsuario(usuario);
		//misPrismas.add(aux);
    	student.getMisPrismas().add(aux);
	}
    public void insertarPrisma (Rombo aux, String usuario) {
    	System.out.println(aux.getNombre().toString() + " aqui");
		//aux.setCodigo(1000+misPrismas.size());
    	Estudiante student = findEstudiantebyUsuario(usuario);
		//misPrismas.add(aux);
    	student.getMisPrismas().add(aux);
	}
    public void insertarPrisma (Trapecio aux, String usuario) {
    	System.out.println(aux.getNombre().toString() + " aqui");
		//aux.setCodigo(1000+misPrismas.size());
    	Estudiante student = findEstudiantebyUsuario(usuario);
		//misPrismas.add(aux);
    	student.getMisPrismas().add(aux);
	}
    //public boolean mPrisma()
	
    private Estudiante findEstudiantebyUsuario(String usuario) {
    	Estudiante estudiante = null;
    	boolean find = false;
    	int i = 0;
    	while(i<misEstudiantes.size()&&!find) {
    		if(misEstudiantes.get(i).getUsuario().equalsIgnoreCase(usuario)) {
    			estudiante = misEstudiantes.get(i);
    			find = true;
    		}
    		i++;
    	}
    	return estudiante;
    }
    private Prisma findPrismabycode(String code) {
    	Prisma prisma = null;
    	boolean find = false;
    	int i = 0;
    	while(i<misPrismas.size()&&!find) {
    		if(misPrismas.get(i).getNombre().equalsIgnoreCase(code)) {
    			prisma = misPrismas.get(i);
    			find = true;
    		}
    		i++;
    	}
    	return prisma;
    }

}
