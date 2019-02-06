package com.usac.compi2.operaciones;

import com.usac.compi2.interfaces.Visitor;

public class Multiplicacion implements Nodo {

	private Nodo leftOperator;
	private Nodo rightOperator;

	public Multiplicacion(Nodo leftOperator, Nodo rightOperator) {
		this.leftOperator = leftOperator;
		this.rightOperator = rightOperator;
	}

	@Override
	public int accept(Visitor visitor) {
		return visitor.visit(this);

	}

	public Nodo getLeftOperator() {
		return leftOperator;
	}

	public void setLeftOperator(Nodo leftOperator) {
		this.leftOperator = leftOperator;
	}

	public Nodo getRightOperator() {
		return rightOperator;
	}

	public void setRightOperator(Nodo rightOperator) {
		this.rightOperator = rightOperator;
	}

}
