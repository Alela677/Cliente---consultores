package Views;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import Almacen.Almacen;
import Models.Pasteles;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PastelesView {

	private JFrame frame;
	private JTextField textNombre;
	private JTextField textSabor;
	private JTextField textStock;
	private JTextField textPrecio;
	private JLabel lblURL;
	private JLabel lblNewLabel;
	private int indice;

	/**
	 * Create the application.
	 */
	public PastelesView() {
		initialize();
		frame.setVisible(true);
		printPasteles();
		indice = 0;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 687, 464);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblTitulo = new JLabel("Pasteleria Ernesto");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTitulo.setBounds(237, 11, 182, 55);
		frame.getContentPane().add(lblTitulo);

		JLabel lblNewNombre = new JLabel("Nombre");
		lblNewNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewNombre.setBounds(31, 107, 80, 21);
		frame.getContentPane().add(lblNewNombre);

		JLabel lblNewSabor = new JLabel("Sabor");
		lblNewSabor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewSabor.setBounds(31, 155, 80, 21);
		frame.getContentPane().add(lblNewSabor);

		JLabel lblStock = new JLabel("Stock");
		lblStock.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblStock.setBounds(31, 204, 80, 21);
		frame.getContentPane().add(lblStock);

		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPrecio.setBounds(31, 258, 80, 21);
		frame.getContentPane().add(lblPrecio);

		textNombre = new JTextField();
		textNombre.setEditable(false);
		textNombre.setBounds(121, 109, 127, 20);
		frame.getContentPane().add(textNombre);
		textNombre.setColumns(10);

		textSabor = new JTextField();
		textSabor.setEditable(false);
		textSabor.setBounds(121, 155, 127, 20);
		frame.getContentPane().add(textSabor);
		textSabor.setColumns(10);

		textStock = new JTextField();
		textStock.setEditable(false);
		textStock.setBounds(121, 206, 127, 20);
		frame.getContentPane().add(textStock);
		textStock.setColumns(10);

		textPrecio = new JTextField();
		textPrecio.setEditable(false);
		textPrecio.setBounds(121, 260, 127, 20);
		frame.getContentPane().add(textPrecio);
		textPrecio.setColumns(10);
		
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(18, 378, 114, 23);
		frame.getContentPane().add(btnSalir);

		JLabel lblSubtitulo = new JLabel("Productos");
		lblSubtitulo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSubtitulo.setBounds(292, 61, 149, 21);
		frame.getContentPane().add(lblSubtitulo);

		JButton btnAñadir = new JButton("A\u00F1adir");
		btnAñadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new CrearPView();
			}
		});
		btnAñadir.setBounds(142, 378, 127, 23);
		frame.getContentPane().add(btnAñadir);

		JButton btnAtras = new JButton("<");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Atras();

			}
		});
		btnAtras.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnAtras.setBounds(43, 15, 89, 55);
		frame.getContentPane().add(btnAtras);

		JButton btnSiguiente = new JButton(">");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Delante();	
			}
		});
		btnSiguiente.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnSiguiente.setBounds(528, 12, 89, 54);
		frame.getContentPane().add(btnSiguiente);

		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(292, 107, 325, 289);
		frame.getContentPane().add(lblNewLabel);

		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int eleccion = JOptionPane.showConfirmDialog(btnEliminar, "¿Quieres eliminar el pastel?");
				if (eleccion == 0) {
					Almacen.pasteles.remove(indice);
					JOptionPane.showMessageDialog(btnEliminar, "Pastel borrado");
					printPasteles();
					
					
				
				} else if (eleccion == 1) {

					printPasteles();
				}

				else if (eleccion == 2) {

					printPasteles();
				}
			}
		});
		btnEliminar.setBounds(18, 344, 114, 23);
		frame.getContentPane().add(btnEliminar);

		
	}

	public void printPasteles() {
		
		Pasteles a = Almacen.pasteles.get(indice);
		textNombre.setText(a.getNombre());
		textSabor.setText(a.getSabor());
		textStock.setText(String.valueOf(a.getStock()));
		textPrecio.setText(String.valueOf(a.getPrecio()));
		BufferedImage img;
				
		try {
			img = ImageIO.read(new URL(Almacen.pasteles.get(indice).getUrl()));
			Image image = new ImageIcon(img).getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
			lblNewLabel.setIcon(new ImageIcon(image));
		} catch (Exception e2) {
			lblNewLabel.setVisible(false);
		}
		
	}

	public boolean  Atras() {

		indice--;

		if (indice == Almacen.pasteles.size()) {
			indice = 0;
			return true;
			
		}

		printPasteles();
		return false;
	}

	public boolean Delante() {
		indice++;

		if (indice == Almacen.pasteles.size()) {
			indice = 0;
			return true;
		}

		printPasteles();
		return false;
	}

	
}
