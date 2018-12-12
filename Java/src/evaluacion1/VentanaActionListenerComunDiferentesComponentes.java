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

import javax.swing.JButton;

public class VentanaActionListenerComunDiferentesComponentes extends JFrame implements ActionListener{

	private static final long serialVersionUID = -5703980640082157508L;
	private JPanel contentPane;
	private JPanel panelBotones;
	private JLabel lblTexto;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	
	/* Launch the application. */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaActionListenerComunDiferentesComponentes frame = new VentanaActionListenerComunDiferentesComponentes();
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
	public VentanaActionListenerComunDiferentesComponentes() {
		setTitle("VentanaActionListenerComunDiferentesComponentes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 127);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		lblTexto = new JLabel("Ning\u00FAn bot\u00F3n pulsado");
		lblTexto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTexto.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTexto, BorderLayout.NORTH);
		
		panelBotones = new JPanel();
		contentPane.add(panelBotones, BorderLayout.SOUTH);
		
		btn1 = new JButton("1");
		btn1.addActionListener(this);
		panelBotones.add(btn1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(this);
		panelBotones.add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(this);
		panelBotones.add(btn3);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// obtengo sobre que componente se ha realizado la accion
		Object o = ae.getSource();
		
		String mensaje="";
		
		// compruebo que boton se ha pulsado
		if(o == btn1) {
			mensaje ="Se ha pulsado el 1";
		}
		else if(o == btn2) {
			mensaje ="Se ha pulsado el 2";
		}
		else if(o == btn3) {
			mensaje ="Se ha pulsado el 3";
		}

		this.lblTexto.setText(mensaje);
	}

}
