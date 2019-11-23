package ufba.abstractfactory;

public class FabricaHTML extends FabricaDocumentacao{
	 public FabricaHTML() {
	 }
	 
    public Inicio criarInicio() {
        return new InicioHTML();
    }

    public Meio criarMeio() {
        return new MeioHTML();
    }

    public Fim criarFim() {
        return new FimHTML();
    }
}
