package Figuras;

public class Circulo extends Figura
{
	//------- Atributos -------

	protected int radio;

	//------ Constructores ----
	public Circulo(String color, int radio) {
		super(color);
		this.radio = radio;
	}

	
	//-------- Métodos --------
	public int getRadio() {
		return radio;
	}
	
	public void setRadio(int radio) {
		this.radio = radio;
	}

	//-------- Métodos Heredados --------
	@Override
	public int Area() 
	{
		return (int) (Math.PI * Math.pow(radio, 2));
	}

	@Override
	public int Perimetro() 
	{	
		return (int) (2 * Math.PI * radio);	
	}
	
	//*Imprimir
	@Override
	public String toString() {
		return "Circulo [color=" + color + ", radio=" + radio + "]";
	}




}
