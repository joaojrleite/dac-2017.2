package br.com.fametro.dac.exercicio.cafeteria.condimentos;

import br.com.fametro.dac.exercicio.cafeteria.bebidas.Bebida;

public class Leite extends CondimentoDecorator {

	Bebida bebida;

	public Leite(Bebida bebida) {
		this.bebida = bebida;
	}

	public String getDescricao() {
		return bebida.getDescricao() + ", Leite";
	}

	public double custo() {
		return bebida.custo() + .50;
	}
}
