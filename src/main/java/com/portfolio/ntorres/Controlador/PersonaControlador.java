package com.portfolio.ntorres.Controlador;

import com.portfolio.ntorres.Entidad.Persona;
import com.portfolio.ntorres.Servicio.ImplementacionPersonaServicio;
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
public class PersonaControlador {
    @Autowired ImplementacionPersonaServicio implementacionpersonaservicio;
    
    
    @GetMapping("/personas/traer")
    public List<Persona> getPersona(){
        return implementacionpersonaservicio.getPersona();
    }
        
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona){
        implementacionpersonaservicio.savePersona(persona);
        return "La persona fue creada correctamente";
    }
        
    @DeleteMapping("/personas/borrar/(id)")
    public String deletePersona(@PathVariable Long id){
        implementacionpersonaservicio.deletePersona(id);
        return "La persona fue borrada correctamente";
    }
    
    @PutMapping("/personas/editar/(id)")
    public Persona editPersona(@PathVariable Long id,
                               @RequestParam("nombre") String nuevoNombre,
                               @RequestParam("apellido") String nuevoApellido,
                               @RequestParam("puesto") String nuevoPuesto,
                               @RequestParam("acerca") String nuevoAcerca,
                               @RequestParam("img") String nuevoImg){
        Persona persona = implementacionpersonaservicio.findPersona(id);
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setPuesto(nuevoPuesto);
        persona.setAcerca(nuevoAcerca);
        persona.setImg(nuevoImg);
        
        implementacionpersonaservicio.savePersona(persona);
        return persona;
        
    }
    
    @GetMapping("personas/traer/perfil")
    public Persona findPersona(){
        return implementacionpersonaservicio.findPersona((long)1);
    }
    
    
}
