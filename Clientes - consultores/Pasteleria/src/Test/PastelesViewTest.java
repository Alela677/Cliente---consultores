package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicSliderUI.ComponentHandler;
import javax.swing.text.JTextComponent;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Almacen.Almacen;
import Models.Pasteles;

class PastelesViewTest {
	private int indice;
	private ArrayList<Models.Pasteles> pasteles = new ArrayList<Models.Pasteles>();
	private Pasteles nuevo;
	private Pasteles nuevo2;
	private Pasteles p3;
	
	@BeforeEach
	void inicializar() {
		 nuevo = new Pasteles("Bizcocho", "Chocolate", 1, 12.9,
				"2wCEAAoHCBUWFRgWFRUYGBgZGh0ZGhgaGhwcHB0aHBoaGhoaHBkcIS4lHB4rIRocJjgmKy8xNTU1HCQ7QDs0Py40NTEBDAwMEA8QHxISHjQrJCs0NDQ0NDQ0NDQ0NDQ0NDQ0NDQ0NDQ0NDQ0NDQ0NDQ0NDQ0NDQ0NDQ0NDQ0NDQ0NDQ0NP");
		 nuevo2 = new Pasteles(null, null, 0, 0, null);
		 p3 = new Pasteles("Caña", "Huesitos", 3, 2.90,
				"https://assets.pokemon.com/assets/cms2/img/pokedex/full/001.png");	
	}
	

	@Test
	void pintarPasteles() {

		nuevo2.setNombre(nuevo.getNombre());
		nuevo2.setSabor(nuevo.getSabor());
		nuevo2.setStock((nuevo.getStock()));
		nuevo2.setPrecio(nuevo.getPrecio());
		nuevo2.setUrl(nuevo.getUrl());

//		System.out.println(nuevo);
//		System.out.println(nuevo2);
	}

	@Test
	void Atras() {

		pasteles.add(nuevo);
		pasteles.add(nuevo2);
		pasteles.add(p3);

		indice--;

		if (indice == (pasteles.size() - 1)) {
			indice = 0;
		}

		System.out.println(pasteles.get(indice));
	}

	@Test
	void Delante() {
		pasteles.add(nuevo);
		pasteles.add(nuevo2);
		pasteles.add(p3);

		indice++;

		if (indice == (pasteles.size())) {
			indice = 0;
		}

		System.out.println(pasteles.get(indice));
		
		
	}

	@Test
	void eliminarPastel() {
		pasteles.add(0, nuevo);
		pasteles.add(1, p3);

		System.out.print(pasteles);

		JTextComponent prueba = null;
		int elegido = JOptionPane.showInternalConfirmDialog(prueba, "¿Quieres eliminar?");

		if (elegido == 0) {
			System.out.println("Eliminado");

		} else if (elegido != 0) {
			System.out.println("Cancelado");
		}
		pasteles.remove(0);

		System.out.println("***********Pateles tras elimar****************");
		System.out.print(pasteles);
	}

}
