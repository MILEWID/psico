/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.repository;
import com.example.demo.models.Historia_ClinicaEntity;
import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Usuario
 */
@Repository
public interface Historia_ClinicaRepository extends CrudRepository<Historia_ClinicaEntity , Long>{
    public abstract ArrayList<Historia_ClinicaEntity> findBytranstorno(String transtorno);
}
