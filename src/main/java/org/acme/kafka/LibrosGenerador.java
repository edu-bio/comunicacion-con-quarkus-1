package org.acme.kafka;

import java.util.concurrent.TimeUnit;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.eclipse.microprofile.reactive.messaging.Outgoing;
import org.jboss.logging.Logger;

import io.reactivex.Flowable;


//@ApplicationScoped
//public class LibrosGenerador {
//
//	    private static final Logger LOG = Logger.getLogger(LibrosGenerador.class);
//
//	    private Integer index = 0;
//
//	    @Inject
//	    @Channel("libros")
//	    private String[] libro = {"El kraken de las profundidades", "El coloso de Rodas","El sabueso de Belzebú",
//	    		"El titán de Minas Morgul", "Ella-La-Araña se va de picnic", "El troll gigante de Gorgoroth", 
//	    		"Las tímidas aventuras del decapitador de unicornios"};	   
   
//	    @Outgoing("genera-libros")
//	    public Flowable<String> creaLibro() {
//	        return Flowable.interval(4000, TimeUnit.MILLISECONDS).map(tick -> {
//	            String nextLibro = libro[index];
//	            index += 1;
//	            if (index == libro.length) index = 0;
//	            LOG.info("Next word = " + nextLibro);
//	            return nextLibro;
//	        });
//	    }
	

//	private final String[] PALABRA1 = {"El"};
//	private final String[] PALABRA2 = {"Mago","Demonio","León","Vikingo","Kraken","Mastodonte","Titán","Coloso"};	
//	private final String[] PALABRA3 = {"de los Infiernos", "de las Profundidades", "del Averno", "de Belzebú","de Mordor","de las gélidas aguas","de Cristal"};
//	@Inject
//    @Channel("my-data-stream")
//	private String titulo;	
//	
//	@Outgoing("generated-libro")
//	//Invoco al generarTitulo() 10 veces, creando 10 titulos distintos
//	public void crearTitulos() {
//		for(int i=0; i<10; i++) {
//			generarTitulo();
//		}
//	}
//	
//	//Creo un titulo aleatorio
//	public String generarTitulo() {
//		
//			String[] palabras = new String[3];
//			palabras[1]=PALABRA1[1];
//			int aleatorio1 =(int) (Math.random()*PALABRA2.length);
//			palabras[2]=PALABRA2[aleatorio1];
//			int aleatorio2 =(int)(Math.random()*PALABRA3.length);
//			palabras[3]=PALABRA3[aleatorio2];
//			String tituloGenerado = Arrays.toString(palabras);
//			setTitulo(tituloGenerado);
//			return tituloGenerado;		
//		
//	}
//	
//	public void setTitulo(String titulo) {
//		this.titulo=titulo;
//	}
	
	
//}
