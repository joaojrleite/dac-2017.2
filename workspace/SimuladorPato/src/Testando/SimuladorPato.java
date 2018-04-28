package Testando;

import Cliente_DAC.ModeloPato;
import Cliente_DAC.Pato;
import Cliente_DAC.PatoMandarim;
import Cliente_DAC.PatoSelvagem;

public class SimuladorPato {

    public static void main(String[] args) {
		
		Pato pato1 = new PatoSelvagem();
		pato1.exibir();
		pato1.realizarVoo();
		pato1.realizarGrasno();
				
		Pato pato2 = new PatoMandarim();
		pato2.exibir();
		pato2.getVooComp();
			
		Pato patoModelo = new ModeloPato();
		patoModelo.exibir();
		patoModelo.ComFoguete();
		
	}

}
