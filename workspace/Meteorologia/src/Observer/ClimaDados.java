package Observer;

import java.util.Observable;
import java.util.Observer;

import java.util.ArrayList;

public class ClimaDados implements Subject {

		private ArrayList observers;
		private float temperatura;
		private float umidade;
		private float pressao;
		
		public ClimaDados() {
			observers = new ArrayList();
        }	
		
		public void registerObserver(Observer o) {
			observers.add(o);
		}
		
		public void removeObserver(Observer o) {
			int i = observers.indexOf(o);
			if(i >= 0) {
				observers.remove(o);
			}
        }
		
		public void notifyObserver() {
			for (int i = 0; i < observers.size(); i++) {
				Observer obs = (Observer) observers.get(i);
				obs.update(temperatura, umidade, pressao);
			}
		}
		
		public void medidasAlteradas() {
			notifyObserver();
		}
		
		// Simulando Estação Metereorológica.
		public void setMedidas(float temp, float umid, float press) {
			temperatura = temp;
			umidade = umid;
			pressao = press;
		}	
	}
