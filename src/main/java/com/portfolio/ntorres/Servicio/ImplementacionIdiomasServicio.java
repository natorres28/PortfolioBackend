package com.portfolio.ntorres.Servicio;


import com.portfolio.ntorres.Entidad.Idiomas;
import com.portfolio.ntorres.Interface.IntIdiomasServicio;
import com.portfolio.ntorres.Repositorio.IntIdiomasRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class ImplementacionIdiomasServicio  implements IntIdiomasServicio{
    //quiero traer el repositorio
    //con la siguiente anotation le inyecto dependencias
    @Autowired IntIdiomasRepositorio intidiomasrepositorio;

    @Override
    public List<Idiomas> getIdiomas() {
        List<Idiomas> habilsoft = intidiomasrepositorio.findAll();
        return habilsoft;
    }

    @Override
    public void saveIdiomas(Idiomas idioma) {
        intidiomasrepositorio.save(idioma);
    }

    @Override
    public void deleteIdiomas(Long id) {
        intidiomasrepositorio.deleteById(id);
    }

    @Override
    public Idiomas findIdiomas(Long id) {
        Idiomas idioma = intidiomasrepositorio.findById(id).orElse(null);
        return idioma;
    }

     

    
}
