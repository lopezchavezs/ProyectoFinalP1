package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;

import java.awt.image.*;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.UIManager;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class CalcularPrisma extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	
	
	private JPanel Panel_Cuadrado = new JPanel();
	private JPanel Panel_Rombo = new JPanel();
	private JPanel Panel_Triangulo = new JPanel();
	private JPanel Panel_Rec = new JPanel();
	private JPanel Panel_Trapecio = new JPanel();
	
	private JRadioButton rdbtnCuadrado = new JRadioButton();
	private JRadioButton rdbtnRombo = new JRadioButton();
	private JRadioButton rdbtnTriangulo = new JRadioButton();
	private JRadioButton rdbtnRectangulo = new JRadioButton();
	private JRadioButton rdbtnTrapecio = new JRadioButton();
	
	
	private JLabel lblVertice_1;
	private JLabel lblVertice_1_1;
	private JLabel lblVertice_2;
	private JLabel lblVertice_3;
	private JLabel lblAltura;
	private JLabel lblColor;

	private JComboBox cbx_Colores = new JComboBox();
	private JSpinner spn_Altura = new JSpinner();
	private JButton btnVistaPrevia = new JButton();
	
	
	
	private JSpinner spn_1_x = new JSpinner();
	private JSpinner spn_1_y = new JSpinner();
	private JSpinner spn_2_x = new JSpinner();
	private JSpinner spn_2_y = new JSpinner();
	private JSpinner spn_3_x = new JSpinner();
	private JSpinner spn_3_y = new JSpinner();
	private JSpinner spn_4_x = new JSpinner();
	private JSpinner spn_4_y = new JSpinner();
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CalcularPrisma dialog = new CalcularPrisma();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CalcularPrisma() {
		setTitle("Registrar Prisma");
		setBounds(100, 100, 620, 649);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new TitledBorder(null, "Informaci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo:");
		lblCdigo.setBounds(26, 39, 46, 14);
		contentPanel.add(lblCdigo);
		
		textField = new JTextField();
		textField.setBounds(82, 36, 103, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		java.awt.Image imgTriangulo = new ImageIcon(this.getClass().getResource("/triangulo.gif")).getImage();
		java.awt.Image imgCuadrado = new ImageIcon(this.getClass().getResource("/cuadrado.gif")).getImage();
		java.awt.Image imgRombo = new ImageIcon(this.getClass().getResource("/rombo.gif")).getImage();
		java.awt.Image imgRectangulo = new ImageIcon(this.getClass().getResource("/rectangulo.gif")).getImage();
		java.awt.Image imgTrapecio = new ImageIcon(this.getClass().getResource("/trapecio.gif")).getImage();
		
		JPanel Panel_Figuras = new JPanel();
		Panel_Figuras.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Seleccione tipo de prisma", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		Panel_Figuras.setBackground(Color.WHITE);
		Panel_Figuras.setBounds(10, 88, 584, 146);
		contentPanel.add(Panel_Figuras);
		Panel_Figuras.setLayout(null);
		
		JLabel lblCuadrado = new JLabel("");
		lblCuadrado.setBounds(10, 24, 91, 92);
		Panel_Figuras.add(lblCuadrado);
		lblCuadrado.setIcon(new ImageIcon(imgCuadrado));
		
		JLabel lblRombo = new JLabel("");
		lblRombo.setBounds(134, 24, 67, 92);
		Panel_Figuras.add(lblRombo);
		lblRombo.setIcon(new ImageIcon(imgRombo));
		
		JLabel lblTriangulo = new JLabel("");
		lblTriangulo.setBounds(223, 24, 99, 81);
		Panel_Figuras.add(lblTriangulo);
		lblTriangulo.setIcon(new ImageIcon(imgTriangulo));
		
		JLabel lblTrapecio = new JLabel("");
		lblTrapecio.setBounds(446, 13, 114, 92);
		Panel_Figuras.add(lblTrapecio);
		lblTrapecio.setIcon(new ImageIcon(imgTrapecio));
		
		JLabel lblRectangulo = new JLabel("");
		lblRectangulo.setBounds(345, 23, 91, 82);
		Panel_Figuras.add(lblRectangulo);
		lblRectangulo.setIcon(new ImageIcon(imgRectangulo));
		
		rdbtnCuadrado = new JRadioButton("Cuadrado");
		rdbtnCuadrado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rdbtnCuadrado.setSelected(true);
				rdbtnRombo.setSelected(false);
				rdbtnTriangulo.setSelected(false);
				rdbtnRectangulo.setSelected(false);
				rdbtnTrapecio.setSelected(false);
				
				Panel_Cuadrado.setVisible(true);
				Panel_Rombo.setVisible(false);
				Panel_Triangulo.setVisible(false);
				Panel_Rec.setVisible(false);
				Panel_Trapecio.setVisible(false);
			}
		});
		rdbtnCuadrado.setBounds(10, 108, 109, 31);
		Panel_Figuras.add(rdbtnCuadrado);
		rdbtnCuadrado.setForeground(Color.BLACK);
		rdbtnCuadrado.setBackground(Color.WHITE);
		
		rdbtnRombo = new JRadioButton("Rombo");
		rdbtnRombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnCuadrado.setSelected(false);
				rdbtnRombo.setSelected(true);
				rdbtnTriangulo.setSelected(false);
				rdbtnRectangulo.setSelected(false);
				rdbtnTrapecio.setSelected(false);
				
				Panel_Cuadrado.setVisible(false);
				Panel_Rombo.setVisible(true);
				Panel_Triangulo.setVisible(false);
				Panel_Rec.setVisible(false);
				Panel_Trapecio.setVisible(false);
			}
		});
		rdbtnRombo.setBounds(130, 112, 91, 23);
		Panel_Figuras.add(rdbtnRombo);
		rdbtnRombo.setForeground(Color.BLACK);
		rdbtnRombo.setBackground(Color.WHITE);
		
		rdbtnTriangulo = new JRadioButton("Tri\u00E1ngulo");
		rdbtnTriangulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnCuadrado.setSelected(false);
				rdbtnRombo.setSelected(false);
				rdbtnTriangulo.setSelected(true);
				rdbtnRectangulo.setSelected(false);
				rdbtnTrapecio.setSelected(false);
				
				Panel_Cuadrado.setVisible(false);
				Panel_Rombo.setVisible(false);
				Panel_Triangulo.setVisible(true);
				Panel_Rec.setVisible(false);
				Panel_Trapecio.setVisible(false);
			}
			
		});
		rdbtnTriangulo.setBounds(223, 112, 109, 23);
		Panel_Figuras.add(rdbtnTriangulo);
		rdbtnTriangulo.setForeground(Color.BLACK);
		rdbtnTriangulo.setBackground(Color.WHITE);
		
		rdbtnRectangulo = new JRadioButton("Rect\u00E1ngulo");
		rdbtnRectangulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnCuadrado.setSelected(false);
				rdbtnRombo.setSelected(false);
				rdbtnTriangulo.setSelected(false);
				rdbtnRectangulo.setSelected(true);
				rdbtnTrapecio.setSelected(false);
				
				Panel_Cuadrado.setVisible(false);
				Panel_Rombo.setVisible(false);
				Panel_Triangulo.setVisible(false);
				Panel_Rec.setVisible(true);
				Panel_Trapecio.setVisible(false);
			}
		});
		rdbtnRectangulo.setBounds(345, 112, 109, 23);
		Panel_Figuras.add(rdbtnRectangulo);
		rdbtnRectangulo.setForeground(Color.BLACK);
		rdbtnRectangulo.setBackground(Color.WHITE);
		
		rdbtnTrapecio = new JRadioButton("Trapecio");
		rdbtnTrapecio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnCuadrado.setSelected(false);
				rdbtnRombo.setSelected(false);
				rdbtnTriangulo.setSelected(false);
				rdbtnRectangulo.setSelected(false);
				rdbtnTrapecio.setSelected(true);
				
				Panel_Cuadrado.setVisible(false);
				Panel_Rombo.setVisible(false);
				Panel_Triangulo.setVisible(false);
				Panel_Rec.setVisible(false);
				Panel_Trapecio.setVisible(true);
				
			}
		});
		rdbtnTrapecio.setBounds(460, 112, 109, 23);
		Panel_Figuras.add(rdbtnTrapecio);
		rdbtnTrapecio.setForeground(Color.BLACK);
		rdbtnTrapecio.setBackground(Color.WHITE);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		
		Panel_Trapecio = new JPanel();
		Panel_Trapecio.setBackground(Color.WHITE);
		Panel_Trapecio.setForeground(Color.BLACK);
		Panel_Trapecio.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Introduzca datos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		Panel_Trapecio.setBounds(10, 400, 584, 140);
		contentPanel.add(Panel_Trapecio);
		Panel_Trapecio.setLayout(null);
		
		lblVertice_1 = new JLabel("Vertice 1:");
		lblVertice_1.setForeground(Color.BLACK);
		lblVertice_1.setBounds(10, 34, 73, 14);
		Panel_Trapecio.add(lblVertice_1);
		
		lblVertice_1 = new JLabel("Vertice 2:");
		lblVertice_1.setBounds(10, 59, 55, 14);
		Panel_Trapecio.add(lblVertice_1);
		
		lblVertice_2 = new JLabel("Vertice 3:");
		lblVertice_2.setBounds(10, 84, 73, 14);
		Panel_Trapecio.add(lblVertice_2);
		
		lblVertice_3 = new JLabel("Vertice 4:");
		lblVertice_3.setBounds(10, 109, 73, 14);
		Panel_Trapecio.add(lblVertice_3);
		
		lblAltura = new JLabel("Altura:");
		lblAltura.setBounds(251, 34, 55, 14);
		Panel_Trapecio.add(lblAltura);
		
		lblColor = new JLabel("Color:");
		lblColor.setBounds(251, 72, 46, 14);
		Panel_Trapecio.add(lblColor);
		
		spn_1_x = new JSpinner();
		spn_1_x.setBounds(79, 31, 66, 20);
		spn_1_x.setModel(new SpinnerNumberModel(new Float(0.00), null, null, new Float(0.5)));
		Panel_Trapecio.add(spn_1_x);
		
		spn_1_y = new JSpinner();
		spn_1_y.setBounds(155, 31, 66, 20);
		spn_1_y.setModel(new SpinnerNumberModel(new Float(0.00), null, null, new Float(0.5)));
		Panel_Trapecio.add(spn_1_y);
		
		spn_2_x = new JSpinner();
		spn_2_x.setBounds(79, 56, 66, 20);
		spn_2_x.setModel(new SpinnerNumberModel(new Float(0.00), null, null, new Float(0.5)));
		Panel_Trapecio.add(spn_2_x);
		
		spn_2_y = new JSpinner();
		spn_2_y.setBounds(155, 56, 66, 20);
		spn_2_y.setModel(new SpinnerNumberModel(new Float(0.00), null, null, new Float(0.5)));
		Panel_Trapecio.add(spn_2_y);
		
		spn_3_x = new JSpinner();
		spn_3_x.setBounds(79, 81, 66, 20);
		spn_3_x.setModel(new SpinnerNumberModel(new Float(0.00), null, null, new Float(0.5)));
		Panel_Trapecio.add(spn_3_x);
		
		spn_3_y = new JSpinner();
		spn_3_y.setBounds(155, 81, 66, 20);
		spn_3_y.setModel(new SpinnerNumberModel(new Float(0.00), null, null, new Float(0.5)));
		Panel_Trapecio.add(spn_3_y);
		
		spn_4_x  = new JSpinner();
		spn_4_x.setBounds(79, 106, 66, 20);
		spn_4_x.setModel(new SpinnerNumberModel(new Float(0.00), null, null, new Float(0.5)));
		Panel_Trapecio.add(spn_4_x);
		
		spn_4_y = new JSpinner();
		spn_4_y.setBounds(155, 106, 66, 20);
		spn_4_y.setModel(new SpinnerNumberModel(new Float(0.00), null, null, new Float(0.5)));
		Panel_Trapecio.add(spn_4_y);
		
		spn_Altura= new JSpinner();
		spn_Altura.setBounds(299, 31, 78, 20);
		spn_Altura.setModel(new SpinnerNumberModel(new Float(0.00), null, null, new Float(0.5)));
		Panel_Trapecio.add(spn_Altura);
		
		btnVistaPrevia = new JButton("Vista Previa");
		btnVistaPrevia.setBounds(433, 58, 125, 40);
		Panel_Trapecio.add(btnVistaPrevia);
		
		cbx_Colores = new JComboBox();
		cbx_Colores.setModel(new DefaultComboBoxModel(new String[] {"Blanco", "Rojo", "Amarillo"}));
		cbx_Colores.setBounds(299, 69, 78, 20);
		Panel_Trapecio.add(cbx_Colores);
		

		//////////////////////////////////////////////////////////////////////////////////////////////////////
		
		Panel_Rec = new JPanel();
		Panel_Rec.setBackground(Color.WHITE);
		Panel_Rec.setForeground(Color.BLACK);
		Panel_Rec.setBounds(10, 400, 584, 140);
		contentPanel.add(Panel_Rec);
		Panel_Rec.setLayout(null);
		Panel_Rec.setForeground(Color.BLACK);
		Panel_Rec.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Introduzca datos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		Panel_Rec.setBackground(Color.WHITE);
		
		lblVertice_1_1 = new JLabel("Vertice 1:");
		lblVertice_1_1.setForeground(Color.BLACK);
		lblVertice_1_1.setBounds(10, 34, 73, 14);
		Panel_Rec.add(lblVertice_1_1);
		
		lblVertice_1 = new JLabel("Vertice 2:");
		lblVertice_1.setBounds(10, 59, 55, 14);
		Panel_Rec.add(lblVertice_1);
		
		lblVertice_2 = new JLabel("Vertice 3:");
		lblVertice_2.setBounds(10, 84, 73, 14);
		Panel_Rec.add(lblVertice_2);
		
	
		
		lblAltura = new JLabel("Altura:");
		lblAltura.setBounds(251, 34, 55, 14);
		Panel_Rec.add(lblAltura);
		
		lblColor = new JLabel("Color:");
		lblColor.setBounds(251, 72, 46, 14);
		Panel_Rec.add(lblColor);
		
		spn_1_x = new JSpinner();
		spn_1_x.setBounds(79, 31, 66, 20);
		spn_1_x.setModel(new SpinnerNumberModel(new Float(0.00), null, null, new Float(0.5)));
		Panel_Rec.add(spn_1_x);
		
		spn_1_y = new JSpinner();
		spn_1_y.setBounds(155, 31, 66, 20);
		spn_1_y.setModel(new SpinnerNumberModel(new Float(0.00), null, null, new Float(0.5)));
		Panel_Rec.add(spn_1_y);
		
		spn_2_x = new JSpinner();
		spn_2_x.setBounds(79, 56, 66, 20);
		spn_2_x.setModel(new SpinnerNumberModel(new Float(0.00), null, null, new Float(0.5)));
		Panel_Rec.add(spn_2_x);
		
		spn_2_y = new JSpinner();
		spn_2_y.setBounds(155, 56, 66, 20);
		spn_2_y.setModel(new SpinnerNumberModel(new Float(0.00), null, null, new Float(0.5)));
		Panel_Rec.add(spn_2_y);
		
		spn_3_x = new JSpinner();
		spn_3_x.setBounds(79, 81, 66, 20);
		spn_3_x.setModel(new SpinnerNumberModel(new Float(0.00), null, null, new Float(0.5)));
		Panel_Rec.add(spn_3_x);
		
		spn_3_y = new JSpinner();
		spn_3_y.setBounds(155, 81, 66, 20);
		spn_3_y.setModel(new SpinnerNumberModel(new Float(0.00), null, null, new Float(0.5)));
		Panel_Rec.add(spn_3_y);
		
		spn_Altura= new JSpinner();
		spn_Altura.setBounds(299, 31, 78, 20);
		spn_Altura.setModel(new SpinnerNumberModel(new Float(0.00), null, null, new Float(0.5)));
		Panel_Rec.add(spn_Altura);
		
		btnVistaPrevia = new JButton("Vista Previa");
		btnVistaPrevia.setBounds(433, 58, 125, 40);
		Panel_Rec.add(btnVistaPrevia);
		
		cbx_Colores = new JComboBox();
		cbx_Colores.setModel(new DefaultComboBoxModel(new String[] {"Blanco", "Rojo", "Amarillo"}));
		cbx_Colores.setBounds(299, 69, 78, 20);
		Panel_Rec.add(cbx_Colores);
		
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		
		Panel_Triangulo = new JPanel();
		Panel_Triangulo.setBackground(Color.WHITE);
		Panel_Triangulo.setForeground(Color.BLACK);
		Panel_Triangulo.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Introduzca datos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		Panel_Triangulo.setBounds(10, 400, 584, 140);
		contentPanel.add(Panel_Triangulo);
		Panel_Triangulo.setLayout(null);
		
		lblVertice_1 = new JLabel("Vertice 1:");
		lblVertice_1.setBounds(10, 34, 73, 14);
		Panel_Triangulo.add(lblVertice_1);
		
		lblVertice_1 = new JLabel("Vertice 2:");
		lblVertice_1.setBounds(10, 59, 55, 14);
		Panel_Triangulo.add(lblVertice_1);
		
		lblVertice_2 = new JLabel("Vertice 3:");
		lblVertice_2.setBounds(10, 84, 73, 14);
		Panel_Triangulo.add(lblVertice_2);
		
		lblVertice_3 = new JLabel("Vertice 4:");
		lblVertice_3.setBounds(10, 109, 73, 14);
		Panel_Triangulo.add(lblVertice_3);
		
		lblAltura = new JLabel("Altura:");
		lblAltura.setBounds(251, 34, 55, 14);
		Panel_Triangulo.add(lblAltura);
		
		lblColor = new JLabel("Color:");
		lblColor.setBounds(251, 72, 46, 14);
		Panel_Triangulo.add(lblColor);
		
		spn_1_x = new JSpinner();
		spn_1_x.setBounds(79, 31, 66, 20);
		spn_1_x.setModel(new SpinnerNumberModel(new Float(0.00), null, null, new Float(0.5)));
		Panel_Triangulo.add(spn_1_x);
		
		spn_1_y = new JSpinner();
		spn_1_y.setBounds(155, 31, 66, 20);
		spn_1_y.setModel(new SpinnerNumberModel(new Float(0.00), null, null, new Float(0.5)));
		Panel_Triangulo.add(spn_1_y);
		
		spn_2_x = new JSpinner();
		spn_2_x.setBounds(79, 56, 66, 20);
		spn_2_x.setModel(new SpinnerNumberModel(new Float(0.00), null, null, new Float(0.5)));
		Panel_Triangulo.add(spn_2_x);
		
		spn_2_y = new JSpinner();
		spn_2_y.setBounds(155, 56, 66, 20);
		spn_2_y.setModel(new SpinnerNumberModel(new Float(0.00), null, null, new Float(0.5)));
		Panel_Triangulo.add(spn_2_y);
		
		spn_3_x = new JSpinner();
		spn_3_x.setBounds(79, 81, 66, 20);
		spn_3_x.setModel(new SpinnerNumberModel(new Float(0.00), null, null, new Float(0.5)));
		Panel_Triangulo.add(spn_3_x);
		
		spn_3_y = new JSpinner();
		spn_3_y.setBounds(155, 81, 66, 20);
		spn_3_y.setModel(new SpinnerNumberModel(new Float(0.00), null, null, new Float(0.5)));
		Panel_Triangulo.add(spn_3_y);
		
		spn_4_x  = new JSpinner();
		spn_4_x.setBounds(79, 106, 66, 20);
		spn_4_x.setModel(new SpinnerNumberModel(new Float(0.00), null, null, new Float(0.5)));
		Panel_Triangulo.add(spn_4_x);
		
		spn_4_y = new JSpinner();
		spn_4_y.setBounds(155, 106, 66, 20);
		spn_4_y.setModel(new SpinnerNumberModel(new Float(0.00), null, null, new Float(0.5)));
		Panel_Triangulo.add(spn_4_y);
		
		spn_Altura= new JSpinner();
		spn_Altura.setBounds(299, 31, 78, 20);
		spn_Altura.setModel(new SpinnerNumberModel(new Float(0.00), null, null, new Float(0.5)));
		Panel_Triangulo.add(spn_Altura);
		
		btnVistaPrevia = new JButton("Vista Previa");
		btnVistaPrevia.setBounds(433, 58, 125, 40);
		Panel_Triangulo.add(btnVistaPrevia);
		
		cbx_Colores = new JComboBox();
		cbx_Colores.setModel(new DefaultComboBoxModel(new String[] {"Blanco", "Rojo", "Amarillo"}));
		cbx_Colores.setBounds(299, 69, 78, 20);
		Panel_Triangulo.add(cbx_Colores);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		
		Panel_Rombo = new JPanel();
		Panel_Rombo.setBackground(Color.WHITE);
		Panel_Rombo.setForeground(Color.BLACK);
		Panel_Rombo.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Introduzca datos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		Panel_Rombo.setBounds(10, 400, 584, 140);
		contentPanel.add(Panel_Rombo);
		Panel_Rombo.setLayout(null);
		
		lblVertice_1 = new JLabel("Vertice 1:");
		lblVertice_1.setBounds(10, 34, 73, 14);
		Panel_Rombo.add(lblVertice_1);
		
		lblVertice_1 = new JLabel("Vertice 2:");
		lblVertice_1.setBounds(10, 59, 55, 14);
		Panel_Rombo.add(lblVertice_1);
		
		lblVertice_2 = new JLabel("Vertice 3:");
		lblVertice_2.setBounds(10, 84, 73, 14);
		Panel_Rombo.add(lblVertice_2);
		
		lblVertice_3 = new JLabel("Vertice 4:");
		lblVertice_3.setBounds(10, 109, 73, 14);
		Panel_Rombo.add(lblVertice_3);
		
		lblAltura = new JLabel("Altura:");
		lblAltura.setBounds(251, 34, 55, 14);
		Panel_Rombo.add(lblAltura);
		
		lblColor = new JLabel("Color:");
		lblColor.setBounds(251, 72, 46, 14);
		Panel_Rombo.add(lblColor);
		
		spn_1_x = new JSpinner();
		spn_1_x.setBounds(79, 31, 66, 20);
		spn_1_x.setModel(new SpinnerNumberModel(new Float(0.00), null, null, new Float(0.5)));
		Panel_Rombo.add(spn_1_x);
		
		spn_1_y = new JSpinner();
		spn_1_y.setBounds(155, 31, 66, 20);
		spn_1_y.setModel(new SpinnerNumberModel(new Float(0.00), null, null, new Float(0.5)));
		Panel_Rombo.add(spn_1_y);
		
		spn_2_x = new JSpinner();
		spn_2_x.setBounds(79, 56, 66, 20);
		spn_2_x.setModel(new SpinnerNumberModel(new Float(0.00), null, null, new Float(0.5)));
		Panel_Rombo.add(spn_2_x);
		
		spn_2_y = new JSpinner();
		spn_2_y.setBounds(155, 56, 66, 20);
		spn_2_y.setModel(new SpinnerNumberModel(new Float(0.00), null, null, new Float(0.5)));
		Panel_Rombo.add(spn_2_y);
		
		spn_3_x = new JSpinner();
		spn_3_x.setBounds(79, 81, 66, 20);
		spn_3_x.setModel(new SpinnerNumberModel(new Float(0.00), null, null, new Float(0.5)));
		Panel_Rombo.add(spn_3_x);
		
		spn_3_y = new JSpinner();
		spn_3_y.setBounds(155, 81, 66, 20);
		spn_3_y.setModel(new SpinnerNumberModel(new Float(0.00), null, null, new Float(0.5)));
		Panel_Rombo.add(spn_3_y);
		
		spn_4_x  = new JSpinner();
		spn_4_x.setBounds(79, 106, 66, 20);
		spn_4_x.setModel(new SpinnerNumberModel(new Float(0.00), null, null, new Float(0.5)));
		Panel_Rombo.add(spn_4_x);
		
		spn_4_y = new JSpinner();
		spn_4_y.setBounds(155, 106, 66, 20);
		spn_4_y.setModel(new SpinnerNumberModel(new Float(0.00), null, null, new Float(0.5)));
		Panel_Rombo.add(spn_4_y);
		
		spn_Altura= new JSpinner();
		spn_Altura.setBounds(299, 31, 78, 20);
		spn_Altura.setModel(new SpinnerNumberModel(new Float(0.00), null, null, new Float(0.5)));
		Panel_Rombo.add(spn_Altura);
		
		btnVistaPrevia = new JButton("Vista Previa");
		btnVistaPrevia.setBounds(433, 58, 125, 40);
		Panel_Rombo.add(btnVistaPrevia);
		
		cbx_Colores = new JComboBox();
		cbx_Colores.setModel(new DefaultComboBoxModel(new String[] {"Blanco", "Rojo", "Amarillo"}));
		cbx_Colores.setBounds(299, 69, 78, 20);
		Panel_Rombo.add(cbx_Colores);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		
		Panel_Cuadrado = new JPanel();
		Panel_Cuadrado.setBackground(Color.WHITE);
		Panel_Cuadrado.setForeground(Color.BLACK);
		Panel_Cuadrado.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Introduzca datos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

		Panel_Cuadrado.setBounds(10, 400, 584, 140);
		contentPanel.add(Panel_Cuadrado);
		Panel_Cuadrado.setLayout(null);
		
		lblVertice_1 = new JLabel("Vertice 1:");
		lblVertice_1.setBounds(10, 34, 73, 14);
		Panel_Cuadrado.add(lblVertice_1);
		
		lblVertice_1 = new JLabel("Vertice 2:");
		lblVertice_1.setBounds(10, 59, 55, 14);
		Panel_Cuadrado.add(lblVertice_1);
		
		lblAltura = new JLabel("Altura:");
		lblAltura.setBounds(251, 34, 55, 14);
		Panel_Cuadrado.add(lblAltura);
		
		lblColor = new JLabel("Color:");
		lblColor.setBounds(251, 72, 46, 14);
		Panel_Cuadrado.add(lblColor);
		
		spn_1_x = new JSpinner();
		spn_1_x.setBounds(79, 31, 66, 20);
		spn_1_x.setModel(new SpinnerNumberModel(new Float(0.00), null, null, new Float(0.5)));
		Panel_Cuadrado.add(spn_1_x);
		
		spn_1_y = new JSpinner();
		spn_1_y.setBounds(155, 31, 66, 20);
		spn_1_y.setModel(new SpinnerNumberModel(new Float(0.00), null, null, new Float(0.5)));
		Panel_Cuadrado.add(spn_1_y);
		
		spn_2_x = new JSpinner();
		spn_2_x.setBounds(79, 56, 66, 20);
		spn_2_x.setModel(new SpinnerNumberModel(new Float(0.00), null, null, new Float(0.5)));
		Panel_Cuadrado.add(spn_2_x);
		
		spn_2_y = new JSpinner();
		spn_2_y.setBounds(155, 56, 66, 20);
		spn_2_y.setModel(new SpinnerNumberModel(new Float(0.00), null, null, new Float(0.5)));
		Panel_Cuadrado.add(spn_2_y);
		
		spn_Altura= new JSpinner();
		spn_Altura.setBounds(299, 31, 78, 20);
		spn_Altura.setModel(new SpinnerNumberModel(new Float(0.00), null, null, new Float(0.5)));
		Panel_Cuadrado.add(spn_Altura);
		
		btnVistaPrevia = new JButton("Vista Previa");
		btnVistaPrevia.setBounds(433, 58, 125, 40);
		Panel_Cuadrado.add(btnVistaPrevia);
		
		cbx_Colores = new JComboBox();
		cbx_Colores.setModel(new DefaultComboBoxModel(new String[] {"Blanco", "Rojo", "Amarillo"}));
		cbx_Colores.setBounds(299, 69, 78, 20);
		Panel_Cuadrado.add(cbx_Colores);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Calcular");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
