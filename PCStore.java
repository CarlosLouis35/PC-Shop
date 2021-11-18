import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import java.awt.TextArea;
import javax.swing.JFormattedTextField;
import java.awt.Color;

public class PCStore extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCliente;
	private JTextField txtServicio;
	private JTextField txtPrecio;
	private JTextField txtTecnico;
	private JTextField txtNumCel;
	private JTextField txtEmail;
	private JTextField txtGarantia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PCStore frame = new PCStore();
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
	public PCStore() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 702, 398);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PC Store");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel.setBounds(201, 11, 127, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblCliente.setBounds(10, 55, 93, 14);
		contentPane.add(lblCliente);
		
		JLabel lblServicio = new JLabel("Servicio");
		lblServicio.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblServicio.setBounds(10, 93, 93, 14);
		contentPane.add(lblServicio);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblPrecio.setBounds(10, 128, 93, 14);
		contentPane.add(lblPrecio);
		
		JLabel lblTecnico = new JLabel("Tecnico");
		lblTecnico.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblTecnico.setBounds(10, 163, 93, 14);
		contentPane.add(lblTecnico);
		
		JLabel lblNumeroDeTelefono = new JLabel("Numero de telefono");
		lblNumeroDeTelefono.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblNumeroDeTelefono.setBounds(10, 200, 161, 14);
		contentPane.add(lblNumeroDeTelefono);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblEmail.setBounds(10, 236, 93, 14);
		contentPane.add(lblEmail);
		
		txtCliente = new JTextField();
		txtCliente.setBounds(227, 54, 197, 20);
		contentPane.add(txtCliente);
		txtCliente.setColumns(10);
		
		txtServicio = new JTextField();
		txtServicio.setColumns(10);
		txtServicio.setBounds(227, 92, 197, 20);
		contentPane.add(txtServicio);
		
		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(227, 127, 197, 20);
		contentPane.add(txtPrecio);
		
		txtTecnico = new JTextField();
		txtTecnico.setColumns(10);
		txtTecnico.setBounds(227, 162, 197, 20);
		contentPane.add(txtTecnico);
		
		txtNumCel = new JTextField();
		txtNumCel.setColumns(10);
		txtNumCel.setBounds(227, 199, 197, 20);
		contentPane.add(txtNumCel);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(227, 235, 197, 20);
		contentPane.add(txtEmail);
		
		JLabel lblGarantia = new JLabel("Garantia");
		lblGarantia.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblGarantia.setBounds(10, 271, 93, 14);
		contentPane.add(lblGarantia);
		
		txtGarantia = new JTextField();
		txtGarantia.setColumns(10);
		txtGarantia.setBounds(227, 270, 197, 20);
		contentPane.add(txtGarantia);
		
			JTextArea txtRecibo = new JTextArea();
			txtRecibo.setFont(new Font("Arial Black", Font.BOLD, 12));
			txtRecibo.setForeground(Color.BLACK);
		txtRecibo.setEnabled(false);
		txtRecibo.setEditable(false);
		txtRecibo.setBounds(434, 48, 242, 299);
		contentPane.add(txtRecibo);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		txtRecibo.append ("PC Store \n" + 
						"Cliente: " + txtCliente.getText() + "\n\n" +
						"Servicio: " + txtServicio.getText() + "\n\n" +
						"Precio: " + txtPrecio.getText() + "\n\n" +
						"Tecnico: " + txtTecnico.getText() + "\n\n" +
						"Numero de Telefono: " + txtNumCel.getText() + "\n\n" +
						"Email: " + txtEmail.getText() + "\n\n" +
						"Garantia: " + txtGarantia.getText() + "\n\n"  );
				
			}
		});
		btnSubmit.setBounds(10, 324, 89, 23);
		contentPane.add(btnSubmit);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
			
			
		});
		btnSave.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnSave.setBounds(121, 324, 89, 23);
		contentPane.add(btnSave);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					txtRecibo.print();
				} catch (PrinterException a) {
					// TODO Auto-generated catch block
					a.printStackTrace();
				}
			}
		});
		btnPrint.setBounds(227, 324, 89, 23);
		contentPane.add(btnPrint);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					System.exit(0);
				
				
				
			}
		});
		btnExit.setBounds(335, 324, 89, 23);
		contentPane.add(btnExit);
		
	
	}
}
