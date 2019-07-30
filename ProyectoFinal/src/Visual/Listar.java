package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import Logica.Centro_Estudio;
import Logica.Cuadrado;
import Logica.Prisma;
import Logica.Rectangulo;
import Logica.Rombo;
import Logica.Trapecio;
import Logica.Triangulo;

import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Listar extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private JButton btnVistaPrevia;
	private JButton btnmodificar;
	private JButton btncancelar;
	private String nombreprisma;
	private static DefaultTableModel model;
	private static Object[] fila;
	private JLabel lblTipoDePrisma;
	private JComboBox cbxprismtype;

	

	/**
	 * Create the dialog.
	 */
	public Listar() {
		setTitle("Mis prismas");
		setBounds(100, 100, 672, 429);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Listado de Prismas", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(0, 53, 642, 269);
				scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
				panel.add(scrollPane);
				{
					String[] columns = {"Nombre","Base","Area Lateral","Area total","Volumen"};
					table = new JTable();
					table.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent e) {
							if(table.getSelectedRow()>=0) {
								int index = table.getSelectedRow();
								btncancelar.setEnabled(true);
								btnmodificar.setEnabled(true);
								btnVistaPrevia.setEnabled(true);
								nombreprisma = (String) table.getValueAt(index, 0);
							}
						}
					});
					table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
					model = new DefaultTableModel();
					model.setColumnIdentifiers(columns);
					table.setModel(model);
					scrollPane.setViewportView(table);
					
				}
			}
			{
				lblTipoDePrisma = new JLabel("Tipo de prisma:");
				lblTipoDePrisma.setBounds(0, 13, 97, 16);
				panel.add(lblTipoDePrisma);
			}
			
			cbxprismtype = new JComboBox();
			cbxprismtype.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					int selection = cbxprismtype.getSelectedIndex();
					loadprisms(selection);
				}
			});
			cbxprismtype.setModel(new DefaultComboBoxModel(new String[] {"<Todos>", "Cuadrado", "Rectangulo", "Triangulo", "Rombo", "Trapecio"}));
			cbxprismtype.setBounds(109, 10, 140, 22);
			panel.add(cbxprismtype);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				btnVistaPrevia = new JButton("Vista previa");
				btnVistaPrevia.setEnabled(false);
				buttonPane.add(btnVistaPrevia);
			}
			{
			    btnmodificar = new JButton("Modificar");
			    btnmodificar.setEnabled(false);
				btnmodificar.setActionCommand("OK");
				buttonPane.add(btnmodificar);
				getRootPane().setDefaultButton(btnmodificar);
			}
			{
				btncancelar = new JButton("Eliminar");
				btncancelar.setEnabled(false);
				btncancelar.setActionCommand("Cancel");
				buttonPane.add(btncancelar);
			}
		}
	}
	
	public static void loadprisms(int selection) {
		model.setRowCount(0);
		fila = new Object[model.getColumnCount()];
		switch (selection) {
		case 0:
			for (Prisma aux : Centro_Estudio.getInstance().getMisPrismas()) {
				fila[0] = aux.getNombre();
				fila[2] = aux.areaLateral();
				fila[3] = aux.areaTotal();
				fila[4] = aux.volumen();
				if(aux instanceof Cuadrado) {
					fila[1] = "Cuadrado";
				}
				if(aux instanceof Rectangulo) {
					fila[1] = "Rectangulo";
				}
				if(aux instanceof Triangulo) {
					fila[1] = "Triangulo";
				}
				if(aux instanceof Rombo) {
					fila[1] = "Rombo";
				}
				if(aux instanceof Trapecio) {
					fila[1] = "Trapecio";
				}
				model.addRow(fila);
			}
			break;

		case 1:
			for (Prisma aux : Centro_Estudio.getInstance().getMisPrismas()) {
				if(aux instanceof Cuadrado) {
					fila[0] = aux.getNombre();
					fila[1] = "Cuadrado";
					fila[2] = aux.areaLateral();
					fila[3] = aux.areaTotal();
					fila[4] = aux.volumen();
					model.addRow(fila);
				}
			}
			break;
		
		case 2:
			for (Prisma aux : Centro_Estudio.getInstance().getMisPrismas()) {
				if(aux instanceof Rectangulo) {
					fila[0] = aux.getNombre();
					fila[1] = "Rectangulo";
					fila[2] = aux.areaLateral();
					fila[3] = aux.areaTotal();
					fila[4] = aux.volumen();
					model.addRow(fila);
				}
			}
			break;
			
		case 3:
			for (Prisma aux : Centro_Estudio.getInstance().getMisPrismas()) {
				if(aux instanceof Triangulo) {
					fila[0] = aux.getNombre();
					fila[1] = "Triangulo";
					fila[2] = aux.areaLateral();
					fila[3] = aux.areaTotal();
					fila[4] = aux.volumen();
					model.addRow(fila);
				}
			}
			break;
			
		case 4:
			for (Prisma aux : Centro_Estudio.getInstance().getMisPrismas()) {
				if(aux instanceof Rombo) {
					fila[0] = aux.getNombre();
					fila[1] = "Rombo";
					fila[2] = aux.areaLateral();
					fila[3] = aux.areaTotal();
					fila[4] = aux.volumen();
					model.addRow(fila);
				}
			}
			break;
			
		case 5:
			for (Prisma aux : Centro_Estudio.getInstance().getMisPrismas()) {
				if(aux instanceof Trapecio) {
					fila[0] = aux.getNombre();
					fila[1] = "Trapecio";
					fila[2] = aux.areaLateral();
					fila[3] = aux.areaTotal();
					fila[4] = aux.volumen();
					model.addRow(fila);
				}
			}
			break;
		}
	}
}
