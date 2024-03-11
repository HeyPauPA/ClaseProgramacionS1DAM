package Ej_2_Cruceros;

import java.time.LocalDateTime;
import java.time.LocalTime;

public abstract class Escalas 
{
	//------- Atributos -------
	protected String nombreCiudad;
	protected LocalDateTime horaBajada;
	protected LocalDateTime horaRegreso;
	
	//------ Constructores ----
	public Escalas(String nombreCiudad, LocalDateTime horaBajada, LocalDateTime horaRegreso) {
		super();
		this.nombreCiudad = nombreCiudad;
		this.horaBajada = horaBajada;
		this.horaRegreso = horaRegreso;
	}

	//-------- Métodos --------
	public String getNombreCiudad() {
		return nombreCiudad;
	}
	
	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}
	
	public LocalDateTime getHoraBajada() {
		return horaBajada;
	}
	
	public void setHoraBajada(LocalDateTime horaBajada) {
		this.horaBajada = horaBajada;
	}
	
	public LocalDateTime getHoraRegreso() {
		return horaRegreso;
	}
	
	public void setHoraRegreso(LocalDateTime horaRegreso) {
		this.horaRegreso = horaRegreso;
	}
	
	//-------- Métodos Propios --------
	
	//-------- Métodos Heredables --------

	//*Imprimir
	
	@Override
	public String toString() {
		return "Escalas [nombreCiudad=" + nombreCiudad + ", horaBajada=" + horaBajada + ", horaRegreso=" + horaRegreso
				+ "]";
	}
	
}
