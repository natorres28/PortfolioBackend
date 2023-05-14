package com.portfolio.ntorres.Repositorio;

import com.portfolio.ntorres.Entidad.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntExperienciaRepositorio extends JpaRepository<Experiencia,Long> {
    
}
