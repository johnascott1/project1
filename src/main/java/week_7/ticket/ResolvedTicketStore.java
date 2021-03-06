package week_7.ticket;

import java.util.LinkedList;

public class ResolvedTicketStore {
    
    LinkedList<Ticket> resolvedTickets;
    
    ResolvedTicketStore() {
        resolvedTickets = new LinkedList<Ticket>();
    }
    
    public void addTicket(Ticket t) {
        resolvedTickets.add(t);
    }
    
    public LinkedList<Ticket> getAll() {
        return resolvedTickets;
    }
    
}
