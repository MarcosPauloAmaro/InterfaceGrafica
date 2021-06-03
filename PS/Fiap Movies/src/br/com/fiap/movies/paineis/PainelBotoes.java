package br.com.fiap.movies.paineis;

import javax.swing.JButton;
import javax.swing.JPanel;

import br.com.fiap.movies.listeners.BotaoListener;

public class PainelBotoes extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JButton salvar = new JButton("Salvar");
	private JButton cancelar = new JButton("Cancelar");
	private PainelCadastro painel;
	
	public PainelBotoes(PainelCadastro painel) {
		this.painel = painel;
		init();
	}

	private void init() {
		add(salvar);
		add(cancelar);
		
		salvar.addActionListener(new BotaoListener(painel));
	}

}
