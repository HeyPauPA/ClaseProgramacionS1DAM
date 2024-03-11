package Ej_Restaurante_V2;

public class Carne extends Platos
{
	//------- Atributos -------
	public enum GradosDeCoccion {PocoHecho, AlPunto, MuyHecho, Carbonizado}
	protected GradosDeCoccion gradoCoccion;
	
	public static final GradosDeCoccion Pocohecho = GradosDeCoccion.PocoHecho;
	
	//------ Constructores ----
	public Carne(String nombre, int precio, GradosDeCoccion gradoCoccion) {
		super(nombre, precio);
		this.gradoCoccion = gradoCoccion;
	}
	public Carne(String nombre, int precio) {
		super(nombre, precio);
		this.gradoCoccion = Pocohecho;
	}
	
	//-------- Getters/Setters --------
	public GradosDeCoccion getGradoCoccion() {
		return gradoCoccion;
	}
	public void setGradoCoccion(GradosDeCoccion gradoCoccion) {
		this.gradoCoccion = gradoCoccion;
	}
	
	//*Imprimir
	@Override
	public String toString() {
		return "Carne [nombre=" + nombre + ", precio=" + precio + ", gradoCoccion=" + gradoCoccion + "]";
	}
	
}
