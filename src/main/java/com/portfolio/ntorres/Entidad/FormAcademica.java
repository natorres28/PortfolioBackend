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
public class FormAcademica {
    
    //los siguientes son los campos que necesito en la bd
    //pero para armar la tabla necesitamos indicarle que el primer campo es una primary key, o sea el id:
    //al colocarle el generated van a ser autogenerados consecutivos cada registro, no tenemos que ponerle el numero 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String estado;
    
    @Size(min = 1, max = 100, message = "no cumple con la longitud")
    private String titulo;
    
    @Size(min = 1, max = 100, message = "no cumple con la longitud")
    private String facultad;
    
    @Size(min = 1, max = 100, message = "no cumple con la longitud")
    private String institucion;
    
    @Size(min = 1, max = 100, message = "no cumple con la longitud")
    private String lugar;
    
      
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String fin;
    
    
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String img;
    
    
    
}