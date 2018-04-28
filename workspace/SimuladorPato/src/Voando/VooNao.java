package Voando;

public class VooNao implements VooComportamento {

	@Override
	public void voar() {
		System.out.println("VooNao");
		
	}
	
	@Override
	public void voarComFoguete() {
		System.out.println("Para o Alto e Avanteeeeeeee!");
		
	}

}
