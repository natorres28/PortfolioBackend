package com.portfolio.ntorres.Interface;

import com.portfolio.ntorres.Entidad.Idiomas;
import com.portfolio.ntorres.Entidad.Soft;
import java.util.List;

public interface IntIdiomasServicio {
    //metodos: para traer una lista de idiomas
    public List<Idiomas> getIdiomas();
    
    //guardar un objeto de tipo idioma en la lista idiomas
    public void saveIdiomas(Idiomas idioma);
    
    //eliminar un objeto -un idioma - buscado por id
    public void deleteIdiomas(Long id);
    
    //buscar un idioma
    public Idiomas findIdiomas(Long id);
    
    
}
