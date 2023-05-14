package com.portfolio.ntorres.Repositorio;

import com.portfolio.ntorres.Entidad.Idiomas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntIdiomasRepositorio extends JpaRepository<Idiomas,Long> {
    
}