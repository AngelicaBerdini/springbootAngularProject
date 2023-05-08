package it.cs.unicam.pawm.bbgroup.springAngularProject.controller;

import it.cs.unicam.pawm.bbgroup.springAngularProject.exception.IdConflictException;
import it.cs.unicam.pawm.bbgroup.springAngularProject.model.Book;
import it.cs.unicam.pawm.bbgroup.springAngularProject.service.BookManager;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/book/")
public class SimpleBookController implements BookController{

    @Autowired
    private BookManager bookManager;
    @GetMapping("{id}")
    @Override
    public Book getInstance(@PathVariable Integer id) throws EntityNotFoundException {
        return bookManager.getInstance(id);
    }

    @PostMapping("createNew")
    @Override
    public Book create(@RequestBody Book object) throws EntityNotFoundException, IdConflictException {
        return bookManager.create(object);
    }

    @Override
    public Book update(Book object) throws EntityNotFoundException, IdConflictException {
        return null;
    }

    @DeleteMapping("delete/{id}")
    @Override
    public boolean delete(@PathVariable Integer id) throws IdConflictException, EntityNotFoundException {
        return bookManager.delete(id);
    }
    @GetMapping("exist/{id}")
    @Override
    public boolean exists(@PathVariable Integer id) {
        return bookManager.exists(id);
    }
}
