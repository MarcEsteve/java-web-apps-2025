package com.akkodis.model;

import javax.validation.constraints.NotEmpty;

public class Usuario {
	@NotEmpty(message = "El nombre de usuario es obligatorio")
	private String name;
	@NotEmpty(message = "La contraseña es obligatoria")
    private String pass;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
    
    

}
