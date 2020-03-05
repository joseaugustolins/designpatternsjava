package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
	private List<Observer> listaNofificados = new  ArrayList<Observer>();
	
	
	public List<Observer> getListaNofificados() {
		return listaNofificados;
	}
	public void setListaNofificados(List<Observer> listaNofificados) {
		this.listaNofificados = listaNofificados;
	}
	public abstract void registar(Observer o);
	public abstract void retirarRegistro(Observer o);
	public void notificar(String motivo){
		for(Observer o : listaNofificados){
			o.onAlunoRemovido(motivo);
		}
	}
	
	
}
