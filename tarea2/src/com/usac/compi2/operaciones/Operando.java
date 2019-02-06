package com.usac.compi2.operaciones;

import com.usac.compi2.interfaces.Visitor;

public class Operando implements Nodo {

	private int valor;

	public Operando(int valor) {
		this.valor = valor;
	}

	@Override
	public int accept(Visitor visitor) {

		return visitor.visit(this);
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

}
