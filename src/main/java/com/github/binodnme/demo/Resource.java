package com.github.binodnme.demo;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Binod Shrestha <binodshrestha@lftechnology.com> on 11/15/17.
 */
public class Resource {

    @Produces
    @PersistenceContext
    private EntityManager em;

}
