package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

import Logica.Centro_Estudio;
import Logica.Estudiante;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.security.Principal;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtusuario;
	private JPasswordField jpfcontrasena;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				FileInputStream centroin;
				FileOutputStream centroout;
				ObjectInputStream centroread;
				ObjectOutputStream centrowrite;
				try {
					centroin = new FileInputStream("centro.dat");
					centroread = new ObjectInputStream(centroin);
					Centro_Estudio temp = (Centro_Estudio) centroread.readObject();
					Centro_Estudio.setCentro(temp);
					centroin.close();
					centroread.close();
					
				} catch (FileNotFoundException e) {
					try {
						centroout = new FileOutputStream("centro.dat");
						centrowrite = new ObjectOutputStream(centroout);
						Estudiante admin = new Estudiante("Administrador", "Administrador", "admin", "admin");
						Centro_Estudio.getInstance().regEstudiantes(admin);
						centrowrite.writeObject(Centro_Estudio.getInstance());
						centroout.close();
						centrowrite.close();
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
					} 
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					Login frame = new Login();
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
	public Login() {
		setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 336);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new TitledBorder(null, "Ingresar", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLaboratorio = new JLabel("Centro de Estudio Matematico");
		lblLaboratorio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLaboratorio.setHorizontalAlignment(SwingConstants.CENTER);
		lblLaboratorio.setBounds(12, 13, 408, 41);
		contentPane.add(lblLaboratorio);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsuario.setBounds(79, 92, 83, 27);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblContrasea.setBounds(79, 154, 83, 27);
		contentPane.add(lblContrasea);
		
		txtusuario = new JTextField();
		txtusuario.setBounds(205, 95, 116, 22);
		contentPane.add(txtusuario);
		txtusuario.setColumns(10);
		
		jpfcontrasena = new JPasswordField();
		jpfcontrasena.setBounds(205, 157, 116, 22);
		contentPane.add(jpfcontrasena);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				char[] clave = jpfcontrasena.getPassword();
				String confin = new String(clave);
				
				if(Centro_Estudio.getInstance().Login(txtusuario.getText(), confin)) {
					JOptionPane.showMessageDialog(null, "Ha ingresado satisfactoriamente", "INGRESASTE",JOptionPane.INFORMATION_MESSAGE);
				    Main m = new Main();
				    dispose();
				    m.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Contraseña o nombre de usuario incorrecto, por favor intente de nuevo", "Atencion",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnIngresar.setBounds(224, 224, 97, 41);
		contentPane.add(btnIngresar);
		
	}
	public boolean nivelUsuario()
	{
		boolean nivel = false;
		if(txtusuario.getText().equals("Admin")) {
		nivel = true;
		}else {
			nivel = false;
		}
		return nivel;
	}
}
