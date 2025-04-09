package com.ucu.ut1.tp3;

public class Principal {
	public static void main (String args[]) {

		ContadorPalabras contador = new ContadorPalabras(); 
		System.out.print(contador.contarPalabras(""));
		System.out.print(contador.contarPalabras("   , "));
		System.out.print(contador.contarPalabras("  777 "));
		System.out.print(contador.contarPalabras("hola!! Como estás?"));
		System.out.print(contador.contarLetras("Holaaaaa  "));
		System.out.print(contador.contarLetras("Buen día !"));
		System.out.print(contador.contarVocales("   , "));
		System.out.print(contador.contarVocales(" rrrr"));
		System.out.print(contador.contarVocales(" lam"));
		System.out.print(contador.contarConsonantes(" lam"));
		

        String[] lineas = contador.obtenerLineas("texto.txt");
        System.out.println("Líneas leídas del archivo:");
        for (String linea : lineas) {
            System.out.println(linea);
        }

        int totalPalabras = contador.cantPalabras(lineas);

        System.out.println("Cantidad total de palabras: " + totalPalabras);
	}
	
}
