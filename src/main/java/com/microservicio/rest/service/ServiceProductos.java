package com.microservicio.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.microservicio.rest.vo.VOProducto;

@Path("/microservicioproductos")
public class ServiceProductos {

	@GET
	@Path("/obtenerproductos")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public VOProducto[] validarUsuario() {
		VOProducto[] productos = { 
				new VOProducto("Camisas formales", 75000), 
				new VOProducto("Pantalones formales", 105000), 
				new VOProducto("Chaquetas", 150000)
				};
		String cadena =
				"\n\n--------------------------------------------------------\n"+
				"Productos Solicitados\n"+
				"Cantidad de productos : "+ productos.length +"\n"+
				"--------------------------------------------------------\n";
		System.out.println(cadena);
		return productos;
	}

}
