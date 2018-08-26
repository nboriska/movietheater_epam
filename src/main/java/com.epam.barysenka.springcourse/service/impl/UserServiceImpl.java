package com.epam.barysenka.springcourse.service.impl;

import com.epam.barysenka.springcourse.dao.UserDAO;
import com.epam.barysenka.springcourse.dao.impl.UserDAOImpl;
import com.epam.barysenka.springcourse.domain.User;
import com.epam.barysenka.springcourse.service.UserService;

import java.util.List;
import java.util.Set;

/**
 * Implementation of UserService.
 */
public class UserServiceImpl implements UserService {
    private UserDAOImpl userDAO;

    public UserServiceImpl(){}

    public UserServiceImpl(UserDAOImpl userDAO) {
        this.userDAO = userDAO;
    }

    public User save(User obj) {
        return userDAO.save(obj);
    }

    @Deprecated
    public void remove(User obj) {
        userDAO.remove(obj);
    }

    public void removeById(Long objectID) {
        userDAO.removeById(objectID);
    }

    public User getByID(Long objectID){
        return userDAO.getByID(objectID);
    }

    public Set<User> getAll() {
        return userDAO.getAll();
    }

    public User getUserByEmail(String userEmail) {
        return userDAO.getUserByEmail(userEmail);
    }

    public UserDAOImpl getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAOImpl userDAO) {
        this.userDAO = userDAO;
    }
}
