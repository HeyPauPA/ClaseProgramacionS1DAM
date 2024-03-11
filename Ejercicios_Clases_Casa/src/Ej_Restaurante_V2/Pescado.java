package Ej_Restaurante_V2;

public class Pescado extends Platos
{
	//------- Atributos -------
	//----
	
	//------ Constructores ----	
	public Pescado(String nombre, int precio) {
		super(nombre, precio);
		// TODO Auto-generated constructor stub
	}
	
	//*Imprimir
	@Override
	public String toString() {
		return "Pescado [nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
}
