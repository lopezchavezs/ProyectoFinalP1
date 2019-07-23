package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;

public class VerPrisma extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VerPrisma dialog = new VerPrisma();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VerPrisma() {
		setBounds(100, 100, 681, 294);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new TitledBorder(null, "Informaci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		
		{
			java.awt.Image imgImagen = new ImageIcon(this.getClass().getResource("/triangulo.gif")).getImage();
			JLabel lblImagen = new JLabel("");
			lblImagen.setBounds(29, 56, 92, 87);
			contentPanel.add(lblImagen);
			lblImagen.setIcon(new ImageIcon(imgImagen));
		}
		{
			JLabel lblPrisma = new JLabel("Prisma:");
			lblPrisma.setBounds(29, 31, 46, 14);
			contentPanel.add(lblPrisma);
		}
		{
			JLabel lblVolumen = new JLabel("Volumen:");
			lblVolumen.setBounds(10, 171, 61, 14);
			contentPanel.add(lblVolumen);
		}
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setEnabled(false);
		textField.setBounds(67, 168, 125, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblAreaLateral = new JLabel("Area Lateral:");
		lblAreaLateral.setBounds(219, 171, 79, 14);
		contentPanel.add(lblAreaLateral);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setEditable(false);
		textField_1.setBounds(295, 168, 125, 20);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Area Total:");
		lblNewLabel.setBounds(459, 171, 61, 14);
		contentPanel.add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setEditable(false);
		textField_2.setBounds(525, 168, 125, 20);
		contentPanel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblBase = new JLabel("Altura:");
		lblBase.setBounds(435, 60, 46, 14);
		contentPanel.add(lblBase);
		
		JLabel lblVerticesVertice = new JLabel("Vertices: ");
		lblVerticesVertice.setBounds(435, 85, 57, 14);
		contentPanel.add(lblVerticesVertice);
		
		JLabel lblColorVerde = new JLabel("Color:");
		lblColorVerde.setBounds(435, 110, 46, 14);
		contentPanel.add(lblColorVerde);
		
		JLabel lblCodigo = new JLabel("C\u00F3digo:");
		lblCodigo.setBounds(157, 60, 43, 14);
		contentPanel.add(lblCodigo);
		
		JLabel lblCreadoPor = new JLabel("Creado por:");
		lblCreadoPor.setBounds(157, 85, 79, 14);
		contentPanel.add(lblCreadoPor);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setBounds(157, 110, 47, 14);
		contentPanel.add(lblFecha);
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setEditable(false);
		textField_3.setBounds(242, 57, 136, 20);
		contentPanel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setEnabled(false);
		textField_4.setBounds(242, 82, 136, 20);
		contentPanel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setEnabled(false);
		textField_5.setEditable(false);
		textField_5.setBounds(242, 107, 136, 20);
		contentPanel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setEnabled(false);
		textField_6.setEditable(false);
		textField_6.setBounds(502, 57, 148, 20);
		contentPanel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setEnabled(false);
		textField_7.setEditable(false);
		textField_7.setBounds(502, 107, 148, 20);
		contentPanel.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setEnabled(false);
		textField_8.setEditable(false);
		textField_8.setBounds(502, 82, 148, 20);
		contentPanel.add(textField_8);
		textField_8.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
			JButton btnVisualizar = new JButton("Visualizar 3D");
			buttonPane.add(btnVisualizar);
			
			JButton btnSiguiente = new JButton("Siguiente");
			buttonPane.add(btnSiguiente);
			{
				JButton okButton = new JButton("Cancelar");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}
}
