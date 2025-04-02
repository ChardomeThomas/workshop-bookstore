package testing.app.controllers;

import java.math.BigInteger;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import testing.app.models.Book;

//GET books -> INDEX (findAll)
//GET books/:id -> SHOW (findById)
//POST books -> STORE (store / save)
//PUT books/:id -> UPDATE (update / save)
//DELETE books/:id -> DESTROY (destroy / delete / deleteById)

@RestController
@RequestMapping("api/books")
public class BookController {
    private BookService bookService;

    @PostMapping("")
    public BookResource store(@RequestBody @Valid BookRequest request) {
        retrun this.bookService.store(request);
    }

    @GetMapping("{id}")
    public Book show(@PathVariable BigInteger id) {
        return this.resitory.findById(id).orElseThrow();
    }

    @PutMapping("{id}")
    public GameResource update(@PathVariable BigInteger id, @RequestBody @Valid BookRequest request) {
        return this.bookService.update(id, request);
    }

    @DeleteMapping("{id}")
    public Book destroy(@PathVariable BigInteger id) {
        Book book = this.repository.findById(id).orElseThrow();

        this.repository.delete(book);

        return book;
    }

}
