package agenda;

import java.util.Arrays;

public class AgendaConArray 
{
	//------- Atributos -------
	 
	//			↓ array del dato clase contacto
	private Contacto[] contactos; // = new Contacto[200]; //no hacemos el dato desde el inicio para que el usuario 
														  //pueda decidir que tipo de agenda desea

	//------ Constructores ----
	//diferentes formas de crear la agenda
	
	public AgendaConArray(Contacto[] contactos) //constructor de agenda normal
	{
		super();
		this.contactos = contactos;
	}
	
	public AgendaConArray()  //constructor de agenda vacia
	{
		this.contactos = new Contacto[200];
	}
	
	public AgendaConArray(int tamaño)  //constructor de agenda vacia
	{
		this.contactos = new Contacto[tamaño];
	}

	//-------- Métodos --------
	//(getter y setter)
	
	public Contacto[] getContactos() {
		return contactos;
	}
	
	public void setContactos(Contacto[] contactos) {
		this.contactos = contactos;
	}

	//-------- Métodos Propios --------
	
	//buscar contacto por su nombre
	public Contacto getContacto(String nombre) 
	{			
		for (Contacto contacto : this.contactos) //por cada contacto (clase) dentro del array contactos
		{
			if (contacto.getNombre().equals(nombre)) 
			{
				return contacto;
			}
		}
		return null;	
	}
	
	//borrar un contacto, pasando un nombre				
	public boolean removeContacto(String nombre) 
	{		
		for (int i = 0; i < contactos.length; i++) 
		{
			if (contactos[i].getNombre().equalsIgnoreCase(nombre)) //si el contacto dentro del array en el punto i 
																   //tiene el mismo nombre que el buscado
			{
				contactos[i] = null;	//borro el contacto
				return true;
			}
		}	
		return false;		
	}
	
	
	//... muchos metodos
	
	
	//*Imprimir
	@Override
	public String toString() {
		return "Agenda [contactos=" + Arrays.toString(contactos) + "]";
	}
}
