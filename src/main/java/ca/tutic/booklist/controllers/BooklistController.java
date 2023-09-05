package ca.tutic.booklist.controllers;

import ca.tutic.booklist.books.Book;
import ca.tutic.booklist.books.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class BooklistController {
    private BookRepository bookRepo;

    @Autowired
    public BooklistController(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    @GetMapping("/")
    public String getBooklist(Model model) {
        List<Book> books = bookRepo.findAll();
        model.addAttribute("books", books);

        return "booklist";
    }

    @PostMapping("/")
    public String addBook(@ModelAttribute Book book) {
        bookRepo.save(book);
        return "redirect:/";
    }

}
