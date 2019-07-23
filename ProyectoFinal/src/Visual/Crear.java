package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.sun.prism.Image;

import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.*;

public class Crear extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtnombre;
	private JTextField txtv1x;
	private JTextField txtv2x;
	private JTextField txtv3x;
	private JTextField txtv4x;
	private JTextField txtv1y;
	private JTextField txtv2y;
	private JTextField txtv3y;
	private JTextField txtv4y;
	private JTextField txtalturapri;
	private JTextField txtalturabas;

	

	/**
	 * Create the dialog.
	 */
	public Crear() {
		setTitle("Crear Prisma");
		setBounds(100, 100, 450, 456);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Componentes", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNombre = new JLabel("Nombre");
			lblNombre.setBounds(12, 40, 56, 16);
			contentPanel.add(lblNombre);
		}
		
		txtnombre = new JTextField();
		txtnombre.setBounds(12, 65, 116, 22);
		contentPanel.add(txtnombre);
		txtnombre.setColumns(10);
		
		JLabel lblBaseDelPrisma = new JLabel("Base del Prisma");
		lblBaseDelPrisma.setBounds(159, 40, 116, 16);
		contentPanel.add(lblBaseDelPrisma);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(159, 65, 133, 22);
		contentPanel.add(comboBox);
		
		JLabel lblVertice = new JLabel("Vertice 1");
		lblVertice.setBounds(42, 116, 56, 16);
		contentPanel.add(lblVertice);
		
		JLabel lblVertice_1 = new JLabel("Vertice 2");
		lblVertice_1.setBounds(138, 116, 56, 16);
		contentPanel.add(lblVertice_1);
		
		JLabel lblVertice_2 = new JLabel("Vertice 3");
		lblVertice_2.setBounds(235, 116, 56, 16);
		contentPanel.add(lblVertice_2);
		
		JLabel lblVertice_3 = new JLabel("Vertice 4");
		lblVertice_3.setBounds(332, 116, 56, 16);
		contentPanel.add(lblVertice_3);
		
		txtv1x = new JTextField();
		txtv1x.setBounds(40, 145, 61, 22);
		contentPanel.add(txtv1x);
		txtv1x.setColumns(10);
		
		txtv2x = new JTextField();
		txtv2x.setBounds(136, 145, 61, 22);
		contentPanel.add(txtv2x);
		txtv2x.setColumns(10);
		
		txtv3x = new JTextField();
		txtv3x.setBounds(233, 145, 61, 22);
		contentPanel.add(txtv3x);
		txtv3x.setColumns(10);
		
		txtv4x = new JTextField();
		txtv4x.setBounds(330, 145, 61, 22);
		contentPanel.add(txtv4x);
		txtv4x.setColumns(10);
		
		txtv1y = new JTextField();
		txtv1y.setBounds(42, 186, 61, 22);
		contentPanel.add(txtv1y);
		txtv1y.setColumns(10);
		
		txtv2y = new JTextField();
		txtv2y.setBounds(136, 186, 61, 22);
		contentPanel.add(txtv2y);
		txtv2y.setColumns(10);
		
		txtv3y = new JTextField();
		txtv3y.setBounds(234, 186, 59, 22);
		contentPanel.add(txtv3y);
		txtv3y.setColumns(10);
		
		txtv4y = new JTextField();
		txtv4y.setBounds(332, 186, 56, 22);
		contentPanel.add(txtv4y);
		txtv4y.setColumns(10);
		
		JLabel lblX = new JLabel("X");
		lblX.setBounds(12, 151, 16, 16);
		contentPanel.add(lblX);
		
		JLabel lblY = new JLabel("Y");
		lblY.setBounds(12, 192, 17, 16);
		contentPanel.add(lblY);
		
		JLabel lblAltura = new JLabel("Altura del prisma");
		lblAltura.setBounds(12, 247, 116, 16);
		contentPanel.add(lblAltura);
		
		txtalturapri = new JTextField();
		txtalturapri.setBounds(12, 276, 61, 22);
		contentPanel.add(txtalturapri);
		txtalturapri.setColumns(10);
		
		JLabel lblAlturaDeLa = new JLabel("Altura de la base");
		lblAlturaDeLa.setBounds(138, 247, 116, 16);
		contentPanel.add(lblAlturaDeLa);
		
		txtalturabas = new JTextField();
		txtalturabas.setBounds(138, 276, 61, 22);
		contentPanel.add(txtalturabas);
		txtalturabas.setColumns(10);
		
		JButton btnVistaPrevia = new JButton("Vista previa");
		btnVistaPrevia.setBounds(304, 315, 116, 25);
		contentPanel.add(btnVistaPrevia);
		
		JLabel Image11 = new JLabel("");
		java.awt.Image img = new ImageIcon(this.getClass().getResource("/32390.png")).getImage();
		Image11.setIcon(new ImageIcon(img));
		Image11.setBounds(42, 198, 350, 180);
		contentPanel.add(Image11);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new TitledBorder(null, " ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton CrearButton = new JButton("Crear");
				CrearButton.setActionCommand("OK");
				buttonPane.add(CrearButton);
				getRootPane().setDefaultButton(CrearButton);
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
