package empresa;

public abstract class Persona  //clase no instanciable, no se puede crear objeto ← se pone abstract
{
	//------- Atributos -------
	//⚠️Los atributos de una superclase no pueden ser privados, ya que
	//si no no se pueden utilizar por las "subclases" (no es lo mismo 
	//q cuando usas el objeto en otra clase,ahi esta usando solo el sus atributos)
	
	
	//Entonces usamos protected 
	protected String dni;
	protected String nombre;
	protected long telefono;
	
	//------ Constructores ----
	public Persona(String dni, String nombre, long telefono) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.telefono = telefono;
	}

	//-------- Métodos --------
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	//*Imprimir
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono + "]";
	}
	
	
}
