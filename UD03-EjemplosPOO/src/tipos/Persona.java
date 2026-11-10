package tipos;

public class Persona {
	//atributos ( o campos) de la clase persona
	private String nombre;
	private Integer edad;
	private Double peso;
	private Sexo sexo;
	
	
	public Persona(String nombre, Integer edad, Double peso, Sexo sexo) {
		if (edad<0) {
			throw new IllegalArgumentException("Illooooo esa edad!!!!!");
		}
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.sexo = sexo;
	}

	//Métodos getters o observadores
	public String getNombre() {
		return nombre;
	}

	public Integer getEdad() {
			return edad;
		}
	
	public Double getPeso() {
		return peso;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	
	//Métodos setters o modificadores
	public void setEdad(Integer edad) {
		if (edad<0) {
			throw new IllegalArgumentException("Illooooo esa edad!!!!!");
		}
		this.edad = edad;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}


	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", sexo=" + sexo + "]";
	}
	
	
	
}
