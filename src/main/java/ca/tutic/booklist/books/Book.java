package ca.tutic.booklist.books;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int ID;
    private String name;
    private String author;
    private String isbn;
    private boolean read;
}
