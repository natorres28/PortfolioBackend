package com.portfolio.ntorres.Interface;

import com.portfolio.ntorres.Entidad.Cursos;
import java.util.List;

public interface IntCursosServicio {
    //metodos: para traer una lista de cursos
    public List<Cursos> getCursos();
    
    //guardar un objeto de tipo curso en la lista cursos
    public void saveCursos(Cursos curso);
    
    //eliminar un objeto -un curso - buscado por id
    public void deleteCursos(Long id);
    
    //buscar un curso
    public Cursos findCursos(Long id);
    
    
}
