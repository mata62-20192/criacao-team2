package ufba.abstractfactory;

import java.util.Date;
import ufba.elementos.*;

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

    public Cabecalho gerarCabecalho() {
        Cabecalho cabecalho = this.fabrica.criarCabecalho();
        cabecalho.setTitulo("Padroes de projeto");
        cabecalho.setEmpresa("Universidade Federal da Bahia");
        return cabecalho;
    }

    public Corpo gerarCorpo() {
        Corpo corpo = this.fabrica.criarCorpo();
        corpo.setTexto("Aula de padroes de projeto na disciplina Engenharia de Software I.");
        return corpo;
    }

    public Rodape gerarRodape() {
        Rodape rodape = this.fabrica.criarRodape();
        rodape.setData(new Date());
        return rodape;
    }
	
}

	
