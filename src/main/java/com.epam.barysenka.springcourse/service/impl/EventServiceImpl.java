package com.epam.barysenka.springcourse.service.impl;

import com.epam.barysenka.springcourse.dao.impl.EventDAOImpl;
import com.epam.barysenka.springcourse.domain.Event;
import com.epam.barysenka.springcourse.service.EventService;

import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Implementation of EventService.
 */
public class EventServiceImpl implements EventService {
    private EventDAOImpl eventDAO;

    public EventServiceImpl() {}

    public EventServiceImpl(EventDAOImpl eventDAO) {
        this.eventDAO = eventDAO;
    }

    @Override
    public Event getByName(String eventName) {
        return eventDAO.getByName(eventName);
    }

    @Override
    public Event save(Event obj) {
        return null;
    }

    @Override
    @Deprecated
    public void remove(Event obj) {
        eventDAO.remove(obj);
    }

    @Override
    public void removeById(Long objectID) {
        eventDAO.removeById(objectID);
    }

    @Override
    public Event getByID(Long objectID) {
        return eventDAO.getByID(objectID);
    }

    @Override
    public Set<Event> getAll() {
        return eventDAO.getAll();
    }

    //will be implemented in the next tasks
    @Override
    public List<Event> getForDateRange(Date from, Date to) {
        return null;
    }

    @Override
    public List<Event> getNextEvents(Date to) {
        return null;
    }

    public EventDAOImpl getEventDAO() {
        return eventDAO;
    }

    public void setEventDAO(EventDAOImpl eventDAO) {
        this.eventDAO = eventDAO;
    }
}
