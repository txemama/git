package examen1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Examen1Menu extends JFrame implements ActionListener{

	private static final long serialVersionUID = 12L;
	private JPanel contentPane;
	private JPanel panelBotones;
	private JTextField txtNumero;
	private JLabel lblMensaje;
	private JButton btnEsPrimo;
	private JButton btnCircunferencia;
	private JButton btn10Multiplos;
	private JButton btnParImpar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Examen1Menu frame = new Examen1Menu();
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
	public Examen1Menu() {
		setTitle("Bienvenido anonimo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		txtNumero = new JTextField();
		txtNumero.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				txtNumero.select(0, txtNumero.getText().length());
			}
			@Override
			public void focusLost(FocusEvent e) {
				txtNumero.select(0, 0);
			}
		});
		txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNumero.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtNumero.setText("0");
		contentPane.add(txtNumero, BorderLayout.NORTH);
		txtNumero.setColumns(10);
		
		lblMensaje = new JLabel("Listo");
		lblMensaje.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblMensaje, BorderLayout.SOUTH);
		
		panelBotones = new JPanel();
		contentPane.add(panelBotones, BorderLayout.CENTER);
		panelBotones.setLayout(new GridLayout(2, 2, 0, 0));
		
		btnEsPrimo = new JButton("EsPrimo");
		btnEsPrimo.addActionListener(this);
		btnEsPrimo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelBotones.add(btnEsPrimo);
		
		btnCircunferencia = new JButton("Circunferencia");
		btnCircunferencia.addActionListener(this);
		btnCircunferencia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelBotones.add(btnCircunferencia);
		
		btn10Multiplos = new JButton("10 Multiplos");
		btn10Multiplos.addActionListener(this);
		btn10Multiplos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelBotones.add(btn10Multiplos);
		
		btnParImpar = new JButton("Par o Impar");
		btnParImpar.addActionListener(this);
		btnParImpar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelBotones.add(btnParImpar);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		String mensaje="";
		// obtengo el boton que ha sido pulsado
		Object o = ae.getSource();
		if(o == btnEsPrimo) {
			// si tengo que calcular si es primo
			int n;
			n=Integer.parseInt(txtNumero.getText());
			int divisor = 2;
			boolean esprimo = true;
			while (divisor < n){
				if ((n % divisor) == 0){
					esprimo = false;
					break;
				}
				divisor = divisor + 1;
			}

			if (esprimo){
				mensaje = "El número "+n+" es primo";
			}
			else{
				mensaje = "El número "+n+" no es primo";
			}
			// muestro el mensaje en la etiqueta
			lblMensaje.setText(mensaje);
		}
		else if(o == btnCircunferencia) {
			// si tengo que calcular la circunferencia
			lblMensaje.setText(mensaje);
			double radio = Double.parseDouble(txtNumero.getText());
			double circunferencia;
			circunferencia = 2 * Math.PI * radio;
			mensaje="El valor de la circunferencia de radio "+radio+" es "+circunferencia;
			// muestro el mensaje en la etiqueta
			lblMensaje.setText(mensaje);
		}
		else if(o == btn10Multiplos) {
			// si tengo que calcular los 10 multiplos
			double n = Double.parseDouble(txtNumero.getText());
			double multiplo;
			mensaje="";
			for(int posicion=1;posicion<=10;posicion++) {
				multiplo = n * posicion;
				mensaje = mensaje + multiplo + " ";
			}
			mensaje="Los 10 primeros múltiplos de "+n+" son "+mensaje;
			// muestro el mensaje en la etiqueta
			lblMensaje.setText(mensaje);
		}
		else if(o == btnParImpar) {
			// si tengo que Calcular si el número es par o impar
			int n;
			n=Integer.parseInt(txtNumero.getText());
			if(n % 2 == 0) {
				// si es par
				mensaje = "El número "+n+" es par";
			}
			else {
				// si es impar
				mensaje = "El número "+n+" es impar";
			}
			// muestro el mensaje en la etiqueta
			lblMensaje.setText(mensaje);
		}
	}
}
