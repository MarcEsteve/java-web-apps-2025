package com.akkodis.model;

public class Contacto {
//	Atributos del formulario de contacto
	private String nombre;
	private String correo;
	private String mensaje;

//	Métodos getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}
