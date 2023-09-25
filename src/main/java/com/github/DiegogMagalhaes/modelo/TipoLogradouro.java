package com.github.DiegogMagalhaes.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

public enum TipoLogradouro implements Serializable{
	RUA(1),
	AVENIDA(2),
	PRACA(3),
	OUTRO(4);

	private final Integer valor;
	
	TipoLogradouro(Integer valor) {
		this.valor = valor;
	}
	
	public Integer getValor() {
		return this.valor;
	}
	
}
