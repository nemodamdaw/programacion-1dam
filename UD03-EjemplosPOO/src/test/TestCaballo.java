package test;



import java.time.LocalDate;

import tipos.Caballo;
import tipos.Tipo;

public class TestCaballo {

	public static void main(String[] args) {
		Caballo c1 = new Caballo("Pepe", LocalDate.of(2006,4,14) , 23.5, Tipo.DOMESTICO);
		System.out.println(c1.getNombre());
		Integer x = c1.getEdad();
		System.out.println(x);
		System.out.println(c1);
		System.out.println(c1.toString());
		System.out.println(c1.mostrarTodo());
	}

}
