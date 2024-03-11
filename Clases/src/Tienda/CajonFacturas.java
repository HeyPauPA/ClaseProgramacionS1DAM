package Tienda;

import java.util.ArrayList;

public class CajonFacturas 
{
	//------- Atributos -------

	private ArrayList<Factura> facturas;
	
	//------ Constructores ----
	public CajonFacturas() {
		super();
	}

	//-------- Métodos --------
	public ArrayList<Factura> getFacturas() {
		return facturas;
	}

	public void setFacturas(ArrayList<Factura> facturas) {
		this.facturas = facturas;
	}
		
	//-------- Métodos Propios --------
	
	//añadir una factura
	public void add(Factura facturaAAñadir) 
	{
		this.facturas.add(facturaAAñadir);
	}
	
	//buscar una factura(usando el nº fatura)
	public Factura search(int numeroFactura) 
	{
		for (Factura factura : facturas) 
		{
			if (factura.getNumero() == numeroFactura) 
			{
				return factura;
			}
		}
		return null;
	}
	
	//obtener las facturas pendientes de cobro
	
	public ArrayList<Factura> searchPendientes() 
	{
		ArrayList<Factura> pendientes = new ArrayList<Factura>();
		
		for (Factura factura : this.facturas) 
		{
			if(!factura.isPagada()) 
			{
				pendientes.add(factura);
			}
		}
		return pendientes;
	}

	//*Imprimir
	@Override
	public String toString() {
		return "CajonFacturas [facturas=" + facturas + "]";
	}
	
	
}
