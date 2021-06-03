package br.com.fiap.movies.paineis;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import br.com.fiap.movies.componentes.Poster;

public class PainelCadastro extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private Poster poster = new Poster();
	private PainelCampos painelCampos = new PainelCampos();
	private PainelComponentes painelComponentes = new PainelComponentes();
	private PainelBotoes painelBotoes = new PainelBotoes(this);
	
	public PainelCadastro() {
		setLayout(new BorderLayout());
		init();
	}

	private void init() {
		add(poster, BorderLayout.WEST);
		add(getPainelCampos(), BorderLayout.CENTER);
		add(getPainelComponentes(), BorderLayout.EAST);
		add(painelBotoes, BorderLayout.SOUTH);
	}

	public PainelCampos getPainelCampos() {
		return painelCampos;
	}

	public PainelComponentes getPainelComponentes() {
		return painelComponentes;
	}

}
