package ufba.abstractfactory;

import ufba.elementos.*;

public abstract class FabricaDocumentacao {

	public FabricaDocumentacao() {}

    public abstract Cabecalho criarCabecalho();

    public abstract Corpo criarCorpo();

    public abstract Rodape criarRodape();

}
