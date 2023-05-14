package com.portfolio.ntorres.Interface;

import com.portfolio.ntorres.Entidad.Hard;
import java.util.List;

public interface IntHardServicio {
    //metodos: para traer una lista de hard skills
    public List<Hard> getHard();
    
    //guardar un objeto de tipo hard skill en la lista hard skills
    public void saveHard(Hard habilidad);
    
    //eliminar un objeto -una hard skill - buscado por id
    public void deleteHard(Long id);
    
    //buscar una hard skill
    public Hard findHard(Long id);
    
    
}