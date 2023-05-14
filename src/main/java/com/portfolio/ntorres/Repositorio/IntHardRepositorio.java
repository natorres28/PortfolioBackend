package com.portfolio.ntorres.Repositorio;

import com.portfolio.ntorres.Entidad.Hard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntHardRepositorio extends JpaRepository<Hard,Long> {
    
}

