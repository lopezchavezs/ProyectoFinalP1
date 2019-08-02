package Visual;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logica.Centro_Estudio;
import Logica.Estudiante;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.awt.Color;

public class Main extends JFrame {
	
	private Dimension dim;
	private JPanel contentPane;
	private Centro_Estudio est;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Main() {
		this.est = est;
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				FileOutputStream centroout;
				ObjectOutputStream centrowrite;
				try {
					centroout = new FileOutputStream("centro.dat");
					centrowrite = new ObjectOutputStream(centroout);
					centrowrite.writeObject(Centro_Estudio.getInstance());
				} catch(FileNotFoundException e) {
					e.printStackTrace();
				}
				catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		});
		setTitle("Centro de estudio matematico");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		dim = super.getToolkit().getScreenSize();
		super.setSize(dim.width, dim.height-50);
		setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnPrisma = new JMenu("Prisma");
		if(Centro_Estudio.getLoginestudiante().getUsuario().equalsIgnoreCase("Admin")){
			mnPrisma.setEnabled(false);
		}
		menuBar.add(mnPrisma);
		
		JMenuItem mntmCrear = new JMenuItem("Crear");
		mntmCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CalcularPrisma prisma = new CalcularPrisma(est);
				prisma.setModal(true);
				prisma.setVisible(true);
			}
		});
		mnPrisma.add(mntmCrear);
		
		JMenuItem mntmListar = new JMenuItem("Listar");
		mntmListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Listar list = new Listar();
				list.setModal(true);
				list.setVisible(true);
			}
		});
		mnPrisma.add(mntmListar);
		
		JMenu mnAdministrador = new JMenu("Administrador");
		
		if(!Centro_Estudio.getLoginestudiante().getUsuario().equalsIgnoreCase("Admin")){
			mnAdministrador.setEnabled(false);
		}
		menuBar.add(mnAdministrador);
		
		
		JMenuItem mntmPrismasCreados = new JMenuItem("Prismas creados");
		mntmPrismasCreados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PrismasCreados pc = new PrismasCreados();
				pc.setModal(true);
				pc.setVisible(true);
			}
		});
		mnAdministrador.add(mntmPrismasCreados);
		
		JMenuItem mntmReporte = new JMenuItem("Reporte");
		mntmReporte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reporte report = new Reporte();
				report.setModal(true);
				report.setVisible(true);
			}
		});
		mnAdministrador.add(mntmReporte);
		
		JMenuItem mntmRegistrarEstudiante = new JMenuItem("Registrar estudiante");
		mntmRegistrarEstudiante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RegEstudiante Reg = new RegEstudiante();
				Reg.setModal(true);
				Reg.setVisible(true);
			}
		});
		mnAdministrador.add(mntmRegistrarEstudiante);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBscdrll = new JLabel("Bienvenido");
		lblBscdrll.setFont(new Font("Tahoma", Font.PLAIN, 75));
		lblBscdrll.setBounds(44, 485, 404, 203);
		contentPane.add(lblBscdrll);
		
		
		JLabel lblUsuario = new JLabel("Usuario: "+Centro_Estudio.usuarioestudiante);
		lblUsuario.setBackground(new Color(245, 255, 250));
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 75));
		lblUsuario.setBounds(44, 652, 667, 153);
		contentPane.add(lblUsuario);
	}
}
