package com.portfolio.ntorres.Interface;

import com.portfolio.ntorres.Entidad.Experiencia;
import java.util.List;

public interface IntExperienciaServicio {
    //metodos: para traer una lista de experiencias
    public List<Experiencia> getExperiencia();
    
    //guardar un objeto de tipo experiencia en la lista experiencias
    public void saveExperiencia(Experiencia experiencia);
    
    //eliminar un objeto -una experiencia - buscado por id
    public void deleteExperiencia(Long id);
    
    //buscar una experiencia
    public Experiencia findExperiencia(Long id);
    
    
}