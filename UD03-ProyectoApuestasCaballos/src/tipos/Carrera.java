package tipos;

import java.time.LocalDateTime;
import java.util.List;

public class Carrera {
	private LocalDateTime fechaCarrera;
	private List<Caballo> caballos;
	
	public Carrera(LocalDateTime fechaCarrera, List<Caballo> caballos) {
		this.fechaCarrera = fechaCarrera;
		this.caballos = caballos;
	}

	public LocalDateTime getFechaCarrera() {
		return fechaCarrera;
	}

	public void setFechaCarrera(LocalDateTime fechaCarrera) {
		this.fechaCarrera = fechaCarrera;
	}

	public List<Caballo> getCaballos() {
		return caballos;
	}

	public void setCaballos(List<Caballo> caballos) {
		this.caballos = caballos;
	}

	@Override
	public String toString() {
		return "Carrera [fechaCarrera=" + fechaCarrera + ", caballos=" + caballos + "]";
	}
	
	//metodo que devuelve el caballo mas veloz de la carrera
	public Caballo caballoMasVeloz() {
		Caballo res=null;
		for (Caballo c : caballos) {
			if (res==null || c.getVelocidad()>res.getVelocidad()) {
				res=c;
			}
		}
		return res;
	}
	//metodo que devuelve el caballo mas veloz de la carrera
	//de una determinada raza pasada como parametro
		public Caballo caballoMasVeloz(Raza r) {
			Caballo res=null;
			for (Caballo c : caballos) {
				if (c.getRaza().equals(r)) {
					if (res == null || c.getVelocidad() > res.getVelocidad()) {
						res = c;
					} 
				}
			}
			return res;
		}
	
	
	
	
	
	
	
	
	
	
}
