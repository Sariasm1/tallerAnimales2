/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author Estudiante
 */
public abstract class Animal {
    
    private static final String reino = "Animalia";
    private String nombre;
    private String orden;
    private String clase;
    private String genero;

    public Animal(String nombre, String orden, String clase, String genero) {
        this.nombre = nombre;
        this.orden = orden;
        this.clase = clase;
        this.genero = genero;
    } 

    public String getNombre() {
        return nombre;
    }
    

   public void hacerSonido() {
    System.out.println("Sonido genérico");
   }
     
  public static void reino(){
      System.out.println("Este animal es del reino " + reino);
  }
    
  public void comer() {
    System.out.println(nombre + " está comiendo");
  }
  
  public void comer(String alimento) {
    System.out.println(nombre + " come " + alimento);
  }  
  
}
