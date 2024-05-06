package Ejericicio_3;

public class Trabajador 
{
	//------- Atributos -------
	private String nombre;
	private int peonadas;
	
	//------ Constructores ----
	public Trabajador(String nombre, int peonadas) {
		super();
		this.nombre = nombre;
		this.peonadas = peonadas;
	}

	//-------- Getters/Setters --------
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getPeonadas() {
		return peonadas;
	}
	
	public void setPeonadas(int peonadas) {
		this.peonadas = peonadas;
	}

	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", peonadas=" + peonadas + "]";
	}
	
}
