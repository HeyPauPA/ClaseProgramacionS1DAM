package Concesionario;

public abstract class VehiculoSinMotor extends Vehiculo
{

	//------- Atributos -------
	
	//------ Constructores ----
	public VehiculoSinMotor(String marca, String modelo, int precio, String color) 
	{
		super(marca, modelo, precio, color);
	}

	//*Imprimir
	@Override
	public String toString() 
	{
		return "VehiculoSinMotor [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", color=" + color
				+ "]";
	}

	

}
