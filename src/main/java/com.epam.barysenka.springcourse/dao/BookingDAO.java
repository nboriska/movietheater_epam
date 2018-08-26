package com.epam.barysenka.springcourse.dao;

import com.epam.barysenka.springcourse.domain.AbstractDomainObject;
import com.epam.barysenka.springcourse.domain.Event;
import com.epam.barysenka.springcourse.domain.User;
import sun.security.krb5.internal.Ticket;

import java.util.Date;
import java.util.List;

/**
 *
*/
public interface BookingDAO {
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
