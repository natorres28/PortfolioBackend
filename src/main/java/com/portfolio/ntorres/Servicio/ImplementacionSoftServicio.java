package com.portfolio.ntorres.Servicio;


import com.portfolio.ntorres.Entidad.Soft;
import com.portfolio.ntorres.Interface.IntSoftServicio;
import com.portfolio.ntorres.Repositorio.IntSoftRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class ImplementacionSoftServicio  implements IntSoftServicio{
    //quiero traer el repositorio
    //con la siguiente anotation le inyecto dependencias
    @Autowired IntSoftRepositorio intsoftrepositorio;

    @Override
    public List<Soft> getSoft() {
        List<Soft> habilsoft = intsoftrepositorio.findAll();
        return habilsoft;
    }

    @Override
    public void saveSoft(Soft habilsoft) {
        intsoftrepositorio.save(habilsoft);
    }

    @Override
    public void deleteSoft(Long id) {
        intsoftrepositorio.deleteById(id);
    }

    @Override
    public Soft findSoft(Long id) {
       Soft habilsoft = intsoftrepositorio.findById(id).orElse(null);
        return habilsoft;
    }

    
}