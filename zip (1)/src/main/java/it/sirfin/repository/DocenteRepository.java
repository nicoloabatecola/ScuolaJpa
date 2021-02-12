/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.repository;

import it.sirfin.model.Docente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Hp Desktop
 */
public interface DocenteRepository extends JpaRepository<Docente, Long>{
    
}
