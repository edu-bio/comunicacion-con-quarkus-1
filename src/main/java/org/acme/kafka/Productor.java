package org.acme.kafka;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("/libro")
public class Productor {

	@Inject @Channel("libros")
	Emitter<Libro> emitter;
	
	@GET
	@Path("/{titulo}")
	public void generar(@PathParam("titulo")String titulo) {
		Libro a = new Libro(titulo);
		//emitter.send("{\"nombre\":\"hola\"}");
		emitter.send(a);
	}
	
	public Libro nuevo(String titulo) {
		return new Libro(titulo);
	}
	
	
	//localhost:8181/libro
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String libro() {
		String mensaje = "INSTRUCCIONES: \n Introduce \"/<titulo del libro>\" en el navegador para que se imprima en la consola";
		return mensaje;
	}
}
