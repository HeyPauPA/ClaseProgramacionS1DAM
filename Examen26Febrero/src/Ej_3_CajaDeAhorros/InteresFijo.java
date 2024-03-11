package Ej_3_CajaDeAhorros;

public class InteresFijo extends Prestamo
{
	//------- Atributos -------
	protected double interes;
	//------ Constructores ----
	public InteresFijo(String titularPrestamo, int capitalPrestamo, int duracionPrestamo, double interes) 
	{
		super(titularPrestamo, capitalPrestamo, duracionPrestamo);
		this.interes = interes;
	}
	//-------- Getters/Setters --------
	public double getInteres() {
		return interes;
	}
	public void setInteres(double interes) {
		this.interes = interes;
	}

	//-------- Métodos Heredados --------
	@Override
	public double cuota() 
	{
		double cuota = 0;
		double plazo = duracionPrestamo * 12;
		
		cuota= (capitalPrestamo * interes)/(1-(Math.pow((1+interes),(-plazo))));
		return cuota;
	}

	//*Imprimir
	@Override
	public String toString() {
		return "InteresFijo [titularPrestamo=" + titularPrestamo + ", capitalPrestamo=" + capitalPrestamo
				+ ", duracionPrestamo=" + duracionPrestamo + ", interes=" + interes + "]";
	}
	
}
