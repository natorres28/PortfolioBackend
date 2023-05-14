package com.portfolio.ntorres.Controlador;

import com.portfolio.ntorres.Entidad.Experiencia;
import com.portfolio.ntorres.Entidad.Persona;
import com.portfolio.ntorres.Servicio.ImplementacionExperienciaServicio;
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
public class ExperienciaControlador {
    @Autowired ImplementacionExperienciaServicio implementacionexperienciaservicio;
    
    
    @GetMapping("/experiencia/traer")
    public List<Experiencia> getPersona(){
        return implementacionexperienciaservicio.getExperiencia();
    }
        
    @PostMapping("/experiencia/crear")
    public String createExperiencia(@RequestBody Experiencia experiencia){
        implementacionexperienciaservicio.saveExperiencia(experiencia);
        return "La experiencia fue creada correctamente";
    }
        
    @DeleteMapping("/experiencia/borrar/(id)")
    public String deleteExperiencia(@PathVariable Long id){
        implementacionexperienciaservicio.deleteExperiencia(id);
        return "La experiencia fue borrada correctamente";
    }
    
    @PutMapping("/experiencia/editar/(id)")
    public Experiencia editExperiencia(@PathVariable Long id,
                               @RequestParam("empresa") String nuevoEmpresa,
                               @RequestParam("inicio") String nuevoInicio,
                               @RequestParam("fin") String nuevoFin,
                               @RequestParam("descripcion") String nuevoDescripcion){
        Experiencia experiencia = implementacionexperienciaservicio.findExperiencia(id);
        experiencia.setEmpresa(nuevoEmpresa);
        experiencia.setInicio(nuevoInicio);
        experiencia.setFin(nuevoFin);
        experiencia.setDescripcion(nuevoDescripcion);
        
        implementacionexperienciaservicio.saveExperiencia(experiencia);
        return experiencia;
        
    }
    
    @GetMapping("experiencia/traer/perfil")
    public Experiencia findExperiencia(){
        return implementacionexperienciaservicio.findExperiencia((long)1);
    }
    
}

