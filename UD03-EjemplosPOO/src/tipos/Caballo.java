package tipos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
//Hacer una clase Caballo con 5 propiedads:
//nombre de tipo cadena (consultable)
//fechaNacimiento de tipo LocalDate (consultable)
//velocidad de tipo Double (consultable y modificable)
//tipo de tipo enumerado (consultable y modificable)
//edad de tipo Integer (Consultable)
public class Caballo {
	//atributos o propiedades básicas del tipo (clase) Caballo
	private final String nombre;
	private final LocalDate fechaNacimiento;
	private Double velocidad;
	private Tipo tipo;
	
	//Constructor por parámetros
	public Caballo(String nombre, LocalDate fechaNacimiento, Double velocidad, Tipo tipo) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.velocidad = velocidad;
		this.tipo = tipo;
	}

	public Double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	//la edad es una propiedad derivada
	public Integer getEdad() {
		return (int)fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
	}
	//Representación como cadena.
	//Nombre del caballo y entre paréntesis la edad

	public String toString() {
		return nombre +"("+getEdad()+")";
	}
	
//	public String mostrarTodo() {
//		return nombre +"-"+fechaNacimiento+"-"+velocidad+"-"+tipo;
//	}
	public String mostrarTodo() {
		return nombre +"-"+ fechaNacimiento.format(DateTimeFormatter.ofPattern("d///M///yyyy")) +"-"+velocidad+"-"+tipo;
	}
}






