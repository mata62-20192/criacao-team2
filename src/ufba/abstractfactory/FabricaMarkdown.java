package ufba.abstractfactory;

import ufba.elementos.*;
import ufba.elementos.markdown.*;

public class FabricaMarkdown extends FabricaDocumentacao{
	public FabricaMarkdown() {
	
	}
	 
    public Cabecalho criarCabecalho() {
        return new CabecalhoMarkdown();
    }

    public Corpo criarCorpo() {
        return new CorpoMarkdown();
    }

    public Rodape criarRodape() {
        return new RodapeMarkdown();
    }
}