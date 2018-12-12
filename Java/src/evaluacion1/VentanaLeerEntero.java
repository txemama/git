package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class VentanaLeerEntero extends JFrame {

	private static final long serialVersionUID = -7432671980495821429L;
	private JPanel contentPane;
	private JPanel panelDatos;
	private JTextField txtNumero;
	private JLabel lblResultado;
	private JLabel lblNmero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLeerEntero frame = new VentanaLeerEntero();
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
	public VentanaLeerEntero() {
		setResizable(false);
		setTitle("VentanaLeerEntero");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 656, 120);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panelDatos = new JPanel();
		contentPane.add(panelDatos, BorderLayout.NORTH);
		
		lblNmero = new JLabel("N\u00FAmero:");
		lblNmero.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelDatos.add(lblNmero);
		
		lblResultado = new JLabel("No se ha introducido un n\u00FAmero");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblResultado, BorderLayout.SOUTH);
		
		txtNumero = new JTextField();
		txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNumero.setText("0");
		txtNumero.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtNumero.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
			  // accciones a realizar al pulsar el botón
				 String mensaje;
				 mensaje = "El número introducido es el "+ txtNumero.getText();
				lblResultado.setText(mensaje);
			}
			});

		panelDatos.add(txtNumero);
		txtNumero.setColumns(10);
		
		
	}

}
