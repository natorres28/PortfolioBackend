package com.portfolio.ntorres.Interface;

import com.portfolio.ntorres.Entidad.FormAcademica;
import java.util.List;

public interface IntFormAcademicaServicio {
    //metodos: para traer una lista de formacion academica
    public List<FormAcademica> getFormAcademica();
    
    //guardar un objeto de tipo formacion academica en la lista formaciones academicas
    public void saveFormAcademica(FormAcademica formacademica);
    
    //eliminar un objeto -una formacademica - buscado por id
    public void deleteFormAcademica(Long id);
    
    //buscar una formacademica
    public FormAcademica findFormAcademica(Long id);
    
    
}
