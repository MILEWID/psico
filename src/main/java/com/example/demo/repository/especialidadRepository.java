/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.repository;

import com.example.demo.models.especialidadEntity;
import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Usuario
 */
@Repository
public interface especialidadRepository  extends CrudRepository<especialidadEntity , Long> {
    //public abstract ArrayList<especialidadEntity> findById(Long id);
}
