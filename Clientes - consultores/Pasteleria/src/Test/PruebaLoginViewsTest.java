package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import javax.swing.text.JTextComponent;

import org.junit.jupiter.api.Test;

import Almacen.Almacen;
import Models.Usuarios;
import junit.framework.Assert;

class PruebaLoginViewsTest {

	private ArrayList<Models.Usuarios> usuarioS = new ArrayList<Usuarios>();

	Usuarios nuevo = new Usuarios("J", "Unit");

	@Test
	void comprobarUsuario() {
		usuarioS.add(nuevo);

		String username = nuevo.getUsername();
		String password = nuevo.getPassword();

		for (Usuarios u : usuarioS) {
			if (username.equals(usuarioS.get(0).getUsername()) && password.equals(usuarioS.get(0).getPassword())) {
				System.out.println("Correcto");
			} else {
				System.out.println("Incorrecto");
			}
			System.out.println("******** Usuario Correcto**********");
			System.out.println(u);
		}

	}

}
