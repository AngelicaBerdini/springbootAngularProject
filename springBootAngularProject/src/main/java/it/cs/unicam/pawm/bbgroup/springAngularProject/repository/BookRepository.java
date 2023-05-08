package it.cs.unicam.pawm.bbgroup.springAngularProject.repository;

import it.cs.unicam.pawm.bbgroup.springAngularProject.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Integer> {
    Optional<Book> findByBookId(Integer bookId);
}