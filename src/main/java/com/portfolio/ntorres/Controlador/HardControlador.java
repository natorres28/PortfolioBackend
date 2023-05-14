package com.portfolio.ntorres.Controlador;

import com.portfolio.ntorres.Entidad.Hard;
import com.portfolio.ntorres.Servicio.ImplementacionHardServicio;
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
public class HardControlador {
    @Autowired ImplementacionHardServicio implementacionhardservicio;
    
    
    @GetMapping("/habilidad/traer")
    public List<Hard> getHard(){
        return implementacionhardservicio.getHard();
    }
        
    @PostMapping("/habilidad/crear")
    public String createHard(@RequestBody Hard habilidad){
        implementacionhardservicio.saveHard(habilidad);
        return "La habilidad fue creada correctamente";
    }
        
    @DeleteMapping("/habilidad/borrar/(id)")
    public String deleteHard(@PathVariable Long id){
        implementacionhardservicio.deleteHard(id);
        return "La habilidad fue borrada correctamente";
    }
    
    @PutMapping("/habilidad/editar/(id)")
    public Hard editHard(@PathVariable Long id,
                               @RequestParam("habilhard") String nuevoHabilhard,
                               
                               @RequestParam("porcentajehard") String nuevoPorcentajehard){
        Hard habilidad = implementacionhardservicio.findHard(id);
        habilidad.setHabilhard(nuevoHabilhard);
        
        habilidad.setPorcentajehard(nuevoPorcentajehard);
              
        
        implementacionhardservicio.saveHard(habilidad);
        return habilidad;
        
    }
}
