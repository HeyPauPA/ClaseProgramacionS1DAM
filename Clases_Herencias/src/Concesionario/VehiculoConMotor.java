package Concesionario;

public abstract class VehiculoConMotor extends Vehiculo 
{
	//------- Atributos -------

	protected int cilindrada;
	protected String combustible;
	
	//------ Constructores ----
	public VehiculoConMotor(String marca, String modelo, int precio, String color, int cilindrada,
			String combustible) 
	{
		super(marca, modelo, precio, color);
		this.cilindrada = cilindrada;
		this.combustible = combustible;
	}

	//-------- Métodos --------
	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	//*Imprimir
	@Override
	public String toString() {
		return "VehiculoConMotor [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", color=" + color
				+ ", cilindrada=" + cilindrada + ", combustible=" + combustible + "]";
	}
	
	

}
