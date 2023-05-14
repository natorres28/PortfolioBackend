package com.portfolio.ntorres.Servicio;


import com.portfolio.ntorres.Entidad.Hard;
import com.portfolio.ntorres.Interface.IntHardServicio;
import com.portfolio.ntorres.Repositorio.IntHardRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class ImplementacionHardServicio  implements IntHardServicio{
    //quiero traer el repositorio
    //con la siguiente anotation le inyecto dependencias
    @Autowired IntHardRepositorio inthardrepositorio;

    @Override
    public List<Hard> getHard() {
        List<Hard> habilidad = inthardrepositorio.findAll();
        return habilidad;
    }

    @Override
    public void saveHard(Hard habilidad) {
        inthardrepositorio.save(habilidad);
    }

    @Override
    public void deleteHard(Long id) {
        inthardrepositorio.deleteById(id);
    }

    @Override
    public Hard findHard(Long id) {
        Hard habilidad = inthardrepositorio.findById(id).orElse(null);
        return habilidad;
    }
}
