package Ej_3_CajaDeAhorros;

public class InteresVariable extends Prestamo
{
	//------- Atributos -------
	protected double euribor;
	protected double diferencial;
	protected double interes;
	protected int cadaCuantosMesesSeRevisaElInteres;
	
	//------ Constructores ----
	public InteresVariable(String titularPrestamo, int capitalPrestamo, int duracionPrestamo, double euribor,
			double diferencial, int cadaCuantosMesesSeRevisaElInteres) {
		super(titularPrestamo, capitalPrestamo, duracionPrestamo);
		this.euribor = euribor;
		this.diferencial = diferencial;
		this.interes = euribor + diferencial; //intereses lo cambio por la suma de euribor y diferencial;
		this.cadaCuantosMesesSeRevisaElInteres = cadaCuantosMesesSeRevisaElInteres;
	}

	//-------- Getters/Setters --------
	public double getInteres() {
		return interes;
	}
	public double getEuribor() {
		return euribor;
	}
	public void setEuribor(double euribor) {
		this.euribor = euribor;
	}
	public double getDiferencial() {
		return diferencial;
	}
	public void setDiferencial(double diferencial) {
		this.diferencial = diferencial;
	}
	public int getCadaCuantosMesesSeRevisaElInteres() {
		return cadaCuantosMesesSeRevisaElInteres;
	}
	public void setCadaCuantosMesesSeRevisaElInteres(int cadaCuantosMesesSeRevisaElInteres) {
		this.cadaCuantosMesesSeRevisaElInteres = cadaCuantosMesesSeRevisaElInteres;
	}

	//-------- Métodos Heredados --------
	@Override
	public double cuota() {
		double cuota = 0;
		double plazo = duracionPrestamo * 12;
		cuota = (capitalPrestamo * interes)/(1-(Math.pow((1+interes),(-plazo))));
		return cuota;
	}
	
	//*Imprimir
	@Override
	public String toString() {
		return "InteresVariable [titularPrestamo=" + titularPrestamo + ", capitalPrestamo=" + capitalPrestamo
				+ ", duracionPrestamo=" + duracionPrestamo + ", interes=" + interes + ", euribor=" + euribor
				+ ", diferencial=" + diferencial + ", cadaCuantosMesesSeRevisaElInteres="
				+ cadaCuantosMesesSeRevisaElInteres + "]";
	}
	
}
