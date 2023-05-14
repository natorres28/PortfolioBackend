package com.portfolio.ntorres.Servicio;


import com.portfolio.ntorres.Entidad.Cursos;
import com.portfolio.ntorres.Interface.IntCursosServicio;
import com.portfolio.ntorres.Repositorio.IntCursosRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class ImplementacionCursosServicio  implements IntCursosServicio{
    //quiero traer el repositorio
    //con la siguiente anotation le inyecto dependencias
    @Autowired IntCursosRepositorio intcursosrepositorio;
    
    @Override
    public List<Cursos> getCursos() {
        List<Cursos> curso = intcursosrepositorio.findAll();
        return curso;
    }

    @Override
    public void saveCursos(Cursos curso) {
        intcursosrepositorio.save(curso);
    }

    @Override
    public void deleteCursos(Long id) {
        intcursosrepositorio.deleteById(id);
    }

    @Override
    public Cursos findCursos(Long id) {
        Cursos curso = intcursosrepositorio.findById(id).orElse(null);
        return curso;
    }

}
