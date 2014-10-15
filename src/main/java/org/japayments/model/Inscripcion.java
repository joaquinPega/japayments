package org.japayments.model;

import java.util.Calendar;
/**
 * 
 * @author Joaquin Pega
 *
 */
public class Inscripcion {
	private Calendar date;
	private Alumno alumno;
	private Clase clase;
	
	public Inscripcion() {
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Clase getClase() {
		return clase;
	}

	public void setClase(Clase clase) {
		this.clase = clase;
	}
	
	
	
}
