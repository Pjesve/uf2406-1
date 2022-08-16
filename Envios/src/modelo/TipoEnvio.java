package modelo;

import java.util.Objects;

public class TipoEnvio {
	private String nombre;
	private String condiciones;
	
	
	public TipoEnvio() {
		super();
	}


	public TipoEnvio(String nombre, String condiciones) {
		super();
		this.nombre = nombre;
		this.condiciones = condiciones;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCondiciones() {
		return condiciones;
	}


	public void setCondiciones(String condiciones) {
		this.condiciones = condiciones;
	}


	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoEnvio other = (TipoEnvio) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	

	

	
}
