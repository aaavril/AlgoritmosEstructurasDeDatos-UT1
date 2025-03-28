package com.ucu.ut1.tp2;
import java.util.*;

public class Libro 
{
	private String titulo;
    private String autor;
    private int anio;
    private boolean disponible;

    public Libro() {}

    public Libro(String titulo, String autor, int anio, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.disponible = disponible;
    }

    public String getTitulo(){ 
    	return this.titulo; 
    }
    
    public void setTitulo(String titulo) { 
    	this.titulo = titulo; 
    }
   
    public String getAutor() { 
    	return this.autor; 
    }
    
    public void setAutor(String autor) { 
    	this.autor = autor; 
    }
    
    public int getAnio() { 
    	return this.anio; 
    }
    
    public void setAnio(int anio) { 
    	this.anio = anio; 
    }
    
    public boolean isDisponible() { 
    	return this.disponible;
    }
    
    public void setDisponible(boolean disponible) { 
    	this.disponible = disponible; 
    }
  
}
	     

