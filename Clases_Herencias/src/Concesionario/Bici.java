package Concesionario;

public class Bici extends VehiculoSinMotor
{
	//------- Atributos -------
	protected int marchas;
	
	//------ Constructores ----
	public Bici(String marca, String modelo, int precio, String color, int marchas, String tipo) {
		super(marca, modelo, precio, color);
		this.marchas = marchas;
	}

	//-------- Métodos --------
	public int getMarchas() {
		return marchas;
	}

	public void setMarchas(int marchas) {
		this.marchas = marchas;
	}

	//*Imprimir
	@Override
	public String toString() {
		return "Bici [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", color=" + color + ", marchas="
				+ marchas + "]";
	}
	
}
