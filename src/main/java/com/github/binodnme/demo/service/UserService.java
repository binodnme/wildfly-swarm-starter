package com.github.binodnme.demo.service;

import com.github.binodnme.demo.entity.User;

import java.util.List;

/**
 * @author Binod Shrestha <binodshrestha@lftechnology.com> on 11/15/17.
 */
public interface UserService {
    List<User> fetchAll();
}
