package com.microservicio.rest.vo;

public class VOPedido {

	private String nombre;
	private String tipo_identificacion;
	private String identificacion;
	private String tipo_ropa;
	private int cantidad;
	private String fecha_hora_entrega;
	private String direccion_entrega;
	private double precio_total;
	private boolean valido;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo_identificacion() {
		return tipo_identificacion;
	}
	public void setTipo_identificacion(String tipo_identificacion) {
		this.tipo_identificacion = tipo_identificacion;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public String getTipo_ropa() {
		return tipo_ropa;
	}
	public void setTipo_ropa(String tipo_ropa) {
		this.tipo_ropa = tipo_ropa;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getFecha_hora_entrega() {
		return fecha_hora_entrega;
	}
	public void setFecha_hora_entrega(String fecha_hora_entrega) {
		this.fecha_hora_entrega = fecha_hora_entrega;
	}
	public String getDireccion_entrega() {
		return direccion_entrega;
	}
	public void setDireccion_entrega(String direccion_entrega) {
		this.direccion_entrega = direccion_entrega;
	}
	public double getPrecio_total() {
		return precio_total;
	}
	public void setPrecio_total(double precio_total) {
		this.precio_total = precio_total;
	}
	public boolean isValido() {
		return valido;
	}
	public void setValido(boolean valido) {
		this.valido = valido;
	}

	
	
}
