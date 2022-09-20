package ru.netology.repository;

import ru.netology.domain.Ticket;

public class TicketRepository {

    private Ticket[] tickets = new Ticket[0];

    public void saveTickets(Ticket ticket) {

        Ticket[] tmp = new Ticket[tickets.length + 1];
        for (int i = 0; i < tickets.length; i++) {
            tmp[i] = tickets[i];
        }
        tmp[tmp.length - 1] = ticket;
        tickets = tmp;
    }

    public Ticket[] getTickets() {
        return tickets;
    }

    public void removeTicketsById(int id) {
        Ticket[] tmp = new Ticket[tickets.length - 1];
        int copyToIndex = 0;
        for (Ticket ticket : tickets) {
            if (ticket.getTicketId() != id) {
                tmp[copyToIndex] = ticket;
                copyToIndex++;
            }
        }
        tickets = tmp;
    }

}
