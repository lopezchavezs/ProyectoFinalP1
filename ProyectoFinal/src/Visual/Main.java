package Visual;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {
	
	private Dimension dim;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
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
		menuBar.add(mnPrisma);
		
		JMenuItem mntmCrear = new JMenuItem("Crear");
		mntmCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Crear prisma = new Crear();
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
		mnAdministrador.setEnabled(true);
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
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBscdrll = new JLabel("Bienvenido");
		lblBscdrll.setFont(new Font("Tahoma", Font.PLAIN, 75));
		lblBscdrll.setBounds(44, 485, 404, 203);
		contentPane.add(lblBscdrll);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 75));
		lblUsuario.setBounds(44, 652, 359, 153);
		contentPane.add(lblUsuario);
	}
}
