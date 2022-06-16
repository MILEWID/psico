package com.example.demo.repository;

import com.example.demo.models.transtornoEntity;
import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface transtornoRepository extends CrudRepository<transtornoEntity , Long>{
    
}
