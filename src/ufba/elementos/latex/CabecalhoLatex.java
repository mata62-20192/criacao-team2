package ufba.elementos.latex;

import ufba.elementos.Cabecalho;

public class CabecalhoLatex extends Cabecalho {

	@Override
	public String getOutput() {
		return  getTitulo() + getEmpresa();
	}
}
