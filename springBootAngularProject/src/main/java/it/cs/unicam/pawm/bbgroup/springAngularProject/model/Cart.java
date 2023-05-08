package it.cs.unicam.pawm.bbgroup.springAngularProject.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Collection;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Integer cartId;

    private double amount;

    @ManyToMany
    @JoinTable(name = "cart_books",
            joinColumns = @JoinColumn(name = "cart_id"),
            inverseJoinColumns = @JoinColumn(name = "books_book_id"))
    private Collection<Book> books = new ArrayList<>();



    public void addItems(Book book, int quantity) {
        for (int i = 0; i < quantity; i++) {
            this.books.add(book);
        }
    }
    public void removeItems(Book book, int quantity) {
        for (int i = 0; i < quantity; i++) {
            this.books.remove(book);
        }
    }

}
