package Concesionario;

public class Coche extends VehiculoConMotor
{
	//------- Atributos -------

	private int puertas;

	//------ Constructores ----
	public Coche(String marca, String modelo, int precio, String color, int cilindrada, String combustible,
			int puertas) {
		super(marca, modelo, precio, color, cilindrada, combustible);
		this.puertas = puertas;
	}

	//-------- Métodos --------
	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	//*Imprimir
	@Override
	public String toString() {
		return "Coche [cilindrada=" + cilindrada + ", combustible=" + combustible + ", marca=" + marca + ", modelo="
				+ modelo + ", precio=" + precio + ", color=" + color + ", puertas=" + puertas + "]";
	}
	
	

}
