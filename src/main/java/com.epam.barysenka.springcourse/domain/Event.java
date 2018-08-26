package com.epam.barysenka.springcourse.domain;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.DataFormatException;

/**
 * Event contains only basic information,
 * like name, base price for tickets, rating (high, mid, low)
 */
public class Event extends AbstractDomainObject {
    private static AtomicLong idGenerator= new AtomicLong(1);
    private String eventName;
    private Date eventDate;
    private double eventBasePrice;
    private EventRating eventRating;
    private Auditorium auditorium;

    public Event(){
    }

    public Event(String eventName, Date eventDate, double eventBasePrice, EventRating eventRating, Auditorium auditorium) {
        super(idGenerator.getAndIncrement());
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventBasePrice = eventBasePrice;
        this.eventRating = eventRating;
        this.auditorium = auditorium;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public double getEventBasePrice() {
        return eventBasePrice;
    }

    public void setEventBasePrice(double eventBasePrice) {
        this.eventBasePrice = eventBasePrice;
    }

    public EventRating getEventRating() {
        return eventRating;
    }

    public void setEventRating(EventRating eventRating) {
        this.eventRating = eventRating;
    }


    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public Auditorium getAuditorium() {
        return auditorium;
    }

    public void setAuditorium(Auditorium auditorium) {
        this.auditorium = auditorium;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(7, 31)
                .append(eventName)
                .append(eventBasePrice)
                .append(auditorium).toHashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null) return false;

        if (getClass() != obj.getClass())
            return false;

        Event rhs = (Event) obj;
        return new EqualsBuilder()
                .append(eventName, rhs.eventName)
                .append(eventBasePrice, rhs.eventBasePrice)
                .append(auditorium, rhs.auditorium).isEquals();
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventName='" + eventName + '\'' +
                ", eventBasePrice=" + eventBasePrice +
                ", eventRating=" + eventRating +
                ", auditorium=" + auditorium +
                '}';
    }
}
