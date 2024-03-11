package Concesionario;

public class Moto extends VehiculoConMotor
{
	//------- Atributos -------

	protected String estilo;

	//------ Constructores ----
	public Moto(String marca, String modelo, int precio, String color, int cilindrada, String combustible,
			String estilo) {
		super(marca, modelo, precio, color, cilindrada, combustible);
		this.estilo = estilo;
	}

	//-------- Métodos --------
	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	//*Imprimir
	@Override
	public String toString() {
		return "Moto [cilindrada=" + cilindrada + ", combustible=" + combustible + ", marca=" + marca + ", modelo="
				+ modelo + ", precio=" + precio + ", color=" + color + ", estilo=" + estilo + "]";
	}
	
	

}
