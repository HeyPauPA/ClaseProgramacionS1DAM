package Tienda;

public class producto 
{
	//------- Atributos -------
	private int codigo;
	private String descripcion;
	private float precio;
	private int cantidad;
	private int minimo;

	
	//------ Constructores ----
	public producto(int codigo, String descripcion, float precio, int cantidad, int minimo) 
	{
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.cantidad = cantidad;
		this.minimo = minimo;
	}
	
	public producto(int codigo, String descripcion, float precio) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public producto(int codigo, String descripcion) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
	}
	
	//-------- Métodos --------
	public int getCodigo() 
	{
		return codigo;
	}

	public void setCodigo(int codigo) 
	{
		this.codigo = codigo;
	}

	public String getDescripcion() 
	{
		return descripcion;
	}

	public void setDescripcion(String descripcion) 
	{
		this.descripcion = descripcion;
	}

	public float getPrecio() 
	{
		return precio;
	}

	public void setPrecio(float precio) 
	{
		this.precio = precio;
	}

	public int getCantidad() 
	{
		return cantidad;
	}

	public void setCantidad(int cantidad) 
	{
		this.cantidad = cantidad;
	}

	public int getMinimo() 
	{
		return minimo;
	}

	public void setMinimo(int minimo) 
	{
		this.minimo = minimo;
	}



	//*Imprimir
	@Override
	public String toString() {
		return "producto [codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + ", cantidad="
				+ cantidad + ", minimo=" + minimo + "]";
	}
}
