package it.cs.unicam.pawm.bbgroup.springAngularProject.service;

import it.cs.unicam.pawm.bbgroup.springAngularProject.exception.IdConflictException;
import it.cs.unicam.pawm.bbgroup.springAngularProject.model.Book;
import it.cs.unicam.pawm.bbgroup.springAngularProject.repository.BookRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class SimpleBookManager implements BookManager{

    @Autowired
    private BookRepository bookRepository;
    @Override
    public Book getInstance(Integer id) throws EntityNotFoundException {
        return bookRepository.findByBookId(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Book create(Book object) throws EntityNotFoundException, IdConflictException {
        return bookRepository.save(object);
    }

    @Override
    public Book update(Book object) throws EntityNotFoundException, IdConflictException {
        return null;
    }

    @Override
    public boolean delete(Integer id) throws EntityNotFoundException, IdConflictException {
        if(!bookRepository.existsById(id)) throw new EntityNotFoundException("Attività con id: "+id+" non trovata, impossibile cancellare!");
        bookRepository.deleteById(id);
        return !this.exists(id);
    }

    @Override
    public boolean exists(Integer id) {
        return
                bookRepository.existsById(id);
    }
}
