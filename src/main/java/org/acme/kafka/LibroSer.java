package org.acme.kafka;

import javax.json.bind.Jsonb;

import io.quarkus.kafka.client.serialization.JsonbSerializer;

public class LibroSer extends JsonbSerializer<Libro> {

	public LibroSer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LibroSer(Jsonb jsonb) {
		super(jsonb);
		// TODO Auto-generated constructor stub
	}

	
}
