package ufba.abstractfactory;

public class Main {

	 public static void main(String[] Args) {
	        FabricaDocumentacao fabricaHTML = new FabricaHTML();
	        CriadorDocumentacao criador = new CriadorDocumentacao(fabricaHTML) {
			};
	        
	        Inicio inicio = criador.gerarInicio();
	        Meio meio = criador.gerarMeio();
	        Fim fim = criador.gerarFim();
	        
	        System.out.println(inicio.getOutput());
	        System.out.println(meio.getOutput());
	        System.out.println(meio.getOutput());
	        
	        FabricaDocumentacao fabricaMarkdown = new FabricaMarkdown();
	        criador.setFactory(fabricaMarkdown);
	        
	        inicio = criador.gerarInicio();
	        meio = criador.gerarMeio();
	        fim = criador.gerarFim();
	        
	        System.out.println(inicio.getOutput());
	        System.out.println(meio.getOutput());
	        System.out.println(fim.getOutput());
	        
	        
	    }


}
