package abstractfactory;

public class QtWidgetFactory extends WidgetFactory{
	public Botao criarBotao(){
		return new BotaoQt();
	}
	
	public Janela criarJanela(){
		return new JanelaQt();		
	}
}
