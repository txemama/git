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
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.JToolBar;
import javax.swing.ImageIcon;

public class BotonesMensajesMenuBarraEstado extends JFrame implements ActionListener{

	private static final long serialVersionUID = -4133709687458969714L;
	private JPanel contentPane;
	private JPanel panelBotones;
	private JTextField txtNombre;
	private JLabel lblMensaje;
	private JButton btnHola;
	private JButton btnAdios;
	private JButton btnKaixo;
	private JButton btnAgur;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenuItem mntmHola;
	private JMenuItem mntmAdios;
	private JMenuItem mntmKaixo;
	private JMenuItem mntmAgur;
	private JToolBar toolBar;
	private JPanel panelCentral;
	private JButton tbHola;
	private JButton tbAdios;
	private JButton tbKaixo;
	private JButton tbAgur;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BotonesMensajesMenuBarraEstado frame = new BotonesMensajesMenuBarraEstado();
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
	public BotonesMensajesMenuBarraEstado() {
		setTitle("BotonesMensajesMenuBarraEstado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmHola = new JMenuItem("Hola");
		mntmHola.addActionListener(this);
		mntmHola.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, InputEvent.CTRL_MASK));
		mnArchivo.add(mntmHola);
		
		mntmAdios = new JMenuItem("Adios");
		mntmAdios.addActionListener(this);
		mntmAdios.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_MASK));
		mnArchivo.add(mntmAdios);
		
		mntmKaixo = new JMenuItem("Kaixo");
		mntmKaixo.addActionListener(this);
		mntmKaixo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_MASK));
		mnArchivo.add(mntmKaixo);
		
		mntmAgur = new JMenuItem("Agur");
		mntmAgur.addActionListener(this);
		mntmAgur.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, InputEvent.CTRL_MASK));
		mnArchivo.add(mntmAgur);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		toolBar = new JToolBar();
		contentPane.add(toolBar, BorderLayout.NORTH);
		
		tbHola = new JButton("Hola");
		tbHola.addActionListener(this);
		tbHola.setIcon(new ImageIcon(BotonesMensajesMenuBarraEstado.class.getResource("/iconos/nuevo.gif")));
		toolBar.add(tbHola);
		
		tbAdios = new JButton("Adios");
		tbAdios.addActionListener(this);
		tbAdios.setIcon(new ImageIcon(BotonesMensajesMenuBarraEstado.class.getResource("/iconos/guardar.gif")));
		toolBar.add(tbAdios);
		
		tbKaixo = new JButton("Kaixo");
		tbKaixo.addActionListener(this);
		tbKaixo.setIcon(new ImageIcon(BotonesMensajesMenuBarraEstado.class.getResource("/iconos/guardarcomo.gif")));
		toolBar.add(tbKaixo);
		
		tbAgur = new JButton("Agur");
		tbAgur.addActionListener(this);
		tbAgur.setIcon(new ImageIcon(BotonesMensajesMenuBarraEstado.class.getResource("/iconos/abrir.gif")));
		toolBar.add(tbAgur);
		
		panelCentral = new JPanel();
		contentPane.add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(new BorderLayout(0, 0));
		
		txtNombre = new JTextField();
		panelCentral.add(txtNombre, BorderLayout.NORTH);
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtNombre.setText("Anonimo");
		txtNombre.setColumns(10);
		
		panelBotones = new JPanel();
		panelCentral.add(panelBotones);
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
		
		lblMensaje = new JLabel("No hay Mensaje");
		lblMensaje.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblMensaje, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		String mensaje="";
		// cojo el texto del boton que se ha pulsado
		// obtengo el boton que ha sido pulsado
		Object o = ae.getSource();
		
		mensaje = o.getClass().getName();
		
		if(mensaje.equals("javax.swing.JButton")) {
			// si es un boton
			// obtengo el texto de ese boton y se lo doy a mensaje
			mensaje = ((JButton)o).getText();
		}
		else if(mensaje.equals("javax.swing.JMenuItem")) {
			// si es una opcion de menu
			// obtengo el texto de esa opcion y se lo doy a mensaje
			mensaje = ((JMenuItem)o).getText();
		}	
		
		// completo el mensaje con el texto
		mensaje = mensaje + " "+txtNombre.getText();
		// muestro el mensaje en la etiqueta
		lblMensaje.setText(mensaje);
	}
}
