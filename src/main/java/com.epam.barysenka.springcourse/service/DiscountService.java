package com.epam.barysenka.springcourse.service;

import com.epam.barysenka.springcourse.domain.Event;
import com.epam.barysenka.springcourse.domain.User;

import java.util.Date;

/**
 * Counts different discounts for purchased tickets
 * getDiscount(user, event, dateTime, numberOfTickets) - returns total discount (from 0 to 100) that can be applied
 * to the user buying specified number of tickets for specific event and air dateTime.
 */
public interface DiscountService {
    byte getDiscount(User user, Event event, Date dateTime, long numberOfTickets);
}
