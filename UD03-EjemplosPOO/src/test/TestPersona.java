package test;

import tipos.Persona;
import tipos.Sexo;

public class TestPersona {

	public static void main(String[] args) {
		Persona p1 = new Persona("Christian", 21, 70.2, Sexo.HOMBRE);
		System.out.println(p1.getNombre());

	}

}
