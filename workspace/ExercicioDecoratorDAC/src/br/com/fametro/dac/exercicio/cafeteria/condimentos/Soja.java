package br.com.fametro.dac.exercicio.cafeteria.condimentos;

import br.com.fametro.dac.exercicio.cafeteria.bebidas.Bebida;

public class Soja extends CondimentoDecorator {
	
	
	Bebida bebida;

	public Soja(Bebida bebida) {
		this.bebida = bebida;
	}

	public String getDescricao() {
		return bebida.getDescricao() + ", Soja";
	}

	public double custo() {
		return bebida.custo() + .60;
	}


}
