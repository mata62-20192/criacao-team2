package ufba.abstractfactory;

public abstract class CriadorDocumentacao {
	private FabricaDocumentacao fabrica;
	
	public CriadorDocumentacao(FabricaDocumentacao fabrica) {
	    this.fabrica = fabrica;
	}

    public FabricaDocumentacao getFabrica() {
        return this.fabrica;
    }

    public void setFactory(FabricaDocumentacao fabrica) {
        this.fabrica = fabrica;
    }

    public Inicio gerarInicio() {
    	Inicio inicio = this.fabrica.criarInicio();
    	inicio.setTitulo();
    	inicio.setEmpresa();
        return inicio;
    }

    public Meio gerarMeio() {
    	Meio meio = this.fabrica.criarMeio();
    	meio.setTexto();
        return meio;
    }

    public Fim gerarFim() {
    	Fim fim = this.fabrica.criarFim();
    	fim.setData();
        return fim;
    }
	
}

	
