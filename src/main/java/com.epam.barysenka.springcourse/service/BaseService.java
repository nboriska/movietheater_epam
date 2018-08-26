package com.epam.barysenka.springcourse.service;

import com.epam.barysenka.springcourse.domain.AbstractDomainObject;

import java.util.List;
import java.util.Set;

/**
 * Base DAO describes common operations.
 * @param <T>
 */
public interface BaseService<T extends AbstractDomainObject> {

    T save(T obj);

    @Deprecated
    void remove(T obj);

    void removeById(Long objectID);

    T getByID(Long objectID);

    Set<T> getAll();
}
