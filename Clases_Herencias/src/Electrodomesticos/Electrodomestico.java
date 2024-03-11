package Electrodomesticos;

public class Electrodomestico 
{
	//------- Atributos -------

	protected enum Colores {BLANCO, NEGRO,ROJO, AZUL,GRIS};
	protected enum CategoriaEnergetica {A,B,C,D,E,F};
	protected float precioBase;
	protected int peso;
	private CategoriaEnergetica categoriaEnergetica;
	private Colores color;


	//Constantes por defecto
	public static final Colores COLOR_POR_DEFECTO = Colores.BLANCO;
	public static final CategoriaEnergetica CATEGORIA_POR_DEFECTO = CategoriaEnergetica.F;
	public static final float PRECIO_POR_DEFECTO = 100;
	public static final int PESO_POR_DEFECTO= 5;
	
	//------ Constructores ----

	public Electrodomestico() 
	{
		super();
		this.precioBase =  PRECIO_POR_DEFECTO;
		this.peso =  PESO_POR_DEFECTO;
		this.categoriaEnergetica = CATEGORIA_POR_DEFECTO;
		this.color = COLOR_POR_DEFECTO;
	}

	public Electrodomestico(float precioBase, int peso, CategoriaEnergetica categoriaEnergetica, Colores color) {
		super();
		this.precioBase = precioBase;
		this.peso = peso;
		this.categoriaEnergetica = categoriaEnergetica;
		this.color = color;
	}

	//-------- Métodos --------
	public float getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(float precioBase) {
		this.precioBase = precioBase;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public CategoriaEnergetica getCategoriaEnergetica() {
		return categoriaEnergetica;
	}

	public void setCategoriaEnergetica(CategoriaEnergetica categoriaEnergetica) {
		this.categoriaEnergetica = categoriaEnergetica;
	}

	public Colores getColor() {
		return color;
	}

	public void setColor(Colores color) {
		this.color = color;
	}

	public static Colores getColorPorDefecto() {
		return COLOR_POR_DEFECTO;
	}

	public static CategoriaEnergetica getCategoriaPorDefecto() {
		return CATEGORIA_POR_DEFECTO;
	}

	public static float getPrecioPorDefecto() {
		return PRECIO_POR_DEFECTO;
	}

	public static int getPesoPorDefecto() {
		return PESO_POR_DEFECTO;
	}
	
	//-------- Métodos Propios --------

	public float precioFinal() 
	{
		float total = this.precioBase;
		
		if(this.peso <20) 
		{
			total +=10;
		}
		else if(this.peso >= 20 && this.peso < 50) 
		{
			total +=50;
		}
		else if(this.peso >= 50 && this.peso < 80) 
		{
			total +=80;
		}
		else 
		{
			total +=100;
		}
		
		switch (this.categoriaEnergetica) 
		{
		case A:total += 100;break;
		case B:total += 80;break;	
		case C:total += 60;break;
		case D:total += 50;break;
		case E:total += 30;break;
		case F:total += 20;break;
		}
	
		return total;
	}
	//*Imprimir
}
