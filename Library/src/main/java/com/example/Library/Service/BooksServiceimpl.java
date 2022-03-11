package com.example.Library.Service;

import com.example.Library.Dto.Books;
import com.example.Library.Dto.User;
import com.example.Library.Dto.UserBookHistory;
import com.example.Library.Entities.Booksentities;
import com.example.Library.Entities.Historyentities;
import com.example.Library.Entities.Userentities;
import com.example.Library.Repository.BooksRepository;
import com.example.Library.Repository.HistoryRepository;
import com.example.Library.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BooksServiceimpl implements Booksservice {



    @Autowired
    BooksRepository booksRepository;

    @Autowired
    HistoryRepository historyRepository;

    @Autowired
    UserRepository userRepository;




    public int countBook() {
        Iterable<Historyentities> iterable = HistoryRepository.findAll();
//        List<UserBookHistory> list = new ArrayList<>();
        List<Booksentities>list=new ArrayList<>();
        for (Historyentities i : iterable) {
            list.add(new UserBookHistory(i.getUserid(),i.getBookid(),i.getStartdate(),i.getEnddate());
        }
        ArrayList<Integer> bookid = new ArrayList<>();
        for (historyRepository i : list) {
            bookid.add(i.getBookid());
        }

        Integer maxId = Mostpopular(bookid);
        return maxId;
    }



    @Override
    public  void  addBook(Books books)
    {
        Booksentities booksentities =new Booksentities(books.getId(),books.getName(),books.getWriter(),books.getSummary(),books.getCategory());
        booksRepository.save(booksentities);
    }

    @Override
    public void  addUser(User user)
    {
      userRepository.save(new Userentities(user.getId(),user.getName(),user.getAddress(),user.getPhoneNumber()));

    }

    @Override
    public void issueBook(UserBookHistory userBookHistory)
    {
        historyRepository.save(new Historyentities(userBookHistory.getUserid(),userBookHistory.getBookid(),userBookHistory.getStartdate(),
            userBookHistory.getEnddate()));

    }

    @Override
    public void returnBook(UserBookHistory userBookHistory)
    {

       for(Historyentities historyentities : historyRepository.findAll())
       {
          if(historyentities.getBookid()==userBookHistory.getBookid() && historyentities.getUserid()==userBookHistory.getUserid())
          {
              historyRepository .save(new Historyentities(userBookHistory.getUserid(),userBookHistory.getBookid(),userBookHistory.getStartdate(),userBookHistory.getEnddate()));
          }
       }
    }




}
