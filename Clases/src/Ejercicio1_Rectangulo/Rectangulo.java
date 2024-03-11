package Ejercicio1_Rectangulo;

//1. Escribe una clase llamada Rectángulo que posea dos atributos de tipo entero
//llamados ancho y alto.

//La clase debe poseer los siguientes métodos:

	//Un método constructor que no reciba ningún parámetro y que
	//inicialice las dimensiones del rectángulo (ancho y alto) con dos
	//enteros positivos por defecto.

	//Otro método constructor que reciba el alto y el ancho como
	//parámetros. Se debe chequear que ambos valores sean positivos antes
	//de asignárselos a los atributos correspondientes. En caso contrario, se
	//asignarán valores por defecto.

	//Métodos get y set para la clase. Los métodos set deben chequear que
	//las nuevas dimensiones efectivamente sean enteros positivos.

	//Un método que calcule y retorne el área del rectángulo.

	//Método que calcule y retorne el perímetro del rectángulo.

	//Otro método que determine si el rectángulo es horizontal o vertical.

	//Decimos que el rectángulo es horizontal si el valor del ancho es
	//mayor que el del alto. En caso contrario, decimos que el rectángulo
	//es vertical.

	//Un método que despliegue en pantalla los valores de las dimensiones
	//(ancho y alto) del rectángulo.

	//Otro método que dibuje en pantalla el rectángulo mediante asteriscos,
	//utilizando tantas columnas como valor tenga el ancho y tantas filas
	//como valor tenga el alto. Por ejemplo, si el alto valiera 3 y el ancho
	//valiera 12, se debería desplegar así:
	
	//		************
	//		************
	//		************
public class Rectangulo 
{
	//------- Atributos -------
	 int ancho;
	 int alto;
	
	//-------- Contructores --------
	 public Rectangulo(int ancho, int alto) 
	 {
		 if(ancho > 0 && alto >0) 
		 {			 
			 this.ancho = ancho;
			 this.alto = alto;
		 }
		 else 
		 {
			 System.out.println("Necesito valores positivos, se pondra 2 por defecto");
			 
			 this.ancho = 10;
			 this.alto = 15;	 
		 }
	 }
	 public Rectangulo() 
	 {
		 this.ancho = 10;
		 this.alto = 15;
	 }

	 
	//-------- Métodos --------
	 public int getAncho() 
	 {
		 if(ancho > 0) 
		 {
			 return ancho;			 
		 }
		 else 
			 return 10;
	 }
	 
	 public void setAncho(int ancho) 
	 {
		 if(ancho > 0) 
		 {
			 this.ancho = ancho;		 
		 }
		 else 
			 this.ancho = 10; 
	 }
	 
	 public int getAlto() 
	 {
		 if(alto > 0) 
		 {
			 return alto;			 
		 }
		 else 
			 return 15;
	 }
	 
	 public void setAlto(int alto) {
		 if(alto > 0) 
		 {
			 this.alto = alto;		 
		 }
		 else 
			 this.alto = 15;
	 }
 
	//-------- Métodos Propios --------

	//Un método que calcule y retorne el área del rectángulo.
	 public int areaRectangulo() 
	 {
		int area = this.ancho * this.alto;
		return area;
	 }
	 
	//Método que calcule y retorne el perímetro del rectángulo.
	 public int perimetroRectangulo() 
	 {
		int perimetro = (this.ancho * 2) + (this.alto *2 );
		return perimetro;
	 }
	 
	//Otro método que determine si el rectángulo es horizontal o vertical.
	 public boolean verticalRectangulo() 
	 {
		if(this.alto > this.ancho) 
		{
			return true;
		}
		else 
			return false;
	 }
	 public boolean horizontalRectangulo() 
	 {
		if(this.ancho > this.alto) 
		{
			return true;
		}
		else 
			return false;
	 }
	
	//*Imprimir
	@Override
	public String toString() 
	{
		return "Rectangulo [ancho =" + ancho + ", alto =" + alto + "]";
	}
	 
	 
}
