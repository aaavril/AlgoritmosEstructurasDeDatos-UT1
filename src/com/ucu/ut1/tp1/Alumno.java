package com.ucu.ut1.tp1;

public class Alumno 
{
	private String nombre;
	private String apellido;
	private Integer cedula; 
	private String telefono;
	private Carrera carrera;
		
	
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

	public Integer getCedula() {
		return cedula;
	}

	public void setCedula(Integer cedula) {
		this.cedula = cedula;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}

	public Alumno(String nombre, String apellido, Integer cedula, String telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.telefono = telefono;
	}
	
	public static void main(String[] args) {
	     // Instanciación de las carreras
	     Carrera carrera1 = new Carrera("Desarrollador de Software", 15);
	     Alumno alumno1 = new Alumno("Avril", "Viega", 55988554, "096075098");
	     alumno1.setCarrera(new Carrera("Informática", 12));
	     
	     System.out.println("El alumno se llama: "+alumno1.getNombre());
	     System.out.println("El alumno tiene el apellido: "+alumno1.getApellido());
	     System.out.println("El alumno tiene la cédula: "+alumno1.getCedula());
	}

}
