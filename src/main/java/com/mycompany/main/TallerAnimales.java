/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;
import com.mycompany.modelo.*;

/**
 *
 * @author Estudiante
 */
public class TallerAnimales {

    public static void main(String[] args) {
       Animal animalPerro = new Perro("Huesos", "Carnivoro", "Mamifero", "Canis");
       Animal animalGato = new Gato("Pelusa", "Carnivoro", "Mamifero", "Felis");
       
       animalGato.hacerSonido();
       animalPerro.hacerSonido();
        
    }
}
