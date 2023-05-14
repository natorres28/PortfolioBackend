package com.portfolio.ntorres.Interface;

import com.portfolio.ntorres.Entidad.Soft;
import java.util.List;

public interface IntSoftServicio {
    //metodos: para traer una lista de soft skills
    public List<Soft> getSoft();
    
    //guardar un objeto de tipo soft skill en la lista soft skills
    public void saveSoft(Soft habilidad);
    
    //eliminar un objeto -una soft skill - buscado por id
    public void deleteSoft(Long id);
    
    //buscar una soft skill
    public Soft findSoft(Long id);
    
    
}