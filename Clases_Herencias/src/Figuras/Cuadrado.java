package Figuras;

public class Cuadrado extends Figura
{
	//------- Atributos -------
	protected int lado;

	//------ Constructores ----
	public Cuadrado(String color, int lado) {
		super(color);
		this.lado = lado;
	}

	public Cuadrado(String color) {
		super(color);
		this.lado = 4;
	}

	//-------- Métodos --------
	
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	//-------- Métodos Propios --------
	
	//-------- Métodos A completar --------
	//en el subtipo tenemos el metodo de figura, 
	// pero para cada tipo diferente
	
	@Override
	public int Area() {
		
		return lado * lado;
	}

	@Override
	public int Perimetro() {
		
		return lado * 4;
	}

	//*Imprimir
	@Override
	public String toString() {
		return "Cuadrado [color=" + color + ", lado=" + lado + "]";
	}
	
}
