package com.portfolio.ntorres.Controlador;

import com.portfolio.ntorres.Entidad.Soft;
import com.portfolio.ntorres.Servicio.ImplementacionSoftServicio;
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
public class SoftControlador {
    @Autowired ImplementacionSoftServicio implementacionsoftservicio;
    
    
    @GetMapping("/habilsoft/traer")
    public List<Soft> getSoft(){
        return implementacionsoftservicio.getSoft();
    }
        
    @PostMapping("/habilsoft/crear")
    public String createSoft(@RequestBody Soft habilsoft){
        implementacionsoftservicio.saveSoft(habilsoft);
        return "La habilidad fue creada correctamente";
    }
        
    @DeleteMapping("/habilsoft/borrar/(id)")
    public String deleteSoft(@PathVariable Long id){
        implementacionsoftservicio.deleteSoft(id);
        return "La habilidad fue borrada correctamente";
    }
    
    @PutMapping("/habilsoft/editar/(id)")
    public Soft editSoft(@PathVariable Long id,
                               @RequestParam("habilsoft") String nuevoHabilsoft,
                               @RequestParam("porcentajesoft") String nuevoPorcentajesoft){
        Soft habilsoft = implementacionsoftservicio.findSoft(id);
        habilsoft.setHabilsoft(nuevoHabilsoft);
        habilsoft.setPorcentajesoft(nuevoPorcentajesoft);
              
        
        implementacionsoftservicio.saveSoft(habilsoft);
        return habilsoft;
        
    }
}

