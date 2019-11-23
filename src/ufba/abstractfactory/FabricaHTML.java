package ufba.abstractfactory;

import ufba.elementos.*;
import ufba.elementos.html.*;

public class FabricaHTML extends FabricaDocumentacao{
	public FabricaHTML() {
	
	}
	 
    public Cabecalho criarCabecalho() {
        return new CabecalhoHTML();
    }

    public Corpo criarCorpo() {
        return new CorpoHTML();
    }

    public Rodape criarRodape() {
        return new RodapeHTML();
    }
}
