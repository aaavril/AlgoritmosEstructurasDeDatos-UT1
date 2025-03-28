
package com.ucu.ut1.tp2;
import java.util.*;

public class Biblioteca {
    private ArrayList<Libro> librosDisponibles;

    public Biblioteca() { 
        librosDisponibles = new ArrayList<>(); 
    }

    public void agregarLibro(Libro libro) {
        librosDisponibles.add(libro);
    }

    public boolean prestarLibro(Libro libro, Usuario usuario) {
        if (librosDisponibles.contains(libro) && libro.isDisponible() && (usuario.getCantidadLibros() <= 2) ){
            libro.setDisponible(false);
            usuario.agregarLibroPrestado(libro);
            Prestamo prestamo = new Prestamo();
            return true;
        }
        return false;
    }

    public void devolverLibro(Libro libro, Usuario usuario) {
        if (usuario.getLibrosPrestados().contains(libro)) {
            libro.setDisponible(true);
            usuario.eliminarLibroPrestado(libro);
        }
    }
}

