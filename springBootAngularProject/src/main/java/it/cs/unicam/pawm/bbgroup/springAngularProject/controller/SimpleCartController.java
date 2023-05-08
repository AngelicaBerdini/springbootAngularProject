package it.cs.unicam.pawm.bbgroup.springAngularProject.controller;

import it.cs.unicam.pawm.bbgroup.springAngularProject.exception.IdConflictException;
import it.cs.unicam.pawm.bbgroup.springAngularProject.model.Cart;
import it.cs.unicam.pawm.bbgroup.springAngularProject.service.CartManager;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/cart/")
public class SimpleCartController implements CartController{

    @Autowired
    private CartManager cartManager;
    @GetMapping("{id}")
    @Override
    public Cart getInstance(@PathVariable Integer id) throws EntityNotFoundException {
        return cartManager.getInstance(id);
    }

    @PostMapping("createNew")
    @Override
    public Cart create(@RequestBody Cart object) throws EntityNotFoundException, IdConflictException {
        return cartManager.create(object);
    }

    @Override
    public Cart update(Cart object) throws EntityNotFoundException, IdConflictException {
        return null;
    }
    @DeleteMapping("delete/{id}")
    @Override
    public boolean delete(@PathVariable Integer id) throws IdConflictException, EntityNotFoundException {
        return cartManager.delete(id);
    }
    @GetMapping("exist/{id}")
    @Override
    public boolean exists(@PathVariable Integer id) {
        return cartManager.exists(id);
    }
}
