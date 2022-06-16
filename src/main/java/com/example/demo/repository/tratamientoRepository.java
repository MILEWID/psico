package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.tratamientoEntity;

@Repository

public interface tratamientoRepository extends CrudRepository<tratamientoEntity, Long> {
	public abstract Optional<tratamientoEntity> findById(Long id);
}
