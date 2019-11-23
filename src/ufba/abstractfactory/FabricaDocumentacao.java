package ufba.abstractfactory;

public abstract class FabricaDocumentacao {

	public FabricaDocumentacao() {}

    public abstract Inicio criarInicio();

    public abstract Meio criarMeio();

    public abstract Fim criarFim();

}
