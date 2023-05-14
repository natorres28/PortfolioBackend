package com.portfolio.ntorres.Servicio;


import com.portfolio.ntorres.Entidad.Cursos;
import com.portfolio.ntorres.Entidad.Docencia;
import com.portfolio.ntorres.Interface.IntDocenciaServicio;
import com.portfolio.ntorres.Repositorio.IntDocenciaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class ImplementacionDocenciaServicio  implements IntDocenciaServicio{
    //quiero traer el repositorio
    //con la siguiente anotation le inyecto dependencias
    @Autowired IntDocenciaRepositorio intdocenciarepositorio;
    
    
    @Override
    public List<Docencia> getDocencia() {
        List<Docencia> docencia = intdocenciarepositorio.findAll();
        return docencia;
    }

    @Override
    public void saveDocencia(Docencia docencia) {
        intdocenciarepositorio.save(docencia);
    }

    @Override
    public void deleteDocencia(Long id) {
        intdocenciarepositorio.deleteById(id);
    }

    @Override
    public Docencia findDocencia(Long id) {
        Docencia docencia = intdocenciarepositorio.findById(id).orElse(null);
        return docencia;
    }
    
}
