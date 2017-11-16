package com.github.binodnme.demo.service;

import com.github.binodnme.demo.entity.User;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * @author Binod Shrestha <binodshrestha@lftechnology.com> on 11/15/17.
 */

public class UserServiceImpl implements UserService {

    @Inject
    private EntityManager em;

    @Override
    public List<User> fetchAll() {
        TypedQuery<User> query = em.createQuery("select u from User u", User.class);
        return query.getResultList();
    }
}
