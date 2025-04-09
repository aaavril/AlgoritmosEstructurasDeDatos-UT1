package com.ucu.ut1.tp2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Usuario usuario = new Usuario("Juan", "Perez", "12345");
        
        Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry", 1943, true);
        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967, true);
        
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        
        System.out.println("Intentando prestar 'El Principito'...");
        boolean prestado = usuario.solicitarLibro(libro1, biblioteca);
        System.out.println("Préstamo exitoso: " + prestado);
        
        System.out.println("Intentando devolver 'El Principito'...");
        usuario.devolverLibro(libro1, biblioteca);
        System.out.println("Libro devuelto. Disponible: " + libro1.isDisponible());
    }
}