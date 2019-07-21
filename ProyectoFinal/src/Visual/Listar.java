package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;

public class Listar extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private JButton btnVistaPrevia;
	private JButton btnmodificar;
	private JButton btncancelar;
	private String nombreprisma;
	private static DefaultTableModel model;

	

	/**
	 * Create the dialog.
	 */
	public Listar() {
		setTitle("Mis prismas");
		setBounds(100, 100, 672, 429);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Listado", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(new BorderLayout(0, 0));
			{
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
				panel.add(scrollPane, BorderLayout.CENTER);
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

}
