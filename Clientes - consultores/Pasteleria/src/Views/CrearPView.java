package Views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import Almacen.Almacen;
import Models.Pasteles;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CrearPView {

	private JFrame frame;
	private JTextField textNombre;
	private JTextField textSabor;
	private JTextField textStock;
	private JTextField textPrecio;
	private JTextField textURL;

	/**
	 * Create the application.
	 */
	public CrearPView() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 475, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblTitulo = new JLabel("Pasteleria Ernesto");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTitulo.setBounds(140, 0, 182, 43);
		frame.getContentPane().add(lblTitulo);

		JLabel lblCreaTuPastel = new JLabel("Crea tu pastel");
		lblCreaTuPastel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCreaTuPastel.setBounds(173, 45, 128, 14);
		frame.getContentPane().add(lblCreaTuPastel);

		JLabel lblNewNombre = new JLabel("Nombre");
		lblNewNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewNombre.setBounds(84, 122, 80, 21);
		frame.getContentPane().add(lblNewNombre);

		JLabel lblNewSabor = new JLabel("Sabor");
		lblNewSabor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewSabor.setBounds(84, 161, 80, 21);
		frame.getContentPane().add(lblNewSabor);

		JLabel lblStock = new JLabel("Stock");
		lblStock.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblStock.setBounds(84, 205, 80, 21);
		frame.getContentPane().add(lblStock);

		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPrecio.setBounds(84, 248, 80, 21);
		frame.getContentPane().add(lblPrecio);

		textNombre = new JTextField();
		textNombre.setText((String) null);
		textNombre.setColumns(10);
		textNombre.setBounds(174, 124, 127, 20);
		frame.getContentPane().add(textNombre);

		textSabor = new JTextField();
		textSabor.setText((String) null);
		textSabor.setColumns(10);
		textSabor.setBounds(174, 163, 127, 20);
		frame.getContentPane().add(textSabor);

		textStock = new JTextField();
		textStock.setText("0");
		textStock.setColumns(10);
		textStock.setBounds(174, 207, 127, 20);
		frame.getContentPane().add(textStock);

		textPrecio = new JTextField();
		textPrecio.setText("0.0");
		textPrecio.setColumns(10);
		textPrecio.setBounds(174, 250, 127, 20);
		frame.getContentPane().add(textPrecio);

		JLabel lblURL = new JLabel("URL");
		lblURL.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblURL.setBounds(84, 295, 46, 14);
		frame.getContentPane().add(lblURL);

		textURL = new JTextField();
		textURL.setBounds(172, 294, 129, 20);
		frame.getContentPane().add(textURL);
		textURL.setColumns(10);

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				añadirPastel();
			}
			
			
		});
		btnGuardar.setBounds(84, 357, 89, 23);
		frame.getContentPane().add(btnGuardar);

		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				frame.dispose();
				new PastelesView();
				
			}
		});
		btnVolver.setBounds(233, 357, 89, 23);
		frame.getContentPane().add(btnVolver);
	}

	public void añadirPastel() {
		Pasteles a = new Pasteles(textNombre.getText(), textSabor.getText(), Integer.parseInt(textStock.getText()), Double.parseDouble(textPrecio.getText()) , textURL.getText());	
		Almacen.pasteles.add(a);
		frame.dispose();
		new PastelesView();
	}
}
