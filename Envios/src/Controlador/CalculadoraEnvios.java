package Controlador;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.JButton;

public class CalculadoraEnvios extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JComboBox comboBox;
	private JLabel lblNewLabel_3;
	private JSpinner spinner;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraEnvios frame = new CalculadoraEnvios();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculadoraEnvios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow][grow]", "[][][][][][][][][]"));
		
		lblNewLabel = new JLabel("Ciudad Origen:");
		contentPane.add(lblNewLabel, "cell 0 0,aligny baseline");
		
		textField = new JTextField();
		contentPane.add(textField, "cell 1 0 2 1,growx");
		textField.setColumns(10);
		
		rdbtnNewRadioButton = new JRadioButton("Nacional");
		contentPane.add(rdbtnNewRadioButton, "cell 1 1");
		
		rdbtnNewRadioButton_1 = new JRadioButton("Extranjero");
		contentPane.add(rdbtnNewRadioButton_1, "cell 2 1");
		
		lblNewLabel_1 = new JLabel("Ciudad Destino:");
		contentPane.add(lblNewLabel_1, "cell 0 2,alignx trailing");
		
		textField_1 = new JTextField();
		contentPane.add(textField_1, "cell 1 2 2 1,growx");
		textField_1.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Tipo de envio:");
		contentPane.add(lblNewLabel_2, "cell 0 4,alignx trailing");
		
		comboBox = new JComboBox();
		contentPane.add(comboBox, "cell 1 4 2 1,growx");
		
		lblNewLabel_3 = new JLabel("Peso:");
		contentPane.add(lblNewLabel_3, "cell 0 6,alignx right");
		
		spinner = new JSpinner();
		contentPane.add(spinner, "cell 1 6");
		
		btnNewButton = new JButton("Calcular Precio");
		contentPane.add(btnNewButton, "cell 1 8,alignx right");
	}

}
