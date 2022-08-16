package controladores;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	
	private FormularioEnvio fEnvio;
	private List <TipoEnvio> listapaquetes;
	
	public Principal() {
		fAlta = new FormularioEnvio();
		fEnvio.setControlador(this);
		
		fListado = new ListadoPaquetes();
		fListado.setControlador(this);
		
		ListaEnvios = new ArrayList<>();
		
		listaEnvio = new ArrayList<Envio> ();
		listaEnvio.add(new Envio("Paq10", "Antes de las 10 h"));
		listaEnvio.add(new Envio("Paq14", "Antes de las 14 h"));
		listaEnvio.add(new Envio("Paq24", "Al dia siguiente"));
		fAlta.SetListaEnvios(ListaEnvios);
	}
	public static void main (String[]args) {

	}
}	
