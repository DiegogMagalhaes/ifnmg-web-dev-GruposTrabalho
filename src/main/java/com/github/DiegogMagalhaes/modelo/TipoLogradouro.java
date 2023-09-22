package com.github.DiegogMagalhaes.modelo;

import javax.persistence.Entity;
import javax.persistence.Table;

public enum TipoLogradouro {
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
