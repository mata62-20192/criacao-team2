package ufba.elementos.latex;

import ufba.elementos.Corpo;

public class CorpoLatex extends Corpo {

	@Override
	public String getOutput() {
		return getTexto();
	}

}
