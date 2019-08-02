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

import Logica.Centro_Estudio;
import Logica.Cuadrado;
import Logica.Prisma;
import Logica.Rectangulo;
import Logica.Rombo;
import Logica.Trapecio;
import Logica.Triangulo;
import Logica.Vertice;


import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
	private JTextField txtCodigo;
	private static final long serialVersionUID = 1L;
	
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
	
	private Centro_Estudio est;
	private Cuadrado cuad;
	private Rectangulo rect;
	private Rombo rom;
	private Triangulo trian;
	private Trapecio trap;
	private Vertice vert;
	private Vertice vert1;
	private Vertice vert2;
	private Vertice vert3;
	private Vertice vert4;
	
	
	

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the dialog.
	 */
	public CalcularPrisma(Centro_Estudio est) {
		this.est = est;
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
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(82, 36, 103, 20);
		contentPanel.add(txtCodigo);
		txtCodigo.setColumns(10);
			
		txtCodigo.equals(String.valueOf(1000));
		
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
				JButton okButton = new JButton("Crear");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
										
					if(rdbtnCuadrado.isSelected()){
						/*cuad.setNombre(txtCodigo.getText());
						cuad.setAltura(Float.valueOf(spn_Altura.getValue().toString()));
						
						vert1 = new Vertice (Float.valueOf(spn_1_x.getValue().toString()), Float.valueOf(spn_1_y.getValue().toString()));
						cuad.setVertice1(vert);
						
						vert2 = new Vertice (Float.valueOf(spn_2_x.getValue().toString()), Float.valueOf(spn_2_y.getValue().toString()));
						cuad.setVertice2(vert);*/
						Cuadrado cuad = new Cuadrado(Float.valueOf(spn_Altura.getValue().toString()), vert1, vert2, txtCodigo.getText());
						//est.insertarPrisma( cuad.getAltura(), cuad.getVertice1(), cuad.getVertice2(), cuad.getNombre(), Centro_Estudio.usuarioestudiante);
						Centro_Estudio.getInstance().insertarPrisma(cuad, Centro_Estudio.getUsuarioestudiante());
					}
					
					if(rdbtnRectangulo.isSelected()){
						
						//rect.setAltura((float) 3.222);
						//rect.setAltura();
						
						vert1 = new Vertice (Float.valueOf(spn_1_x.getValue().toString()), Float.valueOf(spn_1_y.getValue().toString()));
						//rect.setVertice1(vert);

						vert2 = new Vertice (Float.valueOf(spn_2_x.getValue().toString()), Float.valueOf(spn_2_y.getValue().toString()));
						//rect.setVertice2(vert);
						
						vert3 = new Vertice (Float.valueOf(spn_3_x.getValue().toString()), Float.valueOf(spn_3_y.getValue().toString()));
					//	rect.setVertice3(vert);	
						
						rect = new Rectangulo("Lol", Float.valueOf(spn_Altura.getValue().toString()), vert1, vert2, vert3);
						System.out.println(rect.getVertice1().getX());
						
						Centro_Estudio.getInstance().insertarPrisma(rect);
					}
					
					if(rdbtnRombo.isSelected()){
						rom.setAltura(Float.valueOf(spn_Altura.getValue().toString()));
						
						vert = new Vertice (Float.valueOf(spn_1_x.getValue().toString()), Float.valueOf(spn_1_y.getValue().toString()));
						rom.setVertice1(vert);

						vert = new Vertice (Float.valueOf(spn_2_x.getValue().toString()), Float.valueOf(spn_2_y.getValue().toString()));
						rom.setVertice2(vert);
						
						vert = new Vertice (Float.valueOf(spn_3_x.getValue().toString()), Float.valueOf(spn_3_y.getValue().toString()));
						rom.setVertice3(vert);	
						
						vert = new Vertice (Float.valueOf(spn_4_x.getValue().toString()), Float.valueOf(spn_4_y.getValue().toString()));
						rom.setVertice4(vert);
						
						est.insertarPrisma(rom);
						
					}
					
					if(rdbtnTriangulo.isSelected()){
						trian.setAltura(Float.valueOf(spn_Altura.getValue().toString()));
						
						vert = new Vertice (Float.valueOf(spn_1_x.getValue().toString()), Float.valueOf(spn_1_y.getValue().toString()));
						trian.setVertice1(vert);

						vert = new Vertice (Float.valueOf(spn_2_x.getValue().toString()), Float.valueOf(spn_2_y.getValue().toString()));
						trian.setVertice2(vert);
						
						vert = new Vertice (Float.valueOf(spn_3_x.getValue().toString()), Float.valueOf(spn_3_y.getValue().toString()));
						trian.setAlt_base(vert);
						
						est.insertarPrisma(trian);
						
					}
					
					if(rdbtnTrapecio.isSelected()){
						trap.setAltura(Float.valueOf(spn_Altura.getValue().toString()));
						
						vert = new Vertice (Float.valueOf(spn_1_x.getValue().toString()), Float.valueOf(spn_1_y.getValue().toString()));
						trap.setVertice1(vert);

						vert = new Vertice (Float.valueOf(spn_2_x.getValue().toString()), Float.valueOf(spn_2_y.getValue().toString()));
						trap.setVertice2(vert);
						
						vert = new Vertice (Float.valueOf(spn_3_x.getValue().toString()), Float.valueOf(spn_3_y.getValue().toString()));
						trap.setVertice3(vert);
						
						vert = new Vertice (Float.valueOf(spn_4_x.getValue().toString()), Float.valueOf(spn_4_y.getValue().toString()));
						trap.setVertice4(vert);
						
						est.insertarPrisma(trap);
						
						//trap.setAlt_base(alt_base);
							
						}
					
					
			
						JOptionPane.showMessageDialog(null, "Operación satisfactoria", "Información", JOptionPane.INFORMATION_MESSAGE);
						Clean();
						
						
						VerPrisma prisma = new VerPrisma();
						prisma.setModal(true);
						prisma.setVisible(true);
					
					}

					private void Clean() {
						spn_1_x.setValue(0);
						spn_1_y.setValue(0);
					
						spn_2_x.setValue(0);
						spn_2_y.setValue(0);
					
						spn_3_x.setValue(0);
						spn_3_y.setValue(0);
						
						spn_4_x.setValue(0);
						spn_4_y.setValue(0);
						
						spn_Altura.setValue(0);
						
						
						
					}
				});
					
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

