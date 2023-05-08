package it.cs.unicam.pawm.bbgroup.springAngularProject.service;

import it.cs.unicam.pawm.bbgroup.springAngularProject.exception.IdConflictException;
import it.cs.unicam.pawm.bbgroup.springAngularProject.model.Cart;
import it.cs.unicam.pawm.bbgroup.springAngularProject.repository.CartRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class SimpleCartManager implements CartManager{

    @Autowired
    private CartRepository cartRepository;
    @Override
    public Cart getInstance(Integer id) throws EntityNotFoundException {
        return cartRepository.findByCartId(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Cart create(Cart object) throws EntityNotFoundException, IdConflictException {
        return cartRepository.save(object);
    }

    @Override
    public Cart update(Cart object) throws EntityNotFoundException, IdConflictException {
        return null;
    }

    @Override
    public boolean delete(Integer id) throws EntityNotFoundException, IdConflictException {
        if(!cartRepository.existsById(id)) throw new EntityNotFoundException("Attività con id: "+id+" non trovata, impossibile cancellare!");
        cartRepository.deleteById(id);
        return !this.exists(id);
    }

    @Override
    public boolean exists(Integer id) {
        return cartRepository.existsById(id);
    }
}
