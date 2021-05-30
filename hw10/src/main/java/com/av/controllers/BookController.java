package com.av.controllers;

import com.av.dao.BookService;
import com.av.domain.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("books")
    public String getAllBooks(Model model) {
        return "books";
    }

    @GetMapping("book/edit")
    public String editBook(@RequestParam("id") Long bookId, Model model) {

        logger.info("book/edit income");
        var book = bookService.getById(bookId).get();
        model.addAttribute("book", book);
        return "book_edit";
    }

    @GetMapping("book/delete")
    public String removeBook(@RequestParam("id") Long bookId, Model model) {

        logger.info("book/edit income booki=" + bookId);
        var book = bookService.getById(bookId).get();
        logger.info("book=" + book);
        model.addAttribute("book", book);
        return "book_delete";
    }


    @PostMapping("book/remove")
    public String removeBook(Book book, Model model) {
        logger.info("book/RemoveBook income");
        bookService.deleteById(book.getId());
        return "redirect:/books";
    }

    @GetMapping("book/new")
    public String newBook(Model model) {
        logger.info("book/new book income");
        model.addAttribute("book", new Book());
        return "book_new";
    }


    @PostMapping("book/save")
    public String saveBook(Book book, Model model) {
        logger.info("book/book income");
        bookService.save(book);
        return "redirect:/books";
    }


}
