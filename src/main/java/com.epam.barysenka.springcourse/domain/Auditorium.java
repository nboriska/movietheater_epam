package com.epam.barysenka.springcourse.domain;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/**
 * The information that needs to be stored is:
 * name
 * number of seats
 * vip seats (comma-separated list of expensive seats)
 */
public class Auditorium extends AbstractDomainObject {
    private static AtomicLong idGenerator= new AtomicLong(1);
    private String auditoriumName;
    private long numberOfSeats;
    //for now use string set as cannot convert string to set using xml configuration
    private String vipSeatsAsString;
    private Set<Long> vipSeats;

    public Auditorium(){
    }

    public Auditorium(String auditoriumName, long numberOfSeats, String vipSeatsAsString) {
        super(idGenerator.getAndIncrement());
        this.auditoriumName = auditoriumName;
        this.numberOfSeats = numberOfSeats;
        this.vipSeatsAsString = vipSeatsAsString;
    }

    public Auditorium(String auditoriumName, long numberOfSeats, Set<Long> vipSeats) {
        super(idGenerator.getAndIncrement());
        this.auditoriumName = auditoriumName;
        this.numberOfSeats = numberOfSeats;
        this.vipSeats = vipSeats;
    }

    public String getAuditoriumName() {
        return auditoriumName;
    }

    public void setAuditoriumName(String auditoriumName) {
        this.auditoriumName = auditoriumName;
    }

    public long getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(long numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Set<Long> getVipSeats() {
        return vipSeats;
    }

    public void setVipSeats(Set<Long> vipSeats) {
        this.vipSeats = vipSeats;
    }


    public String getVipSeatsAsString() {
        return vipSeatsAsString;
    }

    public void setVipSeatsAsString(String vipSeatsAsString) {
        this.vipSeatsAsString = vipSeatsAsString;
    }


    @Override
    public int hashCode() {
        return new HashCodeBuilder(7, 31)
                .append(auditoriumName)
                .append(numberOfSeats)
                .append(vipSeatsAsString)
                .append(vipSeats).toHashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null) return false;

        if (getClass() != obj.getClass())
            return false;

        Auditorium rhs = (Auditorium) obj;
        return new EqualsBuilder()
                .append(auditoriumName, rhs.auditoriumName)
                .append(numberOfSeats, rhs.numberOfSeats)
                .append(vipSeatsAsString, rhs.vipSeatsAsString)
                .append(vipSeats, rhs.vipSeats).isEquals();
    }

    @Override
    public String toString() {
        return "Auditorium{" +
                "auditoriumID='" + getId() + '\'' +
                ", auditoriumName='" + auditoriumName + '\'' +
                ", numberOfSeats=" + numberOfSeats + '\'' +
                ", vipSeats=" + vipSeatsAsString + '\'' +
                '}';
    }


}
