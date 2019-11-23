package ufba.abstractfactory;

public class FabricaMarkdown extends FabricaDocumentacao{
	 public FabricaMarkdown() {
	 }
	 
    public Inicio criarInicio() {
        return new InicioMarkdown();
    }

    public Meio criarMeio() {
        return new MeioMarkdown();
    }

    public Fim criarFim() {
        return new FimMarkdown();
    }
}