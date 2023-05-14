package com.portfolio.ntorres.Servicio;

import com.portfolio.ntorres.Entidad.Experiencia;
import com.portfolio.ntorres.Interface.IntExperienciaServicio;
import com.portfolio.ntorres.Repositorio.IntExperienciaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplementacionExperienciaServicio  implements IntExperienciaServicio{

    //quiero traer el repositorio
    //con la siguiente anotation le inyecto dependencias
    @Autowired IntExperienciaRepositorio intexperienciarepositorio;
    
    @Override
    public List<Experiencia> getExperiencia() {
        List<Experiencia> experiencia = intexperienciarepositorio.findAll();
        return experiencia;
    }

    @Override
    public void saveExperiencia(Experiencia experiencia) {
        intexperienciarepositorio.save(experiencia);
    }

    @Override
    public void deleteExperiencia(Long id) {
        intexperienciarepositorio.deleteById(id);
    }

    @Override
    public Experiencia findExperiencia(Long id) {
        Experiencia experiencia = intexperienciarepositorio.findById(id).orElse(null);
        return experiencia;
    }
    
}
