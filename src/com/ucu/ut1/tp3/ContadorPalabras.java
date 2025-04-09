package com.ucu.ut1.tp3;
import java.io.*;
import java.util.*;

public class ContadorPalabras 
{
	public int contarPalabras(String frase) 
	{
	    if (frase == null || frase.isEmpty()) 
	    {
	        return 0; 
	    }
	
	    int contador = 0;
	    boolean dentroDePalabra = false;
	    boolean tieneLetra = false; 
	
	    for (int i = 0; i < frase.length(); i++) 
	    {
	        char c = frase.charAt(i);
	
	        if (Character.isLetter(c) || Character.isDigit(c)) 
	        {
	            if (Character.isLetter(c)) 
	            {
	                tieneLetra = true; 
	            }
	            if (!dentroDePalabra) 
	            {
	                dentroDePalabra = true;
	            }
	        } 
	        
	        else 
	        {  
	            if (dentroDePalabra && tieneLetra) 
	            {
	                contador++; 
	            }
	            dentroDePalabra = false;
	            tieneLetra = false; 
	        }
	    }
	
	    if (dentroDePalabra && tieneLetra) 
	    {
	        contador++;
	    }
	
	    return contador;
	}
	
	public int contarLetras(String frase) 
	{
	    if (frase == null || frase.isEmpty()) 
	    {
	        return 0; 
	    }
	
	    int contador = 0;
	   
	    for (int i = 0; i < frase.length(); i++) 
	    {
	        char c = frase.charAt(i);
	
	        if (Character.isLetter(c))
	        {
	        	contador++;
	        }
	    }
	    return contador; 
	}
	
	public int contarVocales(String frase) 
	{
	    if (frase == null || frase.isEmpty()) 
	    {
	        return 0; 
	    }
	
	    int contador = 0;
	   
	    for (int i = 0; i < frase.length(); i++) 
	    {
	        char c = frase.charAt(i);
	
	        if (Character.isLetter(c))
	        {
	        	if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
	                contador++;
	            }
	        }
	    }
	    return contador;
	}
	
	public int contarConsonantes(String frase) 
	{
		int resultado = this.contarLetras(frase) - this.contarVocales(frase);
	    return resultado; 
	}
	
	public String[] obtenerLineas(String archivo) 
	{
      
        StringBuilder contenido = new StringBuilder();
        int cantidadLineas = 0;
        
        try {
        	FileReader fr = new FileReader(archivo);
        	BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) 
            {
                contenido.append(linea).append("\n");
                cantidadLineas++;
            }
            br.close();
        } 
        
        catch (IOException e) 
        {
            System.out.println("Error al leer el archivo " + archivo);
        }
        
        System.out.print(cantidadLineas);
        String[] Lineas = contenido.toString().split("\n");
        return Lineas;
    }

    public int cantPalabras(String[] lineasArchivo) 
    {
        int contadorPalabras = 0;
        
        for (String linea : lineasArchivo) 
        {
            String[] palabras = linea.split("\\s+");
            contadorPalabras += palabras.length;
        }
        
        return contadorPalabras;
    }


}

	