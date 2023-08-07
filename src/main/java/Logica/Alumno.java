/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author EQUIPO
 */
public class Alumno {
    //Atributos del Alumno
    int id;
    String nombre;
    String apellido;
    int edad;

    
   //Metodo del tipo Procedimiento(no retornan un dato reutilizaba)
//    public void saludar(){
//        System.out.println("Hola, yo soy: " + nombre + ", y estoy Aprobado!");
//    }
//    
//    public void aprobado(int nota){
//        if(nota > 6){
//            saludar();
//        }else{
//            System.out.println("Hola, yo soy: " + nombre + ", y estoy Desaprobado!");
//        }
//    }   
   
    //Metodos Constructores
    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
