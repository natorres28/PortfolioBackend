package com.portfolio.ntorres.Controlador;

import com.portfolio.ntorres.Entidad.Idiomas;
import com.portfolio.ntorres.Servicio.ImplementacionIdiomasServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class IdiomasControlador {
    @Autowired ImplementacionIdiomasServicio implementacionidiomasservicio;
    
    
    @GetMapping("/idioma/traer")
    public List<Idiomas> getIdiomas(){
        return implementacionidiomasservicio.getIdiomas();
    }
        
    @PostMapping("/idioma/crear")
    public String createIdiomas(@RequestBody Idiomas idioma){
        implementacionidiomasservicio.saveIdiomas(idioma);
        return "El idioma fue creado correctamente";
    }
        
    @DeleteMapping("/idioma/borrar/(id)")
    public String deleteIdiomas(@PathVariable Long id){
        implementacionidiomasservicio.deleteIdiomas(id);
        return "El idioma fue borrado correctamente";
    }
    
    @PutMapping("/idioma/editar/(id)")
    public Idiomas editIdiomas(@PathVariable Long id,
                               @RequestParam("idioma") String nuevoIdioma,
                               @RequestParam("porcentajeidioma") String nuevoPorcentajeidioma){
        Idiomas idioma = implementacionidiomasservicio.findIdiomas(id);
        idioma.setIdioma(nuevoIdioma);
        idioma.setPorcentajeidioma(nuevoPorcentajeidioma);
              
        
        implementacionidiomasservicio.saveIdiomas(idioma);
        return idioma;
        
    }
}
