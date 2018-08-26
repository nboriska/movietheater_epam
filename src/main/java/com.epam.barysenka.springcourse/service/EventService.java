package com.epam.barysenka.springcourse.service;

import com.epam.barysenka.springcourse.domain.Event;

import java.util.Date;
import java.util.List;

/**
 * Manages events (movie shows).
 * Event contains only basic information, like name,
 * base price for tickets, rating (high, mid, low).
 * Event can be presented on several dates and several times within each day.
 *
 * For each dateTime an Event will be presented only in single Auditorium.
 * save, remove, getById, getByName, getAll
 * getForDateRange(from, to) - returns events for specified date range (OPTIONAL)
 * getNextEvents(to) - returns events from now till the ‘to’ date (OPTIONAL)
 */
public interface EventService extends BaseService<Event> {

    /**
     * Gets event by Name.
     * @param eventName String
     * @return Event
     */
    Event getByName(String eventName);

    /**
     * Returns events for specified date range.
     * @param from Date
     * @param to Date
     * @return event list
     */
    List<Event> getForDateRange(Date from, Date to);

    /**
     * Returns events from now till the ‘to’ date.
     * @param to Date
     * @return Event
     */
    List<Event> getNextEvents(Date to);
}
