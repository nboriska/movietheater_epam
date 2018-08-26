package com.epam.barysenka.springcourse.domain;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Domain entity for User.
 */
public class User extends AbstractDomainObject implements Comparable<User> {
    private static AtomicLong idGenerator= new AtomicLong(1);
    private String userName;
    private String userEmail;
    private Date userDOB;

    public User() {
    }

    public User(String userName, String userEmail) {
        super(idGenerator.getAndIncrement());
        this.userName = userName;
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(7, 31)
                .append(userName)
                .append(userEmail).toHashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null) return false;

        if (getClass() != obj.getClass())
            return false;

        User rhs = (User) obj;
        return new EqualsBuilder()
                .append(userName, rhs.userName)
                .append(userEmail, rhs.userEmail).isEquals();
    }

    @Override
    public String toString() {
        return "User{" +
                "userID='" + getId() + '\'' +
                "userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                '}';
    }

    @Override
    public int compareTo(User otherUser) {
        return (int) (this.getId() - otherUser.getId());
    }
}
