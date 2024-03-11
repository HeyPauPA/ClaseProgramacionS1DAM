package Ej_2_Cruceros;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Escala_Cultural extends Escalas 
{
	//------- Atributos -------

	protected int precioGuia;

	//------ Constructores ----
	public Escala_Cultural(String nombreCiudad, LocalDateTime horaBajada, LocalDateTime horaRegreso, int precioGuia) {
		super(nombreCiudad, horaBajada, horaRegreso);
		this.precioGuia = precioGuia;
	}
	//-------- Métodos --------
	public int getPrecioGuia() {
		return precioGuia;
	}
	
	public void setPrecioGuia(int precioGuia) {
		this.precioGuia = precioGuia;
	}

	//*Imprimir
	@Override
	public String toString() {
		return "Escala_Cultural [nombreCiudad=" + nombreCiudad + ", horaBajada=" + horaBajada + ", horaRegreso="
				+ horaRegreso + ", precioGuia=" + precioGuia + "]";
	}
}
