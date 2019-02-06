package com.usac.compi2.interfaces;

import com.usac.compi2.operaciones.Multiplicacion;
import com.usac.compi2.operaciones.Operando;
import com.usac.compi2.operaciones.Suma;

public interface Visitor {

	int visit(Suma suma);
	int visit(Multiplicacion multiplicacion);
	int visit(Operando operando);
	
}
