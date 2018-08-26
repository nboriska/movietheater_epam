package com.epam.barysenka.springcourse.dao.impl;

import com.epam.barysenka.springcourse.dao.EventDAO;
import com.epam.barysenka.springcourse.dao.util.RandomHelper;
import com.epam.barysenka.springcourse.domain.Auditorium;
import com.epam.barysenka.springcourse.domain.Event;
import com.epam.barysenka.springcourse.domain.EventRating;
import org.apache.commons.lang.StringUtils;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EventDAOImpl implements EventDAO {
    private static final int eventCount = 10;
    private Set<Event> eventSet;

    public EventDAOImpl() {

    }

    private void initialize(){
        eventSet = new HashSet<Event>();

        for (int i = 0; i < eventCount; i++) {
            eventSet.add(new Event(RandomHelper.getRandomString(),
                    RandomHelper.getRandomDate(),
                    RandomHelper.getRandomPrice(),
                    (i > 5) ? EventRating.HIGH : EventRating.LOW,
                    new Auditorium(RandomHelper.getRandomString(), i + 15, "1")));
        }
    }

    @Override
    public Event save(Event obj) {
        Event newEvent = null;
        if (eventSet.add(obj)){
            newEvent = obj;
        }
        return newEvent;
    }

    @Override
    @Deprecated
    public boolean remove(Event obj) {
        return false;
    }

    @Override
    public Event getByID(Long objectID) {
        Event eventById = null;
        if (!CollectionUtils.isEmpty(eventSet) && objectID != null) {
            for (Event event: eventSet) {
                if(event.getId().equals(objectID)){
                    eventById = event;
                    break;
                }
            }
        }
        return eventById;
    }

    @Override
    public Set<Event> getAll() {
        return eventSet;
    }

    @Override
    public void removeById(Long objectID) {
        Event eventToRemove = getByID(objectID);
        if (eventToRemove != null) {
            eventSet.remove(eventToRemove);
        }
    }

    @Override
    public Event getByName(String eventName) {
        Event eventByName = null;
        if (!CollectionUtils.isEmpty(eventSet) && StringUtils.isNotEmpty(eventName)) {
            for (Event event: eventSet) {
                if(event.getEventName().equals(eventName)){
                    eventByName = event;
                    break;
                }
            }
        }
        return eventByName;
    }

    @Override
    public List<Event> getForDateRange(Date from, Date to) {
        return null;
    }

    @Override
    public List<Event> getNextEvents(Date to) {
        return null;
    }
}
