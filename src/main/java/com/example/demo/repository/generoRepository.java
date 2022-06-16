package com.example.demo.repository;

import com.example.demo.models.generoEntity;
import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface generoRepository extends CrudRepository<generoEntity , Long>{
    
}
