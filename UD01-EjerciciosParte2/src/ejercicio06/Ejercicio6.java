package ejercicio06;

public class Ejercicio6 {
//	Simula el lanzamiento de un dado. Genera mediante Math.random() un número
//	entero aleatorio comprendido entre 1 y 6, ambos incluidos. Recuerda que será
//	necesario realizar una conversión de tipo (cast).
	public static void main(String[] args) {
		Integer dado = (int)(Math.random()*6)+1;
		System.out.println("El resultado del dado es: "+dado);
	}

}
