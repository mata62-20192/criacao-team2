package ufba.elementos.latex;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import ufba.elementos.Rodape;

public class RodapeLatex extends Rodape {

	@Override
	public String getOutput() {
		DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
		return df.format(getData());
	}

}
