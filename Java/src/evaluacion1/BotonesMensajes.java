package evaluacion1;

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
import java.awt.event.ActionEvent;

public class BotonesMensajes extends JFrame implements ActionListener{

	private static final long serialVersionUID = -4133709687458969714L;
	private JPanel contentPane;
	private JPanel panelBotones;
	private JTextField txtNombre;
	private JLabel lblMensaje;
	private JButton btnHola;
	private JButton btnAdios;
	private JButton btnKaixo;
	private JButton btnAgur;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BotonesMensajes frame = new BotonesMensajes();
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
	public BotonesMensajes() {
		setTitle("BotonesMensajes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtNombre.setText("Anonimo");
		contentPane.add(txtNombre, BorderLayout.NORTH);
		txtNombre.setColumns(10);
		
		lblMensaje = new JLabel("No hay Mensaje");
		lblMensaje.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblMensaje, BorderLayout.SOUTH);
		
		panelBotones = new JPanel();
		contentPane.add(panelBotones, BorderLayout.CENTER);
		panelBotones.setLayout(new GridLayout(2, 2, 0, 0));
		
		btnHola = new JButton("Hola");
		btnHola.addActionListener(this);
		btnHola.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelBotones.add(btnHola);
		
		btnAdios = new JButton("Adios");
		btnAdios.addActionListener(this);
		btnAdios.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelBotones.add(btnAdios);
		
		btnKaixo = new JButton("Kaixo");
		btnKaixo.addActionListener(this);
		btnKaixo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelBotones.add(btnKaixo);
		
		btnAgur = new JButton("Agur");
		btnAgur.addActionListener(this);
		btnAgur.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelBotones.add(btnAgur);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		String mensaje="";
		// cojo el texto del boton que se ha pulsado
		// obtengo el boton que ha sido pulsado
		Object o = ae.getSource();
		// obtengo el texto de ese boton y se lo doy a mensaje
		mensaje = ((JButton)o).getText();
		// completo el mensaje con el texto
		mensaje = mensaje + " "+txtNombre.getText();
		// muestro el mensaje en la etiqueta
		lblMensaje.setText(mensaje);
	}

}
