package Models;

public class Pasteles {

	private String nombre;
	private String sabor;
	private int stock;
	private double precio;
	private String url;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public  double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
	public Pasteles(String nombre, String sabor, int stock, double precio, String url) {
		super();
		this.nombre = nombre;
		this.sabor = sabor;
		this.stock = stock;
		this.precio = precio;
		this.url = url;
	}
	
	@Override
	public String toString() {
		return String.format("Pasteles [nombre=%s, sabor=%s, stock=%s, precio=%s, url=%s]", nombre, sabor, stock,
				precio, url);
	}
	
	
	
	
	
	
	
	
	
}

