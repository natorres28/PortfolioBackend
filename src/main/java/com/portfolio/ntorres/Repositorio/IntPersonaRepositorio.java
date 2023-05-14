package com.portfolio.ntorres.Repositorio;

import com.portfolio.ntorres.Entidad.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntPersonaRepositorio extends JpaRepository<Persona,Long> {
    
}
