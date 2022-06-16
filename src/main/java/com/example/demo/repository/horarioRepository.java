package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.horarioEntity;

@Repository
public interface horarioRepository extends CrudRepository<horarioEntity, Long>{
	public abstract Optional<horarioEntity> findById(Long id);
}
