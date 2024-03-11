package empresa;

public class Jefe extends Staff
{
	//------- Atributos -------

	protected String Vehiculo;

	//------ Constructores ----
	public Jefe(String dni, String nombre, long telefono, int sueldo, String vehiculo) 
	{
		super(dni, nombre, telefono, sueldo);
		Vehiculo = vehiculo;
	}

	//-------- Métodos --------
	
	//-------- Métodos Propios --------

	//*Imprimir
	@Override
	public String toString() {
		return "Jefe [sueldo=" + sueldo + ", dni=" + dni + ", nombre=" + nombre + ", "
				+ "telefono=" + telefono + ", Vehiculo=" + Vehiculo + "]";
	}
	

}
