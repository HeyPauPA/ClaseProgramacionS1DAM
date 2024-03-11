package RistoranteAzarquiel;

public class Carne_Con_Enum extends Plato
{
	//------- Atributos -------

	// public static final String POCO_HECHA = "Poco hecha";
	// public static final String AL_PUNTO = "Al punto";
	// public static final String MUY_HECHA = "Muy hecha";
	// public static final String CARBONIZADA = "carbonizada";

	public enum GradoCocion {POCO_HECHA,AL_PUNTO,MUY_HECHA,CARBONIZADA}

	protected GradoCocion cocion;

	//------ Constructores ----
	public Carne_Con_Enum(String nombre, int precio, GradoCocion cocion) 
	{
		super(nombre, precio);
		this.cocion = cocion;
	}

	//-------- Métodos --------
	public GradoCocion getCocion() 
	{
		return cocion;
	}

	public void setCocion(GradoCocion cocion) 
	{
		this.cocion = cocion;
	}

	//*Imprimir
	@Override
	public String toString() 
	{
		return "Carne_Con_Enum [nombre=" + nombre + ", precio=" + precio + ", cocion=" + cocion + "]";
	}

}
