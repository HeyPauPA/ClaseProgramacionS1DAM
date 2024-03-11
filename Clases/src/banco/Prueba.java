package banco;

public class Prueba 
{
	public static void main(String[] args) 
	{
		//Probar la clase cuenta corriente
		
//		---- CUENTA A ----
		
//		//Creamos un objeto CuentaCorriente
//		Ej1_CuentaCorriente cuenta = new Ej1_CuentaCorriente();
//		
//		cuenta.ingresar(50);
//		cuenta.retirar(10);
//		System.out.println(cuenta.dimeElSaldo() + "€");
//		
////		cuenta.saldo = 50; ·Esto no se podria hacer 
////		si se hace privada la variable de la cuenta para protegerla
		
// 		---- CUENTA B ----	
		
		//Creamos un objeto CuentaCorriente
		Ej1_BCuentaCorriente_2  cuentaB = new Ej1_BCuentaCorriente_2("ES1564930","Javier",100);
		
		System.out.println("El numero de cuenta es: " + cuentaB.getIban());
		
		System.out.println("El saldo de la cuenta es: " + cuentaB.getSaldo());
		
		System.out.println(cuentaB.toString());// se usa el mmetodo anterior para pasar todo el objeto a String
	}
	
}
