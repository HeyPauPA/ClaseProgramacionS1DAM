package Concesionario;

public abstract class Vehiculo 
{
	//------- Atributos -------

	protected String marca;
	protected String modelo;
	protected int precio;
	protected String color;
	
	//------ Constructores ----
	public Vehiculo(String marca, String modelo, int precio, String color) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.color = color;
	}
	
	//-------- Métodos --------

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	//*Imprimir
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", color=" + color + "]";
	}
	
	

}
