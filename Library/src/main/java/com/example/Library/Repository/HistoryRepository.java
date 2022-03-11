package com.example.Library.Repository;
import com.example.Library.Entities.Historyentities;
import org.springframework.data.repository.CrudRepository;


import org.springframework.stereotype.Repository;

@Repository
public interface HistoryRepository extends CrudRepository<Historyentities,Integer> {
}
