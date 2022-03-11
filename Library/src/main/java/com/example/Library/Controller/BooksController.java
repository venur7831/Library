package com.example.Library.Controller;


import com.example.Library.Dto.Books;
import com.example.Library.Dto.User;
import com.example.Library.Dto.UserBookHistory;
import com.example.Library.Service.Booksservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.metadata.ValidateUnwrappedValue;

@RestController
public class BooksController {
    @Autowired
    Booksservice booksservice;







    @PostMapping(value="/addbooks")
    public void addBook(@RequestBody  Books books)
    {
        booksservice.addBook(books);

    }

    @PostMapping(value="/addUser")
    public void addUser(@RequestBody  User user)
    {

        booksservice.addUser(user);

    }


    @PostMapping(value="/issueBook")
            public void issueBook(@RequestBody UserBookHistory userbookhistory)
    {

        booksservice.issueBook(userbookhistory);

    }
    @PutMapping(value="/returnbook")
    public void returnBook(@RequestBody UserBookHistory userbookhistory)
    {
        booksservice.returnBook(userbookhistory);
    }



}
