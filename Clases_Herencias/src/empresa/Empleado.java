package empresa;

public class Empleado extends Staff
{

	//------- Atributos -------
	
	//NO tiene
	
	//------ Constructores ----
	//Hereda de Staff
	
	//Click derecho → Source → Generate contructors from Superclass
	public Empleado(String dni, String nombre, long telefono, int sueldo) //hereda de Persona y de Staff
	{
		super(dni, nombre, telefono, sueldo);
	}

	@Override
	public String toString() 
	{
		return "Empleado [sueldo=" + sueldo + ", dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono + "]";
	}

	
}

