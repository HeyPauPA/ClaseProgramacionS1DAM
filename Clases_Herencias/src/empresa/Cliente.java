package empresa;

public class Cliente extends Persona //LA CLASE HEREDA TODO LO QUE CONTIENE PERSONA
{
	//------- Atributos -------
	//⚠️En el caso de los subtipos, se pone igual protected, por si en 
	// futuras actualizaciones si que tiene un subtipo por debajo
	protected int numeroSocio;
	

	//------ Constructores ----
	public Cliente(String dni, String nombre, long telefono, int numeroSocio) //usas los datos de la superclase persona
	{
		super(dni, nombre, telefono); //ejecutamos el contructor de Persona
		this.numeroSocio = numeroSocio;
	}

	//-------- Métodos --------
	//solo hace los del socio ya que los de persona ya estan creados
	public int getNumeroSocio() {
		return numeroSocio;
	}

	public void setNumeroSocio(int numeroSocio) {
		this.numeroSocio = numeroSocio;
	}

	//*Imprimir
	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono + ""
				+ ", numeroSocio=" + numeroSocio+ "]";
	}

	
}
