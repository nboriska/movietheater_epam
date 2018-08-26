package com.epam.barysenka.springcourse.dao;

import com.epam.barysenka.springcourse.domain.User;

public interface UserDAO extends BaseDAO<User> {
    /**
     * Returns user by e-mail.
     * @param userEmail String
     * @return User
     */
    User getUserByEmail(String userEmail);
}
