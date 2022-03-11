package com.example.Library.Repository;
import com.example.Library.Entities.Historyentities;
import com.example.Library.Entities.Userentities;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends  CrudRepository<Userentities,Integer> {
}
