package ufba.abstractfactory;

import ufba.elementos.*;

public class Main {

	 public static void main(String[] Args) {
	        FabricaDocumentacao fabricaHTML = new FabricaHTML();
	        CriadorDocumentacao criador = new CriadorDocumentacao(fabricaHTML) {
			};
	        
			Cabecalho cabecalho = criador.gerarCabecalho();
	        Corpo corpo = criador.gerarCorpo();
	        Rodape rodape = criador.gerarRodape();
        
	        System.out.println(cabecalho.getOutput());
	        System.out.println(corpo.getOutput());
	        System.out.println(rodape.getOutput());
	        
	        FabricaDocumentacao fabricaMarkdown = new FabricaMarkdown();
	        criador.setFactory(fabricaMarkdown);
	        
	        cabecalho = criador.gerarCabecalho();
	        corpo = criador.gerarCorpo();
	        rodape = criador.gerarRodape();
	        
	        System.out.println(cabecalho.getOutput());
	        System.out.println(corpo.getOutput());
	        System.out.println(rodape.getOutput());
	        
	        
	    
	        
	    }


}
