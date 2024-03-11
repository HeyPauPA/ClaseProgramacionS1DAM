 package agenda;

import java.util.ArrayList;
import java.util.Iterator;

public class Agenda 
{
	//------- Atributos -------
	private ArrayList<Contacto> listaContactos;

	
	//------ Constructores ----

	public Agenda() 
	{
		//agenda vacia por defecto
		listaContactos = new ArrayList<Contacto>();
	}
//	public Agenda(int tamaño)   //NO HACE FALTA YA QUE EL ARRAY ES DINAMICO
//	{
//		//agenda por defecto
//		listaContactos = new ArrayList<Contacto>(tamaño);
//	}
	
	public Agenda(ArrayList<Contacto> listaContactos) 
	{
		//constructor para clonar una agenda
		this.listaContactos = listaContactos;
	}

	//-------- Métodos --------
	
	public ArrayList<Contacto> getListaContactos() 
	{
		return listaContactos;
	}

	public void setListaContactos(ArrayList<Contacto> listaContactos) 
	{
		this.listaContactos = listaContactos;
	}
	
	// Imprimir
	@Override
	public String toString() {
		return "Agenda [listaContactos=" + listaContactos + "]";
	}
	
	//-------- Métodos Propios --------
	
	//añadir contacto
	public void add(Contacto nuevoContacto) 
	{
		this.listaContactos.add(nuevoContacto); //podrias hacerlo hecho con un return del boolean como abajo ↓ 
	}
	
	//borrar un contacto
	public boolean delete(Contacto contactoAntiguo) 
	{
	return this.listaContactos.remove(contactoAntiguo);
	}
	
	//borrar un contacto, si me dan su nombre
	   public boolean delete(String nombreViejo) 
	   {
		   for (Contacto contacto : listaContactos) 
		   {
			if (contacto.getNombre().equals(nombreViejo))
			{
				return this.delete(contacto);	
			}
		   }
		   return false;
	   }
	   
		//buscar un contacto
		
		public Contacto get(String nombre) 
		{
			for (Contacto contacto : listaContactos) 
			{
				if(contacto.getNombre().equals(nombre)) 
				{
					return contacto;
				}
			}
			return null;//si no esta el contacto retorno null
		}
		
		//buscar un contacto dada su posicion el la lista
		
		public Contacto get(int posicion) 
		{
			return listaContactos.get(posicion);	
		}
		
		//actualizar un contacto
//		public boolean update(String nombreAntiguo , String nombreNuevo) 
//		{
//			for (Contacto contacto : listaContactos) 
//			{
//				if (contacto.getNombre().equals(nombreAntiguo)) 
//				{
//					contacto.setNombre(nombreNuevo);
//					return true;
//				}
//			}
//			return false;
//		}
		
		//actualizar un contacto
		public boolean update(String nombreAntiguo , String nombreNuevo) 
		{
			Contacto c = this.get(nombreAntiguo);
			if(c != null) 
			{
				c.setNombre(nombreNuevo);	
				return true;
			}
			else
				return false;
		}
		//actualizar un contacto con la clase contacto
		public void update(Contacto contactoAntiguo , Contacto contactoNuevo) 
		{
			this.delete(contactoAntiguo);
			this.add(contactoNuevo);
		}
		
		//metodo longitud
		public int lenght() 
		{
			return this.listaContactos.size();
		}
		
}
