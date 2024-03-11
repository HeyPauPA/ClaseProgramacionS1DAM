package Ej_Restaurante_V2;

import java.util.ArrayList;
import java.util.Arrays;

public class Comanda 
{
	//CLASE A PARTE CONTROLA LOS PLATOS

	//------- Atributos -------
	protected int numeroMesa;
	protected int numeroComensales;
	protected ArrayList<Platos> Pedido;
	
	//------ Constructores ----
	public Comanda(int numeroMesa, int numeroComensales, ArrayList<Platos> pedido) {
		super();
		this.numeroMesa = numeroMesa;
		this.numeroComensales = numeroComensales;
		Pedido = pedido;
	}
	//si no se da el dato DEL ARRAY
	public Comanda( int numeroMesa, int numeroComensales) 
	{
		super();
		this.numeroMesa = 5;
		this.numeroComensales = 4;
		Pedido = new ArrayList<Platos>();
	}
	//-------- Métodos --------
	public int getNumeroMesa() {
		return numeroMesa;
	}
	public void setNumeroMesa(int numeroMesa) {
		this.numeroMesa = numeroMesa;
	}
	public int getNumeroComensales() {
		return numeroComensales;
	}
	public void setNumeroComensales(int numeroComensales) {
		this.numeroComensales = numeroComensales;
	}
	public ArrayList<Platos> getPedido() {
		return Pedido;
	}
	public void setPedido(ArrayList<Platos> pedido) {
		Pedido = pedido;
	}
	
	//--------------Metodos-Array------------------
	public void addPlato(Platos plato) 
	{
		Pedido.add(plato);
	}
	public void removePlato(Platos plato) 
	{
		Pedido.remove(plato);
	}

	//-------- Métodos Propios --------
	
	public int coste() 
	{
		int precio = 0;
		
		for (Platos platos : Pedido) 
		{
			precio = precio + platos.getPrecio();
		}
		return precio;
	}
	
	public String hayDiabéticosEnLaMesa() 
	{
		for (Platos platos : Pedido) 
		{	
			if (platos instanceof Postre && ((Postre) platos).isTieneAzucar()== true) 
			{
				return "Si";
			}
		}
		return "No";
	}
	
	//*Imprimir
	@Override
	public String toString() 
	{
		String resultado= "Comanda [numeroMesa=" + numeroMesa + ", numeroComensales=" + numeroComensales + ", Pedido=" ;
				
		for (Platos platos : Pedido) 
		{
			resultado = resultado + platos.toString();
		}
		
		resultado = resultado + "]";
		
		return resultado;
	}
	


}
