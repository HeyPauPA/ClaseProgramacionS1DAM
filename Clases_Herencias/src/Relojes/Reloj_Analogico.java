package Relojes;

import java.time.LocalTime;

public class Reloj_Analogico extends Reloj 
{
	//------- Atributos -------
	protected LocalTime horaActual;

	//------ Constructores ----
	public Reloj_Analogico(LocalTime horaActual) {
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
	//	String horaAnalogica = horaActual ;
	}

	//*Imprimir
	@Override
	public String toString() 
	{
		return "Reloj_Analogico [horaActual=" + horaActual + "]";
	}
	
}
