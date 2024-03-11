package Tienda;

import java.util.ArrayList;

public class Stock 
{
	//------- Atributos -------

	private ArrayList<producto> productos;

	//------ Constructores ----
	
	public Stock(ArrayList<producto> productos) {
		super();
		this.productos = productos;
	}
	
	public Stock() 
	{
		super();
		this.productos = new ArrayList<producto>();
	}
	
	//-------- Métodos --------
	
	
	//-------- Métodos Propios --------
	
	//añadir producto
	public void addProducto(producto productoAAñadir) 
	{
		productos.add(productoAAñadir);
	}
	
	//eliminar producto
	public void deleteProducto(producto productoAEliminar) 
	{
		productos.remove(productoAEliminar);
	}
	
	//buscar un producto usando un codigo de producto
	public producto searchCodigoProducto(producto productoBuscado) 
	{
		for (producto producto : productos) 
		{
			if(productoBuscado.getCodigo() == producto.getCodigo() )
				return producto;
		}
		return null;
	}
	
	//obtener los productos agotados
	public ArrayList<producto> getProductosAgotados() 
	{
		ArrayList<producto> productosAgotados = new ArrayList<producto>();
		
		for (producto producto : productos) // por cada clase producto 
											//llamada producto. dentro del array productos
		{
			if(producto.getCantidad() <= 0) 
			{
				productosAgotados.add(producto);
			}
		}
		return productosAgotados;
	}
	
	//obtener los productos bajo minima
	public ArrayList<producto> getProductosBajoMinimo() 
	{
		ArrayList<producto> productosBajoMinimo = new ArrayList<producto>();
		
		for (producto producto : productos) // por cada clase producto 
											//llamada producto. dentro del array productos
		{
			if(producto.getCantidad() < producto.getMinimo()) 
			{
				productosBajoMinimo.add(producto);
			}
		}
		return productosBajoMinimo;
	}
	//*Imprimir
}
