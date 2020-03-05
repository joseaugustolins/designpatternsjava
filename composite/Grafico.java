package composite;

public abstract class Grafico {
	
	public abstract void draw();
	public void add(Grafico g){
		System.out.println("Nao pode executar add");
	};
	public void remove(Grafico g){
		System.out.println("Nao pode executar remove");
	};
	public Grafico getChild(int i){
		System.out.println("Nao pode executar getchild");
		return null;
	};
	
	public String toString(){		
		return this.getClass().getName();
	}
}
