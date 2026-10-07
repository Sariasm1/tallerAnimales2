/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author Estudiante
 */
public class Perro extends Animal {

     public Perro(String nombre, String orden, String clase, String genero) {
        super(nombre, orden, clase, genero);
        reino();
    }    
     
     
     
    @Override
    public void hacerSonido() {
      System.out.println(getNombre()+ " hace GUAU GUAU!");
    }
}