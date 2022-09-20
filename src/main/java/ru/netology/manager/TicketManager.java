package ru.netology.manager;

import ru.netology.domain.Ticket;
import ru.netology.repository.TicketRepository;

import java.util.Arrays;

public class TicketManager {

    private TicketRepository repo;

    public TicketManager(TicketRepository repo) {
        this.repo = repo;
    }

    public void add(Ticket ticket) {
        repo.saveTickets(ticket);
    }

    public Ticket[] searchBy(String departure, String arrival) {
        Ticket[] result = new Ticket[0];
        for (Ticket ticket : repo.getTickets()) {
            if (matches(ticket, departure, arrival)) {
                Ticket[] tmp = new Ticket[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];

                }
                tmp[tmp.length - 1] = ticket;
                result = tmp;
            }
        }
        Arrays.sort(result);
        return result;
    }
    public boolean matches(Ticket ticket, String departure, String arrival) {
        if (ticket.getAirportDeparture().equals(departure)) {
            if (ticket.getAirportArrival().equals(arrival)) {
                return true;
            }
        }
        return false;
    }
}
