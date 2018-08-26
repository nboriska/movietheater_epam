package com.epam.barysenka.springcourse.dao.impl;

import com.epam.barysenka.springcourse.dao.AuditoriumDAO;
import com.epam.barysenka.springcourse.domain.Auditorium;
import org.apache.commons.lang.StringUtils;
import org.springframework.util.CollectionUtils;

import java.util.Set;

public class AuditoriumDAOImpl implements AuditoriumDAO {
    private Set<Auditorium> auditoriumSet;

    public AuditoriumDAOImpl(){
    }

    public AuditoriumDAOImpl(Set<Auditorium> auditoriumSet){
        this.auditoriumSet = auditoriumSet;
    }

    @Override
    public Auditorium save(Auditorium obj) {
        Auditorium newAuditorium = null;
        if (obj != null) {
            if (auditoriumSet.add(obj)) {
                newAuditorium = obj;
            }
        }
        return newAuditorium;
    }

    @Override
    @Deprecated
    public boolean remove(Auditorium obj) {
        return false;
    }

    @Override
    public void removeById(Long objectID) {
        Auditorium auditoriumToRemove = null;
        if(!CollectionUtils.isEmpty(auditoriumSet) && objectID != null){
            auditoriumToRemove = getByID(objectID);
            if (auditoriumToRemove!=null) {
                auditoriumSet.remove(auditoriumToRemove);
            }
        }

    }

    @Override
    public Auditorium getByID(Long objectID) {
        Auditorium auditoriumById = null;
        if(!CollectionUtils.isEmpty(auditoriumSet) && objectID != null) {
            for (Auditorium auditorium : auditoriumSet) {
                if (auditorium.getId().equals(objectID)){
                    auditoriumById = auditorium;
                    break;
                }
            }
        }
        return auditoriumById;
    }

    @Override
    public Auditorium getByName(String auditoriumName) {
        Auditorium auditoriumByName = null;
        if(!CollectionUtils.isEmpty(auditoriumSet) && StringUtils.isNotEmpty(auditoriumName)) {
            for (Auditorium auditorium : auditoriumSet) {
                if (auditorium.getAuditoriumName().equals(auditoriumName)){
                    auditoriumByName = auditorium;
                    break;
                }
            }
        }
        return auditoriumByName;
    }

    @Override
    public Set<Auditorium> getAll() {
        return auditoriumSet;
    }

    public Set<Auditorium> getAuditoriumSet() {
        return auditoriumSet;
    }

    public void setAuditoriumSet(Set<Auditorium> auditoriumSet) {
        this.auditoriumSet = auditoriumSet;
    }
}
