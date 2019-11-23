package ufba.abstractfactory;

import ufba.elementos.*;
import ufba.elementos.latex.*;

public class FabricaLatex extends FabricaDocumentacao{
	public FabricaLatex() {
	
	}
	 
    public Cabecalho criarCabecalho() {
        return new CabecalhoLatex();
    }

    public Corpo criarCorpo() {
        return new CorpoLatex();
    }

    public Rodape criarRodape() {
        return new RodapeLatex();
    }
}
