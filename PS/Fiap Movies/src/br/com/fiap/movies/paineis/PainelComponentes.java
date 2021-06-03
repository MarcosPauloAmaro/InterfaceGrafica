package br.com.fiap.movies.paineis;

import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.fiap.movies.componentes.StarRater;

public class PainelComponentes extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private PainelOndeAssitir ondeAssistir = new PainelOndeAssitir();
	private JCheckBox assitido = new JCheckBox("Abortar Missao");
	private StarRater avaliacao = new StarRater();
	
	public PainelComponentes() {
		setLayout(new GridLayout(4,1));
		init();
	}

	private void init() {
		add(getOndeAssistir());
		add(getAssitido());
		add(new JLabel("Porcentagem de Sucesso"));
		add(getAvaliacao());		
	}

	public PainelOndeAssitir getOndeAssistir() {
		return ondeAssistir;
	}

	public JCheckBox getAssitido() {
		return assitido;
	}

	public StarRater getAvaliacao() {
		return avaliacao;
	}

}
