package br.com.fiap.movies.paineis;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelLista extends JPanel {
	
	private static final long serialVersionUID = 1L;

	private JLabel lista = new JLabel("Lista de Missoes");
	
	public PainelLista() {
		add(lista);
	}

}
