package Cliente_DAC;

import Grasnar.GrasnoComportamento;
import Voando.VooComportamento;

public class Pato {

	Voando.VooComportamento vooComp;
	Grasnar.GrasnoComportamento grasnoComp;
	Voando.VooComFoguete vooFoguet;
	
	public void ComFoguete() {
		vooFoguet.voarComFoguete();
		System.out.println("Com foguete para o alto e Avanteeeeeeee");
	}
	
	public void realizarVoo(){
		vooComp.voar();
		System.out.println("Realizar Voo Pato");
	}
	
	public void realizarGrasno(){
		grasnoComp.grasnar();
		System.out.println("Realizar Grasno Pato");
	}
	
	public void nadar() {
		
	}
	
	public void exibir(){
		System.out.println("Pato... Quê Quê");
	}
	
	public VooComportamento getVooComp() {
		System.out.println("objeto VooComportamento");
		return vooComp;
	}
	
	public void setVooComp(Voando.VooComportamento vooComp) {
		this.vooComp = vooComp;
	}
	
	public GrasnoComportamento getGrasnoComp() {
		return grasnoComp;
	}
	
	public void setGrasnoComp(Grasnar.GrasnoComportamento grasnoComp) {
		this.grasnoComp = grasnoComp;
	}
}
