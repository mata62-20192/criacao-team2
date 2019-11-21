package ufba.factorymethod;

public class CriadorMarkdown extends CriadorDocumentacao{
	public Documento criaDocumento() {
		return new Markdown();
	}
}