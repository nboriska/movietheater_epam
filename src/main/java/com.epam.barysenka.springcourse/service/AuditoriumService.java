package com.epam.barysenka.springcourse.service;

import com.epam.barysenka.springcourse.domain.Auditorium;

/**
 * Returns info about auditoriums and places
 * Several auditoriums can be stored in separate property files or in a single file, information from them should be injected into the AuditoriumService
 * getAll(), getByName()
 */
public interface AuditoriumService extends BaseService<Auditorium> {

    /**
     * Returns auditorium by name.
     * @param auditoriumName String
     * @return Auditorium
    */
    Auditorium getByName(String auditoriumName);
}
