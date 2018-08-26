package com.epam.barysenka.springcourse.dao;

import com.epam.barysenka.springcourse.domain.AbstractDomainObject;
import com.epam.barysenka.springcourse.domain.Auditorium;

/**
 * Contains info about auditoriums and places
 */
public interface AuditoriumDAO extends BaseDAO<Auditorium> {

    Auditorium getByName(String auditoriumName);

}
