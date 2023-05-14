package com.portfolio.ntorres.Controlador;

import com.portfolio.ntorres.Entidad.FormAcademica;
import com.portfolio.ntorres.Servicio.ImplementacionFormAcademicaServicio;
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
public class FormAcademicaControlador {
    @Autowired ImplementacionFormAcademicaServicio implementacionformacademicaservicio;
    
    
    @GetMapping("/formacademica/traer")
    public List<FormAcademica> getFormAcademica(){
        return implementacionformacademicaservicio.getFormAcademica();
    }
        
    @PostMapping("/formacademica/crear")
    public String createFormAcademica(@RequestBody FormAcademica formacademica){
        implementacionformacademicaservicio.saveFormAcademica(formacademica);
        return "La formacion academica fue creada correctamente";
    }
        
    @DeleteMapping("/formacademica/borrar/(id)")
    public String deleteFormAcademica(@PathVariable Long id){
        implementacionformacademicaservicio.deleteFormAcademica(id);
        return "La formacion academica fue borrada correctamente";
    }
    
    @PutMapping("/formacademica/editar/(id)")
    public FormAcademica editFormAcademica(@PathVariable Long id,
                               @RequestParam("estado") String nuevoEstado,
                               @RequestParam("titulo") String nuevoTitulo,
                               @RequestParam("facultad") String nuevoFacultad,
                               @RequestParam("institucion") String nuevoInstitucion,
                               @RequestParam("lugar") String nuevoLugar,
                               @RequestParam("fin") String nuevoFin){
        FormAcademica formacademica = implementacionformacademicaservicio.findFormAcademica(id);
        formacademica.setEstado(nuevoEstado);
        formacademica.setTitulo(nuevoTitulo);
        formacademica.setFacultad(nuevoFacultad);
        formacademica.setInstitucion(nuevoInstitucion);
        formacademica.setLugar(nuevoLugar);
        formacademica.setFin(nuevoFin);
        
        
        implementacionformacademicaservicio.saveFormAcademica(formacademica);
        return formacademica;
        
    }
    
    
}
