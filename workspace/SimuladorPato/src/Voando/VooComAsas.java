package Voando;

public class VooComAsas implements VooComportamento {

	@Override
	public void voar() {
		System.out.print("Voando...");
	}
	
	@Override
	public void voarComFoguete() {
		System.out.println("Para o Alto e Avanteeeeeeee!");
	}

}
