package RistoranteAzarquiel;

public class Pescado extends Plato
{

	public Pescado(String nombre, int precio) {
		super(nombre, precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() 
	{
		return "Pescado [nombre=" + nombre + ", precio=" + precio + "]";
	}
	
}
