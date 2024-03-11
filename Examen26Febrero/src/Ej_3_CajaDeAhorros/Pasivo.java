package Ej_3_CajaDeAhorros;

import java.util.ArrayList;

public class Pasivo 
{
	//------- Atributos -------
	protected ArrayList<Prestamo> todosLosPrestamos;
	
	//------ Constructores ----
	//·normal
	public Pasivo(ArrayList<Prestamo> todosLosPrestamos) {
		super();
		this.todosLosPrestamos = todosLosPrestamos;
	}
	//·en caso de no completar el array
	public Pasivo() 
	{
		super();
		this.todosLosPrestamos = new ArrayList<Prestamo>();
	}	
	//-------- Getters/Setters --------
	public ArrayList<Prestamo> getTodosLosPrestamos() {
		return todosLosPrestamos;
	}
	public void setTodosLosPrestamos(ArrayList<Prestamo> todosLosPrestamos) {
		this.todosLosPrestamos = todosLosPrestamos;
	}
	//---- Métodos ArrayList -----
	public void addPrestamo(Prestamo p) 
	{
		todosLosPrestamos.add(p);
	}
	public void removePrestamo(Prestamo p) 
	{
		todosLosPrestamos.remove(p);
	}
	
	//-------- Métodos Propios --------
	
	//	- Dos métodos que retornan los prestamos que hay de cada tipo.
	//	“getPrestamosFijos()” 
	
	public String getPrestamosFijos() 
	{
		String listaPrestamosF = " ";
		
		for (Prestamo prestamo : todosLosPrestamos) 
		{
			if (prestamo instanceof InteresFijo) 
			{
				listaPrestamosF	= listaPrestamosF + prestamo.toString();
			}
		}
		
		return listaPrestamosF;
	}
	
	//	“getPrestamosVariables()”
	public String getPrestamosVariables() 
	{
		String listaPrestamosV = " ";

		for (Prestamo prestamo : todosLosPrestamos) 
		{
			if (prestamo instanceof InteresVariable) 
			{
				listaPrestamosV	= listaPrestamosV + prestamo.toString();
			}
		}
		return listaPrestamosV;
	}

	//*Imprimir
	@Override
	public String toString() 
	{
		String resultado= "Prestamos [";

		for (Prestamo prestamo : todosLosPrestamos) 
		{
			resultado = resultado + prestamo.toString();
		}

		resultado = resultado + "]";

		return resultado;
	}
	


}
