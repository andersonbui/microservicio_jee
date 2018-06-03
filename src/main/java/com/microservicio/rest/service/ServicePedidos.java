package com.microservicio.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.microservicio.rest.vo.VOPedido;

@Path("/microserviciopedido")
public class ServicePedidos {
	private int CANTIDAD_MAX = 5;

	@PUT
	@Path("/registrarPedido")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public VOPedido registrarPedido(VOPedido pedido) {
		String cadena =  "";
		if (pedido.getCantidad() <= CANTIDAD_MAX) {
			cadena =
					"\n\n--------------------------------------------------------\n"+
					"PEDIDO ACEPTADO\n"+
					"--------------------------------------------------------\n"+
					"Nombre Cliente: " + pedido.getNombre()+"\n"+
					"Tipo identificacion cliente: " + pedido.getTipo_identificacion()+"\n"+
					"Identificacion cliente: " + pedido.getIdentificacion()+"\n"+
					"Tipo de ropa: " + pedido.getTipo_ropa()+"\n"+
					"Cantidad de productos: " + pedido.getCantidad()+"\n"+
					"Fecha y hora de entrega: " + pedido.getFecha_hora_entrega()+"\n"+
					"Dirección de entrega: " + pedido.getDireccion_entrega();
			pedido.setValido(true);
		} else {
			cadena =
			"\n\n--------------------------------------------------------\n"+
			"PEDIDO RECHAZADO\n"+
			"Cantidad de productos mayor a 5: "+ pedido.getCantidad() +"\n"+
			"--------------------------------------------------------\n";
			pedido.setValido(false);
		}
		System.out.println(cadena);
		return pedido;
	}

}
