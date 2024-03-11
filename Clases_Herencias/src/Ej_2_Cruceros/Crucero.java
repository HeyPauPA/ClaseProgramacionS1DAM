package Ej_2_Cruceros;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;

public class Crucero 
{
	//------- Atributos -------

	protected int codigo;
	protected String nombreComercial;
	protected String nombreBarco; 
	protected LocalDate fechaPartida;
	protected LocalDate fechaLlegada;
	protected ArrayList<Escalas> listaEscalas;
	
	
	//------ Constructores ----
	public Crucero(int codigo, String nombreComercial, String nombreBarco, LocalDate fechaPartida,
					LocalDate fechaLlegada, ArrayList<Escalas> listaEscalas) {
		super();
		this.codigo = codigo;
		this.nombreComercial = nombreComercial;
		this.nombreBarco = nombreBarco;
		this.fechaPartida = fechaPartida;
		this.fechaLlegada = fechaLlegada;
		this.listaEscalas = listaEscalas;
	}
	
	public Crucero(int codigo, String nombreComercial, String nombreBarco, LocalDate fechaPartida,
			LocalDate fechaLlegada) {
		super();
		this.codigo = codigo;
		this.nombreComercial = nombreComercial;
		this.nombreBarco = nombreBarco;
		this.fechaPartida = fechaPartida;
		this.fechaLlegada = fechaLlegada;
		this.listaEscalas = new ArrayList<Escalas>();
	}
	
	//-------- Métodos --------

	public int getCodigo() 
	{
		return codigo;
	}

	public void setCodigo(int codigo) 
	{
		this.codigo = codigo;
	}

	public String getNombreComercial() 
	{
		return nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) 
	{
		this.nombreComercial = nombreComercial;
	}

	public String getNombreBarco() 
	{
		return nombreBarco;
	}

	public void setNombreBarco(String nombreBarco) 
	{
	
		this.nombreBarco = nombreBarco;
	}

	public LocalDate getFechaPartida() 
	{
		return fechaPartida;
	}

	public void setFechaPartida(LocalDate fechaPartida) 
	{
		this.fechaPartida = fechaPartida;
	}

	public LocalDate getFechaLlegada() 
	{
		return fechaLlegada;
	}

	public void setFechaLlegada(LocalDate fechaLlegada) 
	{
		this.fechaLlegada = fechaLlegada;
	}

	public ArrayList<Escalas> getListaEscalas() 
	{
		return listaEscalas;
	}

	public void setListaEscalas(ArrayList<Escalas> listaEscalas) 
	{
		this.listaEscalas = listaEscalas;
	}

	//Añadir una escala
	public void add(Escalas e) {
		this.listaEscalas.add(e);
	}
	
	//Eliminar una escala
	public void remove(Escalas e) {
		this.listaEscalas.remove(e);
	}

	//-------- Métodos Propios --------
	public float coste() 
	{
		float total = 600;
		for (Escalas escala : listaEscalas) {
			if(escala instanceof Escala_Cultural) {
				total += 100 + ((Escala_Cultural)escala).getPrecioGuia();
			}else {
				total += 100;
			}
		}
		return total;
	}

	//*Imprimir
	@Override
	public String toString() {
		String escalas = "Lista de escalas: \n";
		for (Escalas escala : listaEscalas) {
			escalas += "\t" + escala + "\n";
		}
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "Código de crucero: " + this.codigo
				+ "\nNombre Comercial: " + this.nombreComercial
				+ "\nNombre del barco: " + this.nombreBarco
				+ "\nFecha de salida: " + this.fechaPartida.format(dtf)
				+ "\nFecha de regreso: " + this.fechaLlegada.format(dtf)
				+ "\n"+escalas;
	}
	
	
}
