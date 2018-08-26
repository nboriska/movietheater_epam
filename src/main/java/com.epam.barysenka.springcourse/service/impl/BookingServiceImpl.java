package com.epam.barysenka.springcourse.service.impl;

import com.epam.barysenka.springcourse.dao.impl.BookingDAOImpl;
import com.epam.barysenka.springcourse.domain.Event;
import com.epam.barysenka.springcourse.domain.User;
import com.epam.barysenka.springcourse.service.BookingService;
import sun.security.krb5.internal.Ticket;

import java.util.Date;
import java.util.List;

/**
 * Implementation of BookingService.
 */
public class BookingServiceImpl implements BookingService {
    private BookingDAOImpl bookingDAO;

    public BookingServiceImpl(){}

    public BookingServiceImpl(BookingDAOImpl bookingDAO){
        this.bookingDAO = bookingDAO;
    }

    public double getTicketsPrice(Event event, Date localDateTime, User user, List<Long> seats) {
        return bookingDAO.getTicketsPrice(event, localDateTime, user, seats);
    }

    public void bookTicket(List<Ticket> tickets) {
        bookingDAO.bookTicket(tickets);
    }

    public List<Ticket> getPurchasedTicketsForEvent(Event event, Date dateTime) {
        return bookingDAO.getPurchasedTicketsForEvent(event, dateTime);
    }

    public BookingDAOImpl getBookingDAO() {
        return bookingDAO;
    }

    public void setBookingDAO(BookingDAOImpl bookingDAO) {
        this.bookingDAO = bookingDAO;
    }
}
