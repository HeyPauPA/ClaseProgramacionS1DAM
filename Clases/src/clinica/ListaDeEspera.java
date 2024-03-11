package clinica;

import java.util.ArrayList;
import java.util.Arrays;

import agenda.Contacto;

public class ListaDeEspera 
{
	//------- Atributos -------

	private ArrayList<Paciente> listaPacientes;

	//------ Constructores ----
	
	public ListaDeEspera(ArrayList<Paciente> listaPacientes) 
	{
		super();
		this.listaPacientes = listaPacientes;
	}
	public ListaDeEspera() 
	{
		super();
		this.listaPacientes = new ArrayList<Paciente>();
	}

	//-------- Métodos --------
	
	public ArrayList<Paciente> getListaPacientes() 
	{
		return listaPacientes;
	}

	public void setListaPacientes(ArrayList<Paciente> listaPacientes) 
	{
		this.listaPacientes = listaPacientes;
	}

	//-------- Métodos Propios --------

	//add paciente
	public void addPaciente(Paciente pacienteNuevo) 
	{
		listaPacientes.add(pacienteNuevo);
	}
	
	//delete paciente
	
	public void deletePaciente(Paciente pacienteABorrar) 
	{
		listaPacientes.remove(pacienteABorrar);
	}
	
	//atender a un cliente, retorna el paciente que mas tiempo lleva esperando y borrarlo
	
	public Paciente atenderPaciente() 
	{
		Paciente pacienteMasViejo;
	
		pacienteMasViejo = this.listaPacientes.get(0);
		this.listaPacientes.remove(0);
		return pacienteMasViejo;
	}
	
	//colar un paciente
	public boolean colar(Paciente pacienteAColar, int posicion) 
	{
		if(posicion < 0 || posicion >= this.listaPacientes.size()) 
		{	
			this.listaPacientes.add(posicion, pacienteAColar);
			return true;
		}
		else
		return false;
	}
	
	//tamaño de lista de espera
	
	public int listaSize() 
	{
		return this.listaPacientes.size();	
	}
	//*Imprimir
	
	@Override
	public String toString() {
		return "ListaDeEspera = ["+ listaPacientes + "]";
	}
		
}
