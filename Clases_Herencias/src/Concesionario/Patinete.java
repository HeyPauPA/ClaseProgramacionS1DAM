package Concesionario;

public class Patinete extends VehiculoSinMotor
{
	//------- Atributos -------

	protected int capacidadBateria;

	//------ Constructores ----
	public Patinete(String marca, String modelo, int precio, String color, int capacidadBateria) {
		super(marca, modelo, precio, color);
		this.capacidadBateria = capacidadBateria;
	}

	//-------- Métodos --------
	public int getCapacidadBateria() {
		return capacidadBateria;
	}

	public void setCapacidadBateria(int capacidadBateria) {
		this.capacidadBateria = capacidadBateria;
	}

	//*Imprimir
	@Override
	public String toString() {
		return "Patinete [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", color=" + color
				+ ", capacidadBateria=" + capacidadBateria + "]";
	}
	
	

}
