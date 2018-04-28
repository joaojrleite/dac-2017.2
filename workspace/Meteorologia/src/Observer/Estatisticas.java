package Observer;

public class Estatisticas implements Observer, ExibirElemento{

	private float temperatura;
	private float umidade;
	private float pressao;
	
	public Estatisticas(ClimaDados climaDados) {
		temperatura = 29;
		umidade = 14;
		pressao = 57;
	}
	
	public void exibir() {
		
	}
	
	public void update(float temp, float umid, float pressao) {
		temperatura = temp * umid;
		umidade = umid - pressao;
		exibir();
	
	}

}
