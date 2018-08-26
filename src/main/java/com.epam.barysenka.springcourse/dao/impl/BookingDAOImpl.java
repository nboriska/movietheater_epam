package com.epam.barysenka.springcourse.dao.impl;

import com.epam.barysenka.springcourse.dao.BookingDAO;
import com.epam.barysenka.springcourse.domain.Event;
import com.epam.barysenka.springcourse.domain.User;
import sun.security.krb5.internal.Ticket;

import java.util.Date;
import java.util.List;

public class BookingDAOImpl implements BookingDAO {

    public BookingDAOImpl(){}

    //will be implemented in the next tasks
    @Override
    public double getTicketsPrice(Event event, Date localDateTime, User user, List<Long> seats) {
        return 0;
    }

    @Override
    public void bookTicket(List<Ticket> tickets) {

    }

    @Override
    public List<Ticket> getPurchasedTicketsForEvent(Event event, Date dateTime) {
        return null;
    }
}
