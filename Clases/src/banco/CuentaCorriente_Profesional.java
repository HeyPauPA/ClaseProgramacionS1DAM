package banco;

public class CuentaCorriente_Profesional 
{

	// --- Atributos ----	
	private String iban;
	private Persona titular;
	private double saldo;
	
	// --- Constructor ---
	
	public CuentaCorriente_Profesional(String iban, Persona titular, double saldo) {

		this.iban = iban;
		this.titular = titular;
		this.saldo = saldo;
	}
	public CuentaCorriente_Profesional(String iban, double saldo) {

		this.iban = iban;
		this.saldo = saldo;
	}
	
	// --- Metodos ---
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	public Persona getTitular() {
		return titular;
	}
	public void setTitular(Persona titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
