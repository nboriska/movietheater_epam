package com.epam.barysenka.springcourse.service.impl;

import com.epam.barysenka.springcourse.domain.Event;
import com.epam.barysenka.springcourse.domain.User;
import com.epam.barysenka.springcourse.service.DiscountService;

import java.util.Date;

/**
 * Implementation of DiscountService
 */
public class DiscountServiceImpl implements DiscountService {

    public byte getDiscount(User user, Event event, Date dateTime, long numberOfTickets) {
        return 1;
    }
}
