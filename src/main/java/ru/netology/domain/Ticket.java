package ru.netology.domain;

public class Ticket implements Comparable<Ticket> {

    private int ticketId;
    private double ticketAmount;
    private String airportDeparture;
    private String airportArrival;
    private int travelTimeMinutes;

    public Ticket(int ticketId, double ticketAmount, String airportDeparture, String airportArrival, int travelTimeMinutes) {
        this.ticketId = ticketId;
        this.ticketAmount = ticketAmount;
        this.airportDeparture = airportDeparture;
        this.airportArrival = airportArrival;
        this.travelTimeMinutes = travelTimeMinutes;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public double getTicketAmount() {
        return ticketAmount;
    }

    public void setTicketAmount(double ticketAmount) {
        this.ticketAmount = ticketAmount;
    }

    public String getAirportDeparture() {
        return airportDeparture;
    }

    public void setAirportDeparture(String airportDeparture) {
        this.airportDeparture = airportDeparture;
    }

    public String getAirportArrival() {
        return airportArrival;
    }

    public void setAirportArrival(String airportArrival) {
        this.airportArrival = airportArrival;
    }

    public int getTravelTimeMinutes() {
        return travelTimeMinutes;
    }

    public void setTravelTimeMinutes(int travelTimeMinutes) {
        this.travelTimeMinutes = travelTimeMinutes;
    }

    @Override
    public int compareTo(Ticket o) {
        if (ticketAmount < o.getTicketAmount()) {
            return -1;
        } else {
            if (ticketAmount > o.getTicketAmount()) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
