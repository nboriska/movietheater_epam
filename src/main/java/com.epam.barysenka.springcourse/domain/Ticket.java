package com.epam.barysenka.springcourse.domain;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Ticket domain object.
*/
 public class Ticket extends AbstractDomainObject {
     private static AtomicLong idGenerator= new AtomicLong(1);
     private Double price;
     private Date onDate;
     private Event event;
     private User user;

     public Ticket(){}

     public Ticket(Double price, Date onDate, Event event, User user) {
         super(idGenerator.getAndIncrement());
         this.price = price;
         this.onDate = onDate;
         this.event = event;
         this.user = user;
     }

     public Double getPrice() {
      return price;
     }

     public void setPrice(Double price) {
      this.price = price;
     }

     public Date getOnDate() {
      return onDate;
     }

     public void setOnDate(Date onDate) {
      this.onDate = onDate;
     }

     public Event getEvent() {
      return event;
     }

     public void setEvent(Event event) {
      this.event = event;
     }

     public User getUser() {
      return user;
     }

     public void setUser(User user) {
      this.user = user;
     }

     @Override
     public int hashCode() {
      return new HashCodeBuilder(7, 31)
              .append(price)
              .append(onDate)
              .append(event)
              .append(user).toHashCode();
     }

     @Override
     public boolean equals(Object obj) {
      if (this == obj) return true;

      if (obj == null) return false;

      if (getClass() != obj.getClass())
       return false;

      Ticket rhs = (Ticket) obj;
      return new EqualsBuilder()
              .append(price, rhs.price)
              .append(onDate, rhs.onDate)
              .append(event, rhs.event)
              .append(user, rhs.user).isEquals();
     }

     @Override
     public String toString() {
         return "Ticket{" +
                 "ticketID='" + getId() + '\'' +
                 "price='" + price + '\'' +
                 ", onDate='" + onDate + '\'' +
                 ", event='" + event + '\'' +
                 ", user='" + user + '\'' +
                 '}';
     }
}
