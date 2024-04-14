package clinica;

public class Prueba {

	public static void main(String[] args) 
	{
		ListaDeEspera lista = new ListaDeEspera();

		Paciente p1 = new Paciente ("0589764B","Carla", "Adeslas");
		Paciente p2 = new Paciente ("1578965F","Paula", "Sanitas");
		Paciente p3 = new Paciente ("1526357A","Andres");
		Paciente p4 = new Paciente ("0528264V","Maria", "Asisa");
		Paciente p5 = new Paciente ("5486352P","Luis", "DKV");
		
		lista.addPaciente(p1);
		lista.addPaciente(p2);
		
		System.out.println(lista);
		
		System.out.println("Turno para: " + lista.atenderPaciente());
		System.out.println(lista);
		
		lista.addPaciente(p3);
		lista.addPaciente(p4);
		
		System.out.println(lista);
		
		lista.colar(p5, 1);
		
		System.out.println(lista);
	}

}
