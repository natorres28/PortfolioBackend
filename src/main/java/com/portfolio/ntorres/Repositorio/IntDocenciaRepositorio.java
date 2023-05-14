package com.portfolio.ntorres.Repositorio;

import com.portfolio.ntorres.Entidad.Docencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntDocenciaRepositorio extends JpaRepository<Docencia,Long> {
    
}

