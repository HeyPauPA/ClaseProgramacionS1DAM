package Ejercicio1_CrearRectangulo;

public class Rectangulo 
{
	//------- Atributos -------
	protected int ancho;
	protected int alto;
	
	//------ Constructores ----
	public Rectangulo(int ancho, int alto) 
	{
		if (this.ancho > 0 && this.alto >0 ) 
		{
			this.ancho = ancho;
			this.alto = alto;
		}
	}
	
	public Rectangulo() 
	{
		this.ancho = 4;
		this.alto = 4;
	}
	
	//-------- Métodos --------

	public int getAncho() 
	{
		return ancho;
	}

	public void setAncho(int ancho) 
	{
		if (this.ancho >0) 
		{
			this.ancho = ancho;	
		}
	}

	public int getAlto() 
	{
		return alto;
	}

	public void setAlto(int alto) 
	{
		if (this.alto >0) 
		{
			this.alto = alto;	
		}
	}

	
	//-------- Métodos Propios --------
	public void perimetro() 
	{ 
		
	}
	
	//*Imprimir
	@Override
	public String toString() 
	{
		return "Rectangulo [ancho=" + ancho + ", alto=" + alto + "]";
	}
	
}
