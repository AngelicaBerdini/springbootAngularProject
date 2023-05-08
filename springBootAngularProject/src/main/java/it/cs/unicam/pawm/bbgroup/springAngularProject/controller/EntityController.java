package it.cs.unicam.pawm.bbgroup.springAngularProject.controller;

import it.cs.unicam.pawm.bbgroup.springAngularProject.exception.IdConflictException;
import jakarta.persistence.EntityNotFoundException;

public interface EntityController <T,I>{
    T getInstance(I id) throws EntityNotFoundException;

    T create(T object) throws EntityNotFoundException, IdConflictException;

    T update(T object) throws EntityNotFoundException, IdConflictException;

    boolean delete(I id) throws IdConflictException, EntityNotFoundException;

    boolean exists(I id);
}
