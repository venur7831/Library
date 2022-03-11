package com.example.Library.Service;

import com.example.Library.Dto.Books;
import com.example.Library.Dto.User;
import com.example.Library.Dto.UserBookHistory;
import org.springframework.stereotype.Component;
@Component

public interface Booksservice {



     void addBook(Books books);
    void addUser(User user);
    void issueBook(UserBookHistory userBookHistory);
    void returnBook(UserBookHistory userBookHistory);
    void Mostpopular(UserBookHistory userBookHistory);

}
