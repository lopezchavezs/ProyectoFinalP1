package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import Logica.Centro_Estudiooo;
import Logica.Cuadrado;
import Logica.Prisma;
import Logica.Rectangulo;
import Logica.Rombo;
import Logica.Trapecio;
import Logica.Triangulo;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrismasCreados extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private JButton btnVistaprevia;
	private String nombreprisma;
	private static DefaultTableModel model;
	private static Object[] fila;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			PrismasCreados dialog = new PrismasCreados();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public PrismasCreados() {
		setTitle("Prismas creados");
		setBounds(100, 100, 475, 370);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Listado de prismas", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(6, 67, 441, 203);
				scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
				panel.add(scrollPane);
				{
					String[] columns = {"Base","Altura","Area Lateral","Area total","Volumen"};
					table = new JTable();
					table.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							if(table.getSelectedRow()>=0) {
								int index = table.getSelectedRow();
								btnVistaprevia.setEnabled(true);
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
			
			JLabel lblTipoDePrisma = new JLabel("Tipo de prisma:");
			lblTipoDePrisma.setBounds(12, 26, 97, 16);
			panel.add(lblTipoDePrisma);
			
			JComboBox cmbprism = new JComboBox();
			cmbprism.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					int selection = cmbprism.getSelectedIndex();
					loadprisma(selection);
				}
			});
			cmbprism.setBounds(121, 23, 125, 22);
			panel.add(cmbprism);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				btnVistaprevia = new JButton("Vista previa");
				btnVistaprevia.setActionCommand("Cancel");
				buttonPane.add(btnVistaprevia);
			}
		}
	}
	public static void loadprisma(int selection) {
		model.setRowCount(0);
		fila = new Object[model.getColumnCount()];
		switch (selection) {
		case 0:
			for (Prisma aux : (Centro_Estudiooo.getInstance().getMisPrismas())) {
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
			for (Prisma aux : Centro_Estudiooo.getInstance().getMisPrismas()) {
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
			for (Prisma aux : Centro_Estudiooo.getInstance().getMisPrismas()) {
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
			for (Prisma aux : Centro_Estudiooo.getInstance().getMisPrismas()) {
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
			for (Prisma aux : Centro_Estudiooo.getInstance().getMisPrismas()) {
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
			for (Prisma aux : Centro_Estudiooo.getInstance().getMisPrismas()) {
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
