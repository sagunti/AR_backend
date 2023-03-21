/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.sam.Service;

import com.portfolio.sam.Entity.skills;
import com.portfolio.sam.Repository.RSkills;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class Sskills {
    @Autowired
    RSkills rskills;

    
    public List<skills> list(){
        return rskills.findAll();
    }
    public Optional<skills> getOne(int id){
        return rskills.findById(id);
    }
    public Optional<skills> getByNombre(String nombre){
        return rskills.findByNombre(nombre);
    }
    
    public void save(skills skill){
        rskills.save(skill);
    }
    public void delete(int id){
        rskills.deleteById(id);
    }
    public boolean existById(int id){
        return rskills.existsById(id);
    }
    public boolean existsByNombre(String nombre){
        return rskills.existsByNombre(nombre);
    }
}
