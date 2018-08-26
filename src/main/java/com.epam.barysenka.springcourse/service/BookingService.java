package com.epam.barysenka.springcourse.service;

import com.epam.barysenka.springcourse.domain.Event;
import com.epam.barysenka.springcourse.domain.User;
import sun.security.krb5.internal.Ticket;

import java.util.Date;
import java.util.List;

/**
 * Manages tickets, prices, bookings
 *
 * getTicketsPrice(event, dateTime, user, seats) - returns total price for buying
 * all tickets for specified event on specific date and time for specified seats.
 *
 * User is needed to calculate discount.
 *
 * Event is needed to get base price, rating.
 *
 * Vip seats should cost more than regular seats (For example, 2xBasePrice)
 *
 * All prices for high rated movies should be higher (For example, 1.2xBasePrice)
 *
 * bookTicket(tickets) - Ticket should contain information about event, air dateTime, seat, and user. The user could be registered or not.
 * If user is registered, then booking information is stored for that user (in the tickets collection).
 * Purchased tickets for particular event should be stored.
 *
 * getPurchasedTicketsForEvent(event, dateTime) - get all purchased tickets for event for specific date and Time
 */
public interface BookingService {
    /**
     * Returns total price for buying all tickets for specified
     * event on specific date and time for specified seats.
     * @param event Evant
     * @param localDateTime Date
     * @param user User
     * @param seats list of seats
     * @return double price
     */
    double getTicketsPrice(Event event, Date localDateTime, User user, List<Long> seats);

    /**
     * Book tickets.
     * @param tickets list of tickets
     */
    void bookTicket(List<Ticket> tickets);

    /**
     * Get all purchased tickets for event for specific date and Time.
     * @param event Event
     * @param dateTime Date
     * @return list of tickets
     */
    List<Ticket> getPurchasedTicketsForEvent(Event event, Date dateTime);

}
