package abstractfactory;

public abstract class WidgetFactory {
	public static WidgetFactory obterFactory(ConfiguracaoDesejada configuracaoDesejada){
		
		if(configuracaoDesejada == ConfiguracaoDesejada.MotifWidget){
			return new MotifWidgetFactory();
		}else{
			return new QtWidgetFactory();
		}		
	}
	
	public abstract Botao criarBotao();
	
	public abstract Janela criarJanela();
	
}