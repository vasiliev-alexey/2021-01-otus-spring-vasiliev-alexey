package com.av.controllers;

import com.av.dao.BookService;
import com.av.domain.Book;
import com.av.dto.BookDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookApiController {


    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private final BookService bookService;

    public BookApiController(BookService bookService) {
        this.bookService = bookService;
    }


    @GetMapping("api/books")
    public ResponseEntity<?> getAllBooks(Model model) {

        List<Book> books = bookService.findAll();

        var bookDtoList = new ArrayList<BookDto>(books.size());

        books.forEach(b -> {
            var dto = new BookDto();
            dto.setIsbn(b.getIsbn());
            dto.setTitle(b.getTitle());
            dto.setId(b.getId());
            if (b.getGenre() != null) {
                dto.setGenreName(b.getGenre().getName());
            }
            dto.setIsbn(b.getIsbn());
            bookDtoList.add(dto);
        });

        return new ResponseEntity<>(bookDtoList, HttpStatus.OK);
    }

}
