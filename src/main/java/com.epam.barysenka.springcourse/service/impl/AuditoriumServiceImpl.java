package com.epam.barysenka.springcourse.service.impl;

import com.epam.barysenka.springcourse.dao.impl.AuditoriumDAOImpl;
import com.epam.barysenka.springcourse.domain.Auditorium;
import com.epam.barysenka.springcourse.service.AuditoriumService;

import java.util.List;
import java.util.Set;

/**
 * Implementation of AuditoriumService.
 */
public class AuditoriumServiceImpl implements AuditoriumService {
    private AuditoriumDAOImpl auditoriumDAO;

    public AuditoriumServiceImpl(){}

    public AuditoriumServiceImpl(AuditoriumDAOImpl auditoriumDAO){
        this.auditoriumDAO = auditoriumDAO;
    }

    @Override
    public Auditorium save(Auditorium obj) {
        return auditoriumDAO.save(obj);
    }

    @Override
    @Deprecated
    public void remove(Auditorium obj) {
        auditoriumDAO.remove(obj);
    }

    @Override
    public void removeById(Long objectID) {
        auditoriumDAO.removeById(objectID);
    }

    public Auditorium getByID(Long objectID) {
        return auditoriumDAO.getByID(objectID);
    }

    public Set<Auditorium> getAll() {
        return auditoriumDAO.getAll();
    }

    public Auditorium getByName(String auditoriumName) {
        return auditoriumDAO.getByName(auditoriumName);
    }

    public AuditoriumDAOImpl getAuditoriumDAO() {
        return auditoriumDAO;
    }

    public void setAuditoriumDAO(AuditoriumDAOImpl auditoriumDAO) {
        this.auditoriumDAO = auditoriumDAO;
    }

}
