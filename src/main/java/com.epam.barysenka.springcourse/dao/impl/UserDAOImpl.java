package com.epam.barysenka.springcourse.dao.impl;

import com.epam.barysenka.springcourse.dao.UserDAO;
import com.epam.barysenka.springcourse.domain.User;
import org.apache.commons.lang.StringUtils;
import org.springframework.util.CollectionUtils;

import java.util.HashSet;
import java.util.Set;

public class UserDAOImpl implements UserDAO {
    private Set<User> userSet;
    private String[] nameArray = {"Bob", "Ken", "Joe", "Peter", "Alice", "Jennifer", "Natasha", "Oleg", "Traktorina", "Zosya"};

    public UserDAOImpl() {
    }

    private void initialize(){
        userSet = new HashSet<User>();

        for (int i = 0; i < nameArray.length; i++) {
            userSet.add(new User(nameArray[i], generateUserEmail(nameArray[i])));
        }
    }

    private String generateUserEmail(String userName) {
        String emailDomain = "@gmail.com";

        StringBuilder emailBuilder = new StringBuilder();
        emailBuilder.append(userName.trim()).append(emailDomain);

        return emailBuilder.toString();
    }

    @Override
    public User save(User obj) {
      if (userSet.add(obj)) {
          return obj;
      } else {
          return null;
      }
    }

    @Override
    @Deprecated
    public boolean remove(User obj) {
        return userSet.remove(obj);
    }

    @Override
    public void removeById(Long objectID) {
        User userToRemove = getByID(objectID);
        if (userToRemove != null) {
            userSet.remove(userToRemove);
        }
    }

    //will return first match
    @Override
    public User getByID(Long objectID) {
        User firstMatchUser = null;
        for (User user : userSet) {
            if (user.getId().equals(objectID)) {
                firstMatchUser = user;
                break;
            }
        }
        return firstMatchUser;
    }

    @Override
    public Set<User> getAll() {
        return userSet;
    }

    @Override
    public User getUserByEmail(String userEmail) {
        User userByEmail = null;

        if (!CollectionUtils.isEmpty(userSet) && StringUtils.isNotEmpty(userEmail)) {
            for (User user : userSet) {
                if (user.getUserEmail().equals(userEmail)) {
                    userByEmail = user;
                }
            }
        }
        return userByEmail;
    }
}
