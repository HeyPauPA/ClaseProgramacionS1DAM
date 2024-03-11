package empresa;

public abstract class Staff extends Persona
{
	//------- Atributos -------
	protected int sueldo;

	//------ Constructores ----
	public Staff(String dni, String nombre, long telefono, int sueldo) 
	{
		super(dni, nombre, telefono);
		this.sueldo = sueldo;
	}

	//-------- Métodos --------
	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	//*Imprimir
	@Override
	public String toString() {
		return "Staff [dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono + ", sueldo=" + sueldo + "]";
	}	
}
