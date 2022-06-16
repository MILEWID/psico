package com.example.demo.repository;

import com.example.demo.models.tipousuarioEntity;
import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface tipousuarioRepository extends CrudRepository<tipousuarioEntity , Long>{
    
}
