package Figuras;

public abstract class Figura 
{
	//------- Atributos -------
	protected String color;

	
	//------ Constructores ----
	public Figura(String color) 
	{
		super();
		this.color = color;
	}


	//-------- Métodos --------
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}

	//-------- Métodos A COMPLETAR --------

	/*
	 * Dos métodos que todas las clases tendrán que tener
	 * Les ponemos abstractos porque no sabemos implemtarlos todavía
	 * Las clases que hereden de Figura, tendrán la obligación de terminarlos
	 */
	
	public abstract int Area(); 
	public abstract int Perimetro(); 
	
	//*Imprimir
	@Override
	public String toString() {
		return "Figura [color=" + color + "]";
	}
}
