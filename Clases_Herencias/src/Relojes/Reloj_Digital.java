package Relojes;

import java.time.LocalTime;

public class Reloj_Digital extends Reloj

{
	//------- Atributos -------
	protected LocalTime horaActual;
	
	//------ Constructores ----
	public Reloj_Digital(LocalTime horaActual) 
	{
		super();
		this.horaActual = horaActual;
	}

	//-------- Métodos --------
	public LocalTime getHoraActual() 
	{
		return horaActual;
	}

	public void setHoraActual(LocalTime horaActual) 
	{
		this.horaActual = horaActual;
	}
	
	//-------- Métodos Heredados --------
	@Override
	public void DarHora() 
	{
		System.out.println(horaActual);
	}

	//*Imprimir
}
