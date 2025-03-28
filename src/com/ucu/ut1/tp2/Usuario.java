package com.ucu.ut1.tp2;
import java.util.*;

public class Usuario {
    private String nombre;
    private String apellido;
    private String identificacion;
    private ArrayList<Libro> librosPrestados;
    private int cantidadLibros;

    public Usuario() {}

    public Usuario(String nombre, String apellido, String identificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.librosPrestados = new ArrayList<>();
    }

    public String getNombre() { 
    	return this.nombre; 
    }
    
    public void setNombre(String nombre) { 
    	this.nombre = nombre;
    }
    
    public String getApellido() { 
    	return this.apellido; 
    }
    
    public void setApellido(String apellido) { 
    	this.apellido = apellido; 
    }
    
    public String getIdentificacion() { 
    	return this.identificacion;
    }
    
    public void setIdentificacion(String identificacion) {
    	this.identificacion = identificacion; 
    }
    
    public ArrayList<Libro> getLibrosPrestados() { 
    	return this.librosPrestados;
    }

    public int getCantidadLibros() {
		return librosPrestados.size();
	}

	public void eliminarLibroPrestado(Libro libro) {
    	librosPrestados.remove(libro); 
    }
    
    public void agregarLibroPrestado(Libro libro) {
    	librosPrestados.add(libro); 
    }
    
    public boolean solicitarLibro(Libro libro, Biblioteca biblioteca) {
        return biblioteca.prestarLibro(libro, this);
    }

    public void devolverLibro(Libro libro, Biblioteca biblioteca) { 
    	biblioteca.devolverLibro(libro, this);
    }
}