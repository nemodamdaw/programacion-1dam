package tipos;

import java.time.LocalDate;

public class Usuario {
	private String nombre;
	private final String dni;
	private final LocalDate fechaNacimiento;
	private Double saldo;
	private Integer apuestasGanadas;
	private Integer apuestasPerdidas;

	


	public Usuario(String nombre, String dni, LocalDate fechaNacimiento, Double saldo) {
		this.nombre = nombre;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.saldo = saldo;
		apuestasGanadas=0;
		apuestasPerdidas=0;
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

	public Integer getApuestasGanadas() {
		return apuestasGanadas;
	}

	public void setApuestasGanadas(Integer apuestasGanadas) {
		this.apuestasGanadas = apuestasGanadas;
	}

	public Integer getApuestasPerdidas() {
		return apuestasPerdidas;
	}

	public void setApuestasPerdidas(Integer apuestasPerdidas) {
		this.apuestasPerdidas = apuestasPerdidas;
	}

	@Override
	public String toString() {
		return nombre + "(" + getSaldo() + ")";
	}

}
