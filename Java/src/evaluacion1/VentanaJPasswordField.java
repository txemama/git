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
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class VentanaJPasswordField extends JFrame {

	private static final long serialVersionUID = -7432671980495821429L;
	private JPanel contentPane;
	private JPanel panelDatos;
	private JTextField txtUsuario;
	private JLabel lblTexto;
	private JLabel lblNmero;
	private JButton btnOk;
	private JPasswordField pwdPassword;
	private JLabel lblPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaJPasswordField frame = new VentanaJPasswordField();
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
	public VentanaJPasswordField() {
		setResizable(false);
		setTitle("VentanaJPasswordField");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 656, 120);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panelDatos = new JPanel();
		contentPane.add(panelDatos, BorderLayout.NORTH);
		
		lblNmero = new JLabel("Usuario");
		lblNmero.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelDatos.add(lblNmero);
		
		lblTexto = new JLabel("An\u00F3nimo");
		lblTexto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTexto.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTexto, BorderLayout.SOUTH);
		
		txtUsuario = new JTextField();
		txtUsuario.setText("Usuario");
		txtUsuario.setHorizontalAlignment(SwingConstants.LEFT);
		txtUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// accciones a realizar al pulsar el botón
				// compruebo el usuario y la password
				String usuario = txtUsuario.getText();
				String password = new String(pwdPassword.getPassword());
				String mensaje;
				if(usuario.equals("1dw3") && password.equals("1dw3")) {
					// si los datos coinciden
					mensaje = "Bienvenido "+ txtUsuario.getText();
				}
				else {
					// si los datos NO coinciden
					mensaje = "Datos Incorrectos.";
				}
				lblTexto.setText(mensaje);
			}
		});

		panelDatos.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// accciones a realizar al pulsar el botón
				// compruebo el usuario y la password
				String usuario = txtUsuario.getText();
				String password = new String(pwdPassword.getPassword());
				String mensaje;
				if(usuario.equals("1dw3") && password.equals("1dw3")) {
					// si los datos coinciden
					mensaje = "Bienvenido "+ txtUsuario.getText();
				}
				else {
					// si los datos NO coinciden
					mensaje = "Datos Incorrectos.";
				}
				lblTexto.setText(mensaje);
			}
		});
		
		lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelDatos.add(lblPassword);
		pwdPassword = new JPasswordField();
		pwdPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		pwdPassword.setText("Password\u2026");
		pwdPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// accciones a realizar al pulsar el botón
				// compruebo el usuario y la password
				String usuario = txtUsuario.getText();
				String password = new String(pwdPassword.getPassword());
				String mensaje;
				if(usuario.equals("1dw3") && password.equals("1dw3")) {
					// si los datos coinciden
					mensaje = "Bienvenido "+ txtUsuario.getText();
				}
				else {
					// si los datos NO coinciden
					mensaje = "Datos Incorrectos.";
				}
				lblTexto.setText(mensaje);
			}
		});
		panelDatos.add(pwdPassword);
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelDatos.add(btnOk);
		
		
	}

}
