package com.portfolio.ntorres.Servicio;

import com.portfolio.ntorres.Entidad.Persona;
import com.portfolio.ntorres.Interface.IntPersonaServicio;
import com.portfolio.ntorres.Repositorio.IntPersonaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplementacionPersonaServicio  implements IntPersonaServicio{

    //quiero traer el repositorio
    //con la siguiente anotation le inyecto dependencias
    @Autowired IntPersonaRepositorio intpersonarepositorio;
    
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = intpersonarepositorio.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        intpersonarepositorio.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        intpersonarepositorio.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = intpersonarepositorio.findById(id).orElse(null);
        return persona;
    }
    
}
