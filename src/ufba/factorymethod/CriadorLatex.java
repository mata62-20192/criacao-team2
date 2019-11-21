package ufba.factorymethod;

public class CriadorLatex extends CriadorDocumentacao{
	public Documento criaDocumento() {
		return new Latex();
	}
}
