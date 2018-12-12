package examen1;

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
import javax.swing.JPasswordField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Examen1Login extends JFrame implements ActionListener{

	private static final long serialVersionUID = 11L;
	private JPanel contentPane;
	private JPanel panelDatos;
	private JTextField txtUsuario;
	private JLabel lblTexto;
	private JLabel lblNmero;
	private JPasswordField pwdPassword;
	private JLabel lblPassword;
	private int intentos = 3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Examen1Login frame = new Examen1Login();
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
	public Examen1Login() {
		setResizable(false);
		setTitle("Examen de Jos\u00E9 Mar\u00EDa De Miguel");
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
		
		lblTexto = new JLabel("Listo");
		lblTexto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTexto.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTexto, BorderLayout.SOUTH);
		
		txtUsuario = new JTextField();
		txtUsuario.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				txtUsuario.select(0, txtUsuario.getText().length());
			}
			@Override
			public void focusLost(FocusEvent e) {
				txtUsuario.select(0, 0);
			}
		});
		txtUsuario.addActionListener(this);
		txtUsuario.setText("Usuario");
		txtUsuario.setColumns(10);
		txtUsuario.setHorizontalAlignment(SwingConstants.LEFT);
		txtUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelDatos.add(txtUsuario);
		
		lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelDatos.add(lblPassword);
		
		pwdPassword = new JPasswordField();
		pwdPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				pwdPassword.setSelectionStart(0);
				String contrasena = new String(pwdPassword.getPassword()); 
				pwdPassword.setSelectionEnd(contrasena.length());
			}
			@Override
			public void focusLost(FocusEvent e) {
				pwdPassword.select(0, 0);
			}
		});
		pwdPassword.addActionListener(this);
		pwdPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		pwdPassword.setText("Password\u2026");
		panelDatos.add(pwdPassword);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// accciones a realizar al pulsar el botón
		// compruebo el usuario y la password
		String usuario = txtUsuario.getText();
		String password = new String(pwdPassword.getPassword());
		String mensaje;
		if(usuario.equals("josemaria") && password.equals("demiguel")) {
			// si los datos coinciden
			mensaje = "Bienvenido "+ txtUsuario.getText();
			// creo la ventana principal
			Examen1Menu e1 = new Examen1Menu();
		  // le cambio el Title
			e1.setTitle(mensaje);
		  // la muestro
			e1.setVisible(true);
		  // oculto la ventana de inicio
		  // this.setVisible(false);
		  // borro de memoria la ventana de inicio
		  this.dispose();
		}
		else {
			// si los datos NO coinciden
			// actualizo los intentos
			intentos = intentos - 1;
			if(intentos > 0) {
				// si quedan intentos
				mensaje = "Error. Los datos no son correctos. Le quedan "+intentos+" intentos";
				lblTexto.setText(mensaje);
			}
			else {
				// si NO quedan intentos
				// salgo de la aplicacion
				System.exit(0);
			}
		}
	}
}
