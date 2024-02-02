package com.maktub.library.controller;

import com.maktub.library.entity.Book;
import com.maktub.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api/books")
public class BookController {

    private BookService bookService;

    @Autowired
    private BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PutMapping("/secure/checkout")
    public Book checkoutBook(@RequestParam Long bookId) throws Exception{
        String userEmail = "sriramprashad@gmail.com";

        return bookService.checkoutBook(userEmail, bookId);
    }

    @GetMapping("/secure/ischeckedout/byuser")
    public Boolean checkoutBookByUser(@RequestParam Long bookId){
        String userEmail = "sriramprashad@gmail.com";

        return bookService.checkoutBookByUser(userEmail, bookId);
    }

    @GetMapping("/secure/currentloan/count")
    public int currentLoansCount(){
        String userEmail = "sriramprashad@gmail.com";

        return bookService.currentLoansCount(userEmail);
    }

}
