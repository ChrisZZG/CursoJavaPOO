/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Logica;

/**
 *
 * @author EQUIPO
 */
public class POO {

    public static void main(String[] args) {
        
       //Alumno Completo
       Alumno a1 = new Alumno(1, "Pepe", "Argento", 23);
       //Llamado a sus datos
       System.out.println("Alumno: " + a1.getNombre()+ " " + a1.getApellido() + " id: " + a1.getId());
       
       //Alumno Vacio
       Alumno a2 = new Alumno();
       //Asignacion de sus Datos
       a2.setId(2);
       a2.setNombre("Paola");
       a2.setApellido("Argento");
       a2.setEdad(15);
       //Llamado a sus datos
        System.out.println("El alumno de id: " + a2.getId() + " es: " + a2.getNombre() + " " + a2.getApellido());
        
    }
}
