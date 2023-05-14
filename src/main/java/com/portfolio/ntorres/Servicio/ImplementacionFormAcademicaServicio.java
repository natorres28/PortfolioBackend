package com.portfolio.ntorres.Servicio;


import com.portfolio.ntorres.Entidad.FormAcademica;
import com.portfolio.ntorres.Interface.IntFormAcademicaServicio;
import com.portfolio.ntorres.Repositorio.IntFormAcademicaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class ImplementacionFormAcademicaServicio  implements IntFormAcademicaServicio {
    //quiero traer el repositorio
    //con la siguiente anotation le inyecto dependencias
    @Autowired IntFormAcademicaRepositorio intformacademicarepositorio;
    
    @Override
    public List<FormAcademica> getFormAcademica() {
        List<FormAcademica> formacademica = intformacademicarepositorio.findAll();
        return formacademica;
    }

    @Override
    public void saveFormAcademica(FormAcademica formacademica) {
        intformacademicarepositorio.save(formacademica);
    }

    @Override
    public void deleteFormAcademica(Long id) {
        intformacademicarepositorio.deleteById(id);
    }

    @Override
    public FormAcademica findFormAcademica(Long id) {
        FormAcademica formacademica = intformacademicarepositorio.findById(id).orElse(null);
        return formacademica;
    }
}    
