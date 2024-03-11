package Electrodomesticos;

public class Lavadora extends Electrodomestico 
{
	//------- Atributos -------
	public static final int CARGA_POR_DEFECTO = 5;
	protected int carga;

	//------ Constructores ----
	public Lavadora(int carga) { //por defecto
		super();
		this.carga = carga;
	}

	public Lavadora(float precioBase, int peso, CategoriaEnergetica categoriaEnergetica, Colores color) 
	{
		super(precioBase, peso, categoriaEnergetica, color);
	}


	//-------- Métodos --------
	public int getCarga() {
		return carga;
	}
	
	//-------- Métodos Propios --------
	//-------- Métodos Cambiados --------
	@Override
	public float precioFinal() //llamamos el metodo q ya creamos en la clase de electrodomestico
	{
		if(this.carga>30) 
		{
			return super.precioFinal() + 50;	
		}
		else 
		{
			return super.precioFinal();	
		}
	}
	
	//*Imprimir
}
