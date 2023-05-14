package com.portfolio.ntorres.Interface;

import com.portfolio.ntorres.Entidad.Persona;
import java.util.List;

public interface IntPersonaServicio {
    //metodos: para traer una lista de personas
    public List<Persona> getPersona();
    
    //guardar un objeto de tipo persona en la lista personas
    public void savePersona(Persona persona);
    
    //eliminar un objeto -un usuario - buscado por id
    public void deletePersona(Long id);
    
    //buscar una persona
    public Persona findPersona(Long id);
    
    
}
