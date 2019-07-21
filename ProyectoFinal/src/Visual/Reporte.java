package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class Reporte extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtcantcreados;
	private JTextField txtpromvolumenes;
	private JTextField txtpromlaterales;
	private JTextField txtpromtotales;
	private JTextField txtmasutil;
	private JTextField txtmenosutil;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Reporte dialog = new Reporte();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Reporte() {
		setTitle("Reporte");
		setBounds(100, 100, 498, 439);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new TitledBorder(null, " ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Informacion", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				JLabel lblCantidadDePrismas = new JLabel("Cantidad de prismas creados:");
				lblCantidadDePrismas.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblCantidadDePrismas.setBounds(12, 33, 220, 16);
				panel.add(lblCantidadDePrismas);
			}
			{
				JLabel lblPromedioDeVolumenes = new JLabel("Promedio de volumenes:");
				lblPromedioDeVolumenes.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblPromedioDeVolumenes.setBounds(12, 82, 205, 16);
				panel.add(lblPromedioDeVolumenes);
			}
			{
				JLabel lblPromedioDeAreas = new JLabel("Promedio de areas laterales:");
				lblPromedioDeAreas.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblPromedioDeAreas.setBounds(12, 131, 205, 16);
				panel.add(lblPromedioDeAreas);
			}
			{
				JLabel lblPromedioDeAreas_1 = new JLabel("Promedio de areas totales:");
				lblPromedioDeAreas_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblPromedioDeAreas_1.setBounds(12, 180, 205, 16);
				panel.add(lblPromedioDeAreas_1);
			}
			{
				JLabel lblBaseMasUtilizada = new JLabel("Base mas utilizada:");
				lblBaseMasUtilizada.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblBaseMasUtilizada.setBounds(12, 229, 179, 16);
				panel.add(lblBaseMasUtilizada);
			}
			{
				JLabel lblBaseMenosUtilizada = new JLabel("Base menos utilizada:");
				lblBaseMenosUtilizada.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblBaseMenosUtilizada.setBounds(12, 278, 154, 16);
				panel.add(lblBaseMenosUtilizada);
			}
			{
				txtcantcreados = new JTextField();
				txtcantcreados.setEnabled(false);
				txtcantcreados.setBounds(310, 28, 116, 22);
				panel.add(txtcantcreados);
				txtcantcreados.setColumns(10);
			}
			{
				txtpromvolumenes = new JTextField();
				txtpromvolumenes.setEnabled(false);
				txtpromvolumenes.setBounds(310, 78, 116, 22);
				panel.add(txtpromvolumenes);
				txtpromvolumenes.setColumns(10);
			}
			{
				txtpromlaterales = new JTextField();
				txtpromlaterales.setEnabled(false);
				txtpromlaterales.setBounds(310, 128, 116, 22);
				panel.add(txtpromlaterales);
				txtpromlaterales.setColumns(10);
			}
			{
				txtpromtotales = new JTextField();
				txtpromtotales.setEnabled(false);
				txtpromtotales.setBounds(310, 178, 116, 22);
				panel.add(txtpromtotales);
				txtpromtotales.setColumns(10);
			}
			{
				txtmasutil = new JTextField();
				txtmasutil.setEnabled(false);
				txtmasutil.setBounds(310, 228, 116, 22);
				panel.add(txtmasutil);
				txtmasutil.setColumns(10);
			}
			{
				txtmenosutil = new JTextField();
				txtmenosutil.setEnabled(false);
				txtmenosutil.setBounds(310, 278, 116, 22);
				panel.add(txtmenosutil);
				txtmenosutil.setColumns(10);
			}
		}
	}

}
