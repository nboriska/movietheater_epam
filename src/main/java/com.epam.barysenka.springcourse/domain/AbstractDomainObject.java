package com.epam.barysenka.springcourse.domain;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Abstract domain entity.
 */
public abstract class AbstractDomainObject {
    private Long id;

    public AbstractDomainObject(){
    }

    public AbstractDomainObject(Long id){
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
