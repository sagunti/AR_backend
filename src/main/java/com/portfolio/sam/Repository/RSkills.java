/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.sam.Repository;

import com.portfolio.sam.Entity.skills;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RSkills extends JpaRepository<skills, Integer> {
    Optional<skills> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
