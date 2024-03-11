package RistoranteAzarquiel;

import java.util.ArrayList;

public class Comanda 
{
	//------- Atributos -------

	protected int numeroMesa;
	protected int numeroComensales;
	protected ArrayList<Plato> listaPaltos;

	//------ Constructores ----
	public Comanda(int numeroMesa, int numeroComensales, ArrayList<Plato> listaPaltos) 
	{
		this.numeroMesa = numeroMesa;
		this.numeroComensales = numeroComensales;
		this.listaPaltos = listaPaltos;
	}
	
	public Comanda(int numeroMesa, int numeroComensales) 
	{
		this.numeroMesa = numeroMesa;
		this.numeroComensales = numeroComensales;
		this.listaPaltos = new ArrayList<Plato>();
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

	public ArrayList<Plato> getListaPaltos() {
		return listaPaltos;
	}

	public void setListaPaltos(ArrayList<Plato> listaPaltos) {
		this.listaPaltos = listaPaltos;
	}

	//-------- Métodos Propios --------
	
	//añadir un plato
	private void addPlato(Plato plato) 
	{
		listaPaltos.add(plato);
	}

	//eliminar un plato
	private void removePlato(Plato plato) 
	{
		listaPaltos.remove(plato);
	}
		
//	Un método coste() en la clase Comanda que calcula el precio total de todo
//	lo pedido.
	
	public int coste(ArrayList<Plato> platos) 
	{
		int total = 0;
		
		for (Plato plato : platos) 
		{
			total = total + plato.getPrecio();
		}
		
		return total;
	}
	
//	Un método hayDiabéticosEnLaMesa(), que retorna verdadero o falso, si se
//	han pedido postres sin azúcar en la comanda.
	public boolean hayDiabéticosEnLaMesa(ArrayList<Plato> platos) 
	{
		for (Plato plato : platos) 
		{
			if(plato instanceof Postre) //si el plato pertenece a la clase postre
			{
				if(((Postre) plato).isTieneAzucar() == true) // ← para ponerlo plato. y lo autocompleta
				{
					return true;
				}
			}
		}
		return false;
	}
	
	
	//*Imprimir
	@Override
	public String toString() 
	{
		return "Comanda [numeroMesa=" + numeroMesa + ", numeroComensales=" + numeroComensales + "]";
	}
	
}
