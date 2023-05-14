package com.portfolio.ntorres.Repositorio;

import com.portfolio.ntorres.Entidad.Soft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntSoftRepositorio extends JpaRepository<Soft,Long> {
    
}

