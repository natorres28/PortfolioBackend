package com.portfolio.ntorres.Controlador;

import com.portfolio.ntorres.Entidad.Cursos;
import com.portfolio.ntorres.Servicio.ImplementacionCursosServicio;
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
public class CursosControlador {
    @Autowired ImplementacionCursosServicio implementacioncursosservicio;
    
    
    @GetMapping("/cursos/traer")
    public List<Cursos> getCursos(){
        return implementacioncursosservicio.getCursos();
    }
        
    @PostMapping("/cursos/crear")
    public String createCursos(@RequestBody Cursos curso){
        implementacioncursosservicio.saveCursos(curso);
        return "El curso fue creado correctamente";
    }
        
    @DeleteMapping("/cursos/borrar/(id)")
    public String deleteCursos(@PathVariable Long id){
        implementacioncursosservicio.deleteCursos(id);
        return "El curso fue borrado correctamente";
    }
    
    @PutMapping("/cursos/editar/(id)")
    public Cursos editCursos(@PathVariable Long id,
                               @RequestParam("curso") String nuevoCurso,
                               @RequestParam("escuela") String nuevoEscuela,
                               @RequestParam("lugarcurso") String nuevoLugarcurso,
                               @RequestParam("fincurso") String nuevoFincurso){
        Cursos curso = implementacioncursosservicio.findCursos(id);
        curso.setCurso(nuevoCurso);
        curso.setEscuela(nuevoEscuela);
        curso.setLugarcurso(nuevoLugarcurso);
        curso.setFincurso(nuevoFincurso);
        
        
        implementacioncursosservicio.saveCursos(curso);
        return curso;
        
    }
}