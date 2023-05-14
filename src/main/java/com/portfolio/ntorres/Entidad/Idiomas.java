package com.portfolio.ntorres.Entidad;

//primero necesitamos crear las tablas de las bd

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

//con la siguiente anotation le digo que es una entidad
@Getter @Setter
@Entity
public class Idiomas {
    
    //los siguientes son los campos que necesito en la bd
    //pero para armar la tabla necesitamos indicarle que el primer campo es una primary key, o sea el id:
    //al colocarle el generated van a ser autogenerados consecutivos cada registro, no tenemos que ponerle el numero 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Size(min = 1, max = 70, message = "no cumple con la longitud")
    private String idioma;
    
    @Size(min = 1, max = 5, message = "no cumple con la longitud")
    private String porcentajeidioma;
        
     
    
    
}