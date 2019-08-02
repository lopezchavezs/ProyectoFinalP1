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
	private JTextField txtvol;
	private JTextField txtarealat;
	private JTextField txtareatot;
	private JTextField txtcode;
	private JTextField txtnombre;
	private JTextField txtdate;
	private JTextField txtalt;
	private JTextField txtcolor;
	private JTextField txtvertice;

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
		
		txtvol = new JTextField();
		txtvol.setEditable(false);
		txtvol.setEnabled(false);
		txtvol.setBounds(67, 168, 125, 20);
		contentPanel.add(txtvol);
		txtvol.setColumns(10);
		
		JLabel lblAreaLateral = new JLabel("Area Lateral:");
		lblAreaLateral.setBounds(219, 171, 79, 14);
		contentPanel.add(lblAreaLateral);
		
		txtarealat = new JTextField();
		txtarealat.setEnabled(false);
		txtarealat.setEditable(false);
		txtarealat.setBounds(295, 168, 125, 20);
		contentPanel.add(txtarealat);
		txtarealat.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Area Total:");
		lblNewLabel.setBounds(459, 171, 61, 14);
		contentPanel.add(lblNewLabel);
		
		txtareatot = new JTextField();
		txtareatot.setEnabled(false);
		txtareatot.setEditable(false);
		txtareatot.setBounds(525, 168, 125, 20);
		contentPanel.add(txtareatot);
		txtareatot.setColumns(10);
		
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
		
		txtcode = new JTextField();
		txtcode.setEnabled(false);
		txtcode.setEditable(false);
		txtcode.setBounds(242, 57, 136, 20);
		contentPanel.add(txtcode);
		txtcode.setColumns(10);
		
		txtnombre = new JTextField();
		txtnombre.setEditable(false);
		txtnombre.setEnabled(false);
		txtnombre.setBounds(242, 82, 136, 20);
		contentPanel.add(txtnombre);
		txtnombre.setColumns(10);
		
		txtdate = new JTextField();
		txtdate.setEnabled(false);
		txtdate.setEditable(false);
		txtdate.setBounds(242, 107, 136, 20);
		contentPanel.add(txtdate);
		txtdate.setColumns(10);
		
		txtalt = new JTextField();
		txtalt.setEnabled(false);
		txtalt.setEditable(false);
		txtalt.setBounds(502, 57, 148, 20);
		contentPanel.add(txtalt);
		txtalt.setColumns(10);
		
		txtcolor = new JTextField();
		txtcolor.setEnabled(false);
		txtcolor.setEditable(false);
		txtcolor.setBounds(502, 107, 148, 20);
		contentPanel.add(txtcolor);
		txtcolor.setColumns(10);
		
		txtvertice = new JTextField();
		txtvertice.setEnabled(false);
		txtvertice.setEditable(false);
		txtvertice.setBounds(502, 82, 148, 20);
		contentPanel.add(txtvertice);
		txtvertice.setColumns(10);
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
