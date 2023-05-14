package com.portfolio.ntorres.Controlador;

import com.portfolio.ntorres.Entidad.Docencia;
import com.portfolio.ntorres.Servicio.ImplementacionDocenciaServicio;
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
public class DocenciaControlador {
    @Autowired ImplementacionDocenciaServicio implementaciondocenciaservicio;
    
    
    @GetMapping("/docencia/traer")
    public List<Docencia> getDocencia(){
        return implementaciondocenciaservicio.getDocencia();
    }
        
    @PostMapping("/docencia/crear")
    public String createDocencia(@RequestBody Docencia docencia){
        implementaciondocenciaservicio.saveDocencia(docencia);
        return "La formación docente fue creada correctamente";
    }
        
    @DeleteMapping("/docencia/borrar/(id)")
    public String deleteDocencia(@PathVariable Long id){
        implementaciondocenciaservicio.deleteDocencia(id);
        return "La formación docente fue borrada correctamente";
    }
    
    @PutMapping("/docencia/editar/(id)")
    public Docencia editDocencia(@PathVariable Long id,
                               @RequestParam("catedra") String nuevoCatedra,
                               @RequestParam("nivel") String nuevoNivel,
                               @RequestParam("carrera") String nuevoCarrera,
                               @RequestParam("facultaddocencia") String nuevoFacultaddocencia,
                               @RequestParam("instituciondocencia") String nuevoInstituciondocencia,
                               @RequestParam("lugardocencia") String nuevoLugardocencia,
                               @RequestParam("iniciodocencia") String nuevoIniciodocencia,
                               @RequestParam("findocencia") String nuevoFindocencia){
       Docencia docencia = implementaciondocenciaservicio.findDocencia(id);
        docencia.setCatedra(nuevoCatedra);
        docencia.setNivel(nuevoNivel);
        docencia.setCarrera(nuevoCarrera);
        docencia.setFacultaddocencia(nuevoFacultaddocencia);
        docencia.setInstituciondocencia(nuevoInstituciondocencia);
        docencia.setLugardocencia(nuevoLugardocencia);
        docencia.setIniciodocencia(nuevoIniciodocencia);
        docencia.setFindocencia(nuevoFindocencia);
        
        
        implementaciondocenciaservicio.saveDocencia(docencia);
        return docencia;
        
    }
}
