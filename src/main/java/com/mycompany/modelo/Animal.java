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
    private static String nombre;
    private static String orden;
    private static String clase;
    private static String genero;

    public Animal(String nombre, String orden, String clase, String genero) {
        Animal.nombre = nombre;
        Animal.orden = orden;
        Animal.clase = clase;
        Animal.genero = genero;
    } 

    public String getNombre() {
        return Animal.nombre;
    }
    

   public void hacerSonido() {
    System.out.println("Sonido genérico");
   }
     
  public static void reino(){
      System.out.println("-- Animal inicializado --");
      System.out.println("[ Descripción animal ]");
      System.out.println("Reion: "+ reino);
      System.out.println("Nombre: " + Animal.nombre);
      System.out.println("Orden: " + Animal.orden);
      System.out.println("Clase: " + Animal.clase);
      System.out.println("Genero: " + Animal.genero);
  }
      
  public void comer() {
    System.out.println(nombre + " está comiendo");
  }
  
  public void comer(String alimento) {
    System.out.println(nombre + " come " + alimento);
  }  
  
}
