package br.com.fametro.dac.exercicio.cafeteria.principal;

import java.text.DecimalFormat;
import br.com.fametro.dac.exercicio.cafeteria.bebidas.Bebida;
import br.com.fametro.dac.exercicio.cafeteria.bebidas.Cappuccino;
import br.com.fametro.dac.exercicio.cafeteria.bebidas.Carioca;
import br.com.fametro.dac.exercicio.cafeteria.bebidas.Expresso;
import br.com.fametro.dac.exercicio.cafeteria.condimentos.Creme;
import br.com.fametro.dac.exercicio.cafeteria.condimentos.Leite;

public class CafeShop {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("#,###.00");

		Bebida expresso = new Expresso();
		System.out.println("\n" + expresso.getDescricao() + " R$ " + df.format(expresso.custo()));

		Bebida carioca = new Carioca();
		System.out.println("\n" + carioca.getDescricao() + " R$ " + df.format(carioca.custo()));

		Bebida cappucciono = new Cappuccino();
		System.out.println("\n" + cappucciono.getDescricao() + " R$ " + df.format(cappucciono.custo()));

		Bebida bebida2 = new Expresso();
		bebida2 = new Leite(bebida2);
		bebida2 = new Leite(bebida2);
		bebida2 = new Creme(bebida2);

		System.out.println("\n" + bebida2.getDescricao() + " R$ " + df.format(bebida2.custo()));

		Bebida bebida3 = new Carioca();
		bebida3 = new Leite(bebida3);
		bebida3 = new Creme(bebida3);
		bebida3 = new Creme(bebida3);

		System.out.println("\n" + bebida3.getDescricao() + " R$ " + df.format(bebida3.custo()));

		Bebida bebida4 = new Cappuccino();
		bebida4 = new Leite(bebida4);
		bebida4 = new Creme(bebida4);
		bebida4 = new Creme(bebida4);

		System.out.println("\n" + bebida4.getDescricao() + " R$ " + df.format(bebida4.custo()));

	}

}
