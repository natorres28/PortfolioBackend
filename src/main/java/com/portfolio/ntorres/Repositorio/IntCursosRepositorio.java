package com.portfolio.ntorres.Repositorio;

import com.portfolio.ntorres.Entidad.Cursos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntCursosRepositorio extends JpaRepository<Cursos,Long> {
    
}
