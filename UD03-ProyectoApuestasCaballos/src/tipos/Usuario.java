package tipos;

import java.time.LocalDate;

public class Usuario {
	private String nombre;
	private final String dni;
	private final LocalDate fechaNacimiento;
	private Double saldo;
	
	public Usuario(String nombre, String dni, LocalDate fechaNacimiento, Double saldo) {
		this.nombre = nombre;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String getDni() {
		return dni;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	
	
	
	
}
