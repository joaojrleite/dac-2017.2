package Cliente_DAC;

import Cliente_DAC.Pato;
import Grasnar.Grasno;
import Voando.VooComAsas;

public class PatoMandarim extends Pato {

	Grasno grasnoComp = new Grasno();
	VooComAsas vooComp = new VooComAsas();
	
	public PatoMandarim(){
		grasnoComp.grasnar();
		vooComp.voar();
	}
	
	public void exibir(){
		super.exibir();
		System.out.println("Pato Mandarin: Qu·Qu· Qu·Qu·!!!");
		
	}
	
	public void realizarVoo(){
		System.out.println("Realizar Voo Pato Mandarim");
	}
	
	public void realizarGrasno(){
		System.out.println("Realizar Grasno Pato Mandarim");
	}

}
