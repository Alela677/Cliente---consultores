package MainAPP;

import java.util.ArrayList;

import Almacen.Almacen;

import Models.Pasteles;
import Models.Usuarios;
import Views.LoginViews;

public class MainAPP {
		
	

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Usuarios nuevo = new Usuarios("Ale", "nuevo");
		Almacen.usuarios.add(nuevo);
		
		Pasteles p1 = new Pasteles("Palmera", "Kinder", 3, 2.90 , "http://pepelnary.com/wp-content/uploads/2019/07/Palmera-de-Kinder-Bueno.jpg");
		Almacen.pasteles.add(p1);
		
		Pasteles p2 = new Pasteles("Caña", "Huesitos", 3, 2.90 , "https://dhb3yazwboecu.cloudfront.net/997/ASERCELI-CANA-CHOCO_l.png");
		Almacen.pasteles.add(p2);
		
		
		Pasteles p3 = new Pasteles("Caña", "Huesitos", 3, 2.90 , "https://assets.pokemon.com/assets/cms2/img/pokedex/full/001.png");
		Almacen.ventas.add(p3);
		
		
		new LoginViews();
	
		
	
	}

}
