package Ej_Restaurante_V2;

public class Postre extends Platos
{
	//------- Atributos -------
	protected boolean tieneAzucar;
	
	//------ Constructores ----
	public Postre(String nombre, int precio, boolean tieneAzucar) {
		super(nombre, precio);
		this.tieneAzucar = tieneAzucar;
	}
	//por defecto es con azucar
	public Postre(String nombre, int precio) {
		super(nombre, precio);
		this.tieneAzucar = true;
	}

	//-------- Getters/Setters --------
	public boolean isTieneAzucar() {
		return tieneAzucar;
	}
	public void setTieneAzucar(boolean tieneAzucar) {
		this.tieneAzucar = tieneAzucar;
	}
	
	//*Imprimir
	@Override
	public String toString() {
		return "Postre [nombre=" + nombre + ", precio=" + precio + ", tieneAzucar=" + tieneAzucar + "]";
	}
	
}
