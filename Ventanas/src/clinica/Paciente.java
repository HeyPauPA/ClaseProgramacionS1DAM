package clinica;

public class Paciente 
{
	//------- Atributos -------
 	private String dni;
 	private String nombre;
 	private String compania;
 	
 	//------ Constructores -----
	public Paciente(String dni, String nombre, String compania) 
	{
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.compania = compania;
	}
	
	public Paciente(String dni, String nombre) 
	{
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.compania = "Sin compania";
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

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}
	
	//*Imprimir
	@Override
	public String toString() {
		return "Paciente [dni=" + dni + ", nombre=" + nombre + ", compania=" + compania + "]";
	}
	
	
	
}
