package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import Models.Pasteles;

class CrearPViewTest {
	
	private ArrayList<Models.Pasteles> pasteles = new ArrayList<Models.Pasteles>();
	

	
	@Test
	void añadirPastel() {
		Pasteles nuevo = new Pasteles("Bizcocho", "Chocolate", 1, 12.9, "2wCEAAoHCBUWFRgWFRUYGBgZGh0ZGhgaGhwcHB0aHBoaGhoaHBkcIS4lHB4rIRocJjgmKy8xNTU1HCQ7QDs0Py40NTEBDAwMEA8QHxISHjQrJCs0NDQ0NDQ0NDQ0NDQ0NDQ0NDQ0NDQ0NDQ0NDQ0NDQ0NDQ0NDQ0NDQ0NDQ0NDQ0NDQ0NP");
		pasteles.add(nuevo);
		
		System.out.println("**********Pastel introducido*******************");
		System.out.println(pasteles);
	}

}
