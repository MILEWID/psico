package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.models.alergiaEntity;

@Repository

public interface alergiaRepository extends CrudRepository<alergiaEntity, Long> {
	public abstract Optional<alergiaEntity> findById(Long id);
}
