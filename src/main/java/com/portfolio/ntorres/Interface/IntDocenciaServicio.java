package com.portfolio.ntorres.Interface;

import com.portfolio.ntorres.Entidad.Docencia;
import java.util.List;

public interface IntDocenciaServicio {
    //metodos: para traer una lista de docencia
    public List<Docencia> getDocencia();
    
    //guardar un objeto de tipo docencia en la lista docencia
    public void saveDocencia(Docencia docencia);
    
    //eliminar un objeto -una docencia - buscado por id
    public void deleteDocencia(Long id);
    
    //buscar una docencia
    public Docencia findDocencia(Long id);
    
    
}
