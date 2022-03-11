package com.example.Library.Repository;

import com.example.Library.Entities.Booksentities;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  BooksRepository extends CrudRepository<Booksentities,Integer> {
}
