package EjercicioParking;

import java.util.ArrayList;

public class Parking 
{
	
	protected int capacidad;
	protected ArrayList<Ticket> tickets;

	public Parking(int capacidad, ArrayList<Ticket> tickets) {
		super();
		this.capacidad = capacidad;
		this.tickets = tickets;
	}
	
	public Parking(int capacidad) {
		super();
		this.capacidad = capacidad;
		this.tickets = new ArrayList<Ticket>();
	}


	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public ArrayList<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(ArrayList<Ticket> tickets) {
		this.tickets = tickets;
	}
 
	public Ticket getTickets(String matricula) 
	{
		for (Ticket ticket : tickets) 
		{
			ticket.getMatricula();
			return ticket;
		}
		return null;
	}
	
	public void addTickets(Ticket t) throws TicketException
	{
		if(this.tickets.size() == this.capacidad) 
		{
			throw new TicketException("Parking Completo");
		}
		
		if (this.getTickets(t.getMatricula()) != null) 
		{
			throw new TicketException("La matricula ya estaba");
		}
		
		this.tickets.add(t); //añado el ticket
	}
	
	public void removeTickets(Ticket t) throws TicketException
	{
		if(t.isPagado() == false) 
		{
			throw new TicketException("Abone su ticket por favor");
		}
		else
		this.tickets.remove(t); //borro el ticket			
	}
	
 
}
