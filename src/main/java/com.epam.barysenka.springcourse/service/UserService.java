package com.epam.barysenka.springcourse.service;

import com.epam.barysenka.springcourse.domain.User;

/**
 * Manages registered users
 * save, remove, getById, getUserByEmail, getAll
 */
public interface UserService extends BaseService<User> {

    /**
     * Returns user by e-mail.
     * @param userEmail String
     * @return User
     */
    User getUserByEmail(String userEmail);
}
