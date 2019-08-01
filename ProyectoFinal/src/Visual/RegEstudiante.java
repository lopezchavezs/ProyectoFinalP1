package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import Logica.Centro_Estudiooo;
import Logica.Estudiante;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegEstudiante extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtnombre;
	private JTextField txtapellido;
	private JTextField txtusuario;
	private JTextField txtcontraseña;
	private JTextField txtconfirm;
	private Estudiante estudiante;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegEstudiante dialog = new RegEstudiante();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegEstudiante() {
		setTitle("Registrar estudiante");
		setBounds(100, 100, 543, 461);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(240, 255, 240));
		contentPanel.setBorder(new TitledBorder(null, "Registrar", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(42, 49, 56, 16);
		contentPanel.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(42, 114, 56, 16);
		contentPanel.add(lblApellido);
		
		JLabel lblNombreDeUsuario = new JLabel("Nombre de usuario");
		lblNombreDeUsuario.setBounds(42, 179, 109, 16);
		contentPanel.add(lblNombreDeUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(42, 244, 80, 16);
		contentPanel.add(lblContrasea);
		
		txtnombre = new JTextField();
		txtnombre.setBounds(201, 44, 116, 22);
		contentPanel.add(txtnombre);
		txtnombre.setColumns(10);
		
		txtapellido = new JTextField();
		txtapellido.setBounds(201, 110, 116, 22);
		contentPanel.add(txtapellido);
		txtapellido.setColumns(10);
		
		txtusuario = new JTextField();
		txtusuario.setBounds(201, 176, 116, 22);
		contentPanel.add(txtusuario);
		txtusuario.setColumns(10);
		
		JLabel lblConfirmeContrasea = new JLabel("Confirme contrase\u00F1a");
		lblConfirmeContrasea.setBounds(42, 309, 128, 16);
		contentPanel.add(lblConfirmeContrasea);
		
		txtcontraseña = new JTextField();
		txtcontraseña.setBounds(201, 242, 116, 22);
		contentPanel.add(txtcontraseña);
		txtcontraseña.setColumns(10);
		
		txtconfirm = new JTextField();
		txtconfirm.setBounds(201, 308, 116, 22);
		contentPanel.add(txtconfirm);
		txtconfirm.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnreg = new JButton("Registrar");
				btnreg.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(txtcontraseña.getText().equals(txtconfirm.getText()) ) {
							JOptionPane.showMessageDialog(null, "Estudiante registrado con exito", "Registrado", JOptionPane.INFORMATION_MESSAGE);
							estudiante = new Estudiante(txtnombre.getText(), txtapellido.getText(), txtusuario.getText(), txtcontraseña.getText());
							Centro_Estudiooo.getInstance().regEstudiantes(estudiante);
						}else {
							JOptionPane.showMessageDialog(null, "Contraseña no coincide", "Atencion", JOptionPane.WARNING_MESSAGE);
						}
					}
				});
				btnreg.setActionCommand("OK");
				buttonPane.add(btnreg);
				getRootPane().setDefaultButton(btnreg);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
