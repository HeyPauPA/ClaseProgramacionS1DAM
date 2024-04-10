package PruebasConObjetos;

import java.io.Serializable;

public class Contacto implements Serializable
{
	//------- Atributos -------
	private String nombre;
	private int telefono;
	
	//------ Constructores ----
	
	public Contacto(String nombre, int telefono) 
	{
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	public Contacto(String nombre) 
	{
		this.nombre = nombre;
		this.telefono = 00000000;
	}
	
	public Contacto(int telefono) 
	{
		this.nombre = "Contacto Desconocido";
		this.telefono = telefono;
	}
	
	//-------- Metodos --------
	public String getNombre() 
	{
		return nombre;
	}
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	public int getTelefono() 
	{
		return telefono;
	}
	public void setTelefono(int telefono) 
	{
		this.telefono = telefono;
	}

	//*Imprimir
	
	@Override
	public String toString() {
		return "Contacto [Nombre= " + nombre + ", Teléfono= " + telefono + "]";
	}
	
	
}
