package test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import tipos.Caballo;
import tipos.Carrera;
import tipos.Raza;

public class UnDiaEnLasCarreras {

	public static void main(String[] args) {
		List<Caballo> lis = new ArrayList<Caballo>();
		lis.add(new Caballo("Ae353", "Pepito", Raza.ANDALUZ, 23.6));
		lis.add(new Caballo("ZX545", "Juanito", Raza.ARABE, 25.8));
		lis.add(new Caballo("NC667", "Antoñito", Raza.ANDALUZ, 21.2));
		Carrera carrera = new Carrera(LocalDateTime.now(), lis);
		
		System.out.println(carrera.caballoMasVeloz());
		System.out.println(carrera.caballoMasVeloz(Raza.ANDALUZ));

	}

}
