package ufba.factorymethod;

public class CriadorHtml extends CriadorDocumentacao{
	public Documento criaDocumento() {
		return new Html();
	}
}
