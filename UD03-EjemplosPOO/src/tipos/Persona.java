package tipos;

public class Persona {
	//atributos ( o campos) de la clase persona
	private String nombre;
	private Integer edad;
	private Double peso;
	private Sexo sexo;
	
	public Persona(String nombre, Integer edad, Double peso, Sexo sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.sexo = sexo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	
}
