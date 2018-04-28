package Observer;

public class TesteEstacaoMeteorologica {

	public static void main(String[] args) {
		
		ClimaDados climaDados = new ClimaDados();
		
		CondicoesAtuais condicoesAtuais = new CondicoesAtuais(climaDados);
		Estatisticas estaticas = new Estatisticas(climaDados);
			
		//Enviando os Dados
		climaDados.setMedidas(29,14,57);
		climaDados.notifyObserver();
	}

}
