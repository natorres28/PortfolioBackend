package com.portfolio.ntorres.Repositorio;

import com.portfolio.ntorres.Entidad.FormAcademica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntFormAcademicaRepositorio extends JpaRepository<FormAcademica,Long> {
    
}