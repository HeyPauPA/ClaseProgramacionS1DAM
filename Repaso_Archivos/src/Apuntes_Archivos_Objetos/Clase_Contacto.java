package Apuntes_Archivos_Objetos;

import java.io.Serializable;

public class Clase_Contacto implements Serializable // ¡RECUERDA Q SEA SERIALIZABLE SI NO DA ERROR!
{
	//------- Atributos -------
	private String nombre;
	private long telefono;

	//------ Constructores ----
	public Clase_Contacto(String nombre, long telefono) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
	}

	public Clase_Contacto(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Clase_Contacto(long telefono) {
		super();
		this.nombre = "Desconocido";
		this.telefono = telefono;
	}

	//-------- Getters/Setters --------
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", telefono=" + telefono + "]";
	}


}
