package com.ucu.ut1.tp1;

public class Carrera 
{
	 private int alumnos;
	 private String nombre;
	
	 // Constructor
	 public Carrera(String nombre, int alumnos) {
	     this.nombre = nombre;
	     this.alumnos = alumnos;
	 }
	 
	 public Carrera() {
	 }
	
	 // Getters y Setters
	 public int getAlumnos() {
	     return alumnos;
	 }
	
	 public void setAlumnos(int alumnos) {
	     this.alumnos = alumnos;
	 }
	
	 public String getNombre() {
	     return nombre;
	 }
	
	 public void setNombre(String nombre) {
	     this.nombre = nombre;
	 }
	
	 // Método características
	 public String caracteristicas() {
	     return "Carrera: " + nombre + " - Alumnos: " + alumnos;
	 }
	
	 // Método principal
	 public static void main(String[] args) {
	     // Instanciación de las carreras
	     Carrera carrera1 = new Carrera("Desarrollador de Software", 15);
	     Carrera carrera2 = new Carrera("Contador", 10);
	     Carrera carrera3 = new Carrera();
	     carrera3.setAlumnos(0);
	
	     // Suma de alumnos
	     int totalAlumnos = carrera1.getAlumnos() + carrera2.getAlumnos();
	     System.out.println("Total de alumnos: " + totalAlumnos);
	
	     // Llamada a método características
	     System.out.println(carrera1.caracteristicas());
	     System.out.println(carrera2.caracteristicas());
	
	     // Carrera con mayor cantidad de alumnos
	     if (carrera1.getAlumnos() > carrera2.getAlumnos()) {
	         System.out.println("La carrera con más alumnos es: " + carrera1.getNombre());
	     } else {
	         System.out.println("La carrera con más alumnos es: " + carrera2.getNombre());
	     }
 }
}
