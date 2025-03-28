package com.ucu.ut1.tp2;

import java.util.*;

public class Prestamo {
    private Date fechaPrestamo;
    private Date fechaDevolucionEsperada;
    private Libro libro;
    private Usuario usuario;

    public Prestamo() {}

    public Prestamo(Date fechaPrestamo, Date fechaDevolucionEsperada, Libro libro, Usuario usuario) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucionEsperada = fechaDevolucionEsperada;
        this.libro = libro;
        this.usuario = usuario;
    }

    public Date getFechaPrestamo() { 
    	return this.fechaPrestamo; 
    }
    
    public void setFechaPrestamo(Date fechaPrestamo) { 
    	this.fechaPrestamo = fechaPrestamo; 
    }
    
    public Date getFechaDevolucionEsperada() { 
    	return this.fechaDevolucionEsperada;
    }
    
    public void setFechaDevolucionEsperada(Date fechaDevolucionEsperada) { 
    	this.fechaDevolucionEsperada = fechaDevolucionEsperada; 
    }
    
    public Libro getLibro() {
    	return this.libro; 
    }
    
    public void setLibro(Libro libro) { 
    	this.libro = libro; 
    }
    
    public Usuario getUsuario() { 
    	return this.usuario; 
    }
    
    public void setUsuario(Usuario usuario) {
    	this.usuario = usuario;
    }
}