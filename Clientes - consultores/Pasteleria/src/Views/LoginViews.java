package Views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

import Almacen.Almacen;
import Models.Usuarios;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginViews {

	private JFrame frame;
	private JTextField textUsuario;
	private JPasswordField passwordText;

	/**
	 * Create the application.
	 */
	public LoginViews() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 639, 401);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblTitulo = new JLabel("Pasteleria Ernesto");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTitulo.setBounds(208, 11, 182, 55);
		frame.getContentPane().add(lblTitulo);

		JLabel lblSubtitulo = new JLabel("Bienvenido");
		lblSubtitulo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSubtitulo.setBounds(267, 63, 88, 14);
		frame.getContentPane().add(lblSubtitulo);

		JLabel lblUsuario = new JLabel(" Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUsuario.setBounds(162, 135, 67, 24);
		frame.getContentPane().add(lblUsuario);

		JLabel lblContraseña = new JLabel("Contrase\u00F1a");
		lblContraseña.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblContraseña.setBounds(141, 218, 88, 14);
		frame.getContentPane().add(lblContraseña);

		textUsuario = new JTextField();
		textUsuario.setBounds(239, 133, 171, 32);
		frame.getContentPane().add(textUsuario);
		textUsuario.setColumns(10);

		passwordText = new JPasswordField();
		passwordText.setBounds(239, 211, 171, 32);
		frame.getContentPane().add(passwordText);

		JButton btnIniciarSesion = new JButton("Iniciar sesion");
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usuario = textUsuario.getText();
				String password = new String(passwordText.getText());

				for (Usuarios s : Almacen.usuarios) {

					
					
					if (usuario.equals(Almacen.usuarios.get(0).getUsername()) && password.equals(Almacen.usuarios.get(0).getPassword())) {

						JOptionPane.showMessageDialog(btnIniciarSesion, "Login correcto");
						frame.dispose();
						new PastelesView();
						
					} else {
						JOptionPane.showMessageDialog(btnIniciarSesion, "Login incorrecto");
					}
				}
			}
		});
		btnIniciarSesion.setBounds(148, 295, 122, 41);
		frame.getContentPane().add(btnIniciarSesion);

		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			System.exit(0);
			}
		});
		btnSalir.setBounds(322, 295, 122, 41);
		frame.getContentPane().add(btnSalir);
	}


	
}
