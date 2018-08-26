package com.epam.barysenka.springcourse.dao;

import com.epam.barysenka.springcourse.domain.Event;

import java.util.Date;
import java.util.List;

public interface EventDAO extends BaseDAO<Event> {

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
