package org.acme.kafka;

import io.quarkus.kafka.client.serialization.JsonbDeserializer;

public class LibroDes extends JsonbDeserializer<Libro> {

	public LibroDes() {
		super(Libro.class);
		// TODO Auto-generated constructor stub
	}
}
