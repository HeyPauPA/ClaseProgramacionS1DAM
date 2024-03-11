package Ej_3_CajaDeAhorros;

public abstract class Prestamo 
{
	//------- Atributos -------
	protected String titularPrestamo;
	protected int capitalPrestamo;
	protected int duracionPrestamo;
	
	//------ Constructores ----
	public Prestamo(String titularPrestamo, int capitalPrestamo, int duracionPrestamo) {
		super();
		this.titularPrestamo = titularPrestamo;
		this.capitalPrestamo = capitalPrestamo;
		this.duracionPrestamo = duracionPrestamo;
	}

	//-------- Getters/Setters --------
	public String getTitularPrestamo() {
		return titularPrestamo;
	}
	
	public void setTitularPrestamo(String titularPrestamo) {
		this.titularPrestamo = titularPrestamo;
	}
	
	public int getCapitalPrestamo() {
		return capitalPrestamo;
	}
	
	public void setCapitalPrestamo(int capitalPrestamo) {
		this.capitalPrestamo = capitalPrestamo;
	}
	
	public int getDuracionPrestamo() {
		return duracionPrestamo;
	}
	
	public void setDuracionPrestamo(int duracionPrestamo) {
		this.duracionPrestamo = duracionPrestamo;
	}

	//-------- Métodos Heredables --------
	public abstract double cuota();

	//*Imprimir
	@Override
	public String toString() {
		return "Prestamo [titularPrestamo=" + titularPrestamo + ", capitalPrestamo=" + capitalPrestamo
				+ ", duracionPrestamo=" + duracionPrestamo + "]";
	}
	
}
