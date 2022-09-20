package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Ticket;
import ru.netology.repository.TicketRepository;

public class TicketManagerTest {

    TicketManager manager = new TicketManager(new TicketRepository());

    Ticket ticket1 = new Ticket(1, 6000.00, "DME", "AGB", 90);
    Ticket ticket2 = new Ticket(2, 7000.00, "DME", "AGB", 120);
    Ticket ticket3 = new Ticket(3, 5000.00, "DME", "AGB", 150);
    Ticket ticket4 = new Ticket(4, 5000.00, "AGB", "VKO", 150);
    Ticket ticket5 = new Ticket(5, 6000.00, "AGB", "VKO", 120);
    Ticket ticket6 = new Ticket(6, 7000.00, "AGB", "VKO", 90);

    @BeforeEach
    public void setup() {
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
    }

    @Test
    public void findCheaperTicket() {

        Ticket[] expected = {ticket3, ticket1, ticket2};
        Ticket[] actual = manager.searchBy("DME", "AGB");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findCheaperTicketWhenNewTicketAdded() {

        Ticket ticket7 = new Ticket(7, 5000.00, "AGB", "VKO", 110);
        manager.add(ticket7);

        Ticket[] expected = {ticket4, ticket7, ticket5, ticket6};
        Ticket[] actual = manager.searchBy("AGB", "VKO");

        Assertions.assertArrayEquals(expected, actual);
    }










}


