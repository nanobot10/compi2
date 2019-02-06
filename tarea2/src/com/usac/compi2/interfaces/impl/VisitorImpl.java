package com.usac.compi2.interfaces.impl;

import com.usac.compi2.interfaces.Visitor;
import com.usac.compi2.operaciones.Multiplicacion;
import com.usac.compi2.operaciones.Operando;
import com.usac.compi2.operaciones.Suma;

public class VisitorImpl implements Visitor {

	@Override
	public int visit(Suma suma) {

		return suma.getLeftOperator().accept(this) + suma.getRightOperator().accept(this);
	}

	@Override
	public int visit(Multiplicacion multiplicacion) {

		return multiplicacion.getLeftOperator().accept(this) * multiplicacion.getRightOperator().accept(this);

	}

	@Override
	public int visit(Operando operando) {
		return operando.getValor();
	}

}
