package br.com.fiap.movies.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.fiap.movies.model.Filme;
import br.com.fiap.movies.paineis.PainelCadastro;

public class BotaoListener implements ActionListener {
	
	private PainelCadastro cadastro;
	
	public BotaoListener(PainelCadastro cadastro) {
		this.cadastro = cadastro;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Filme filme = new Filme();
		filme.setTitulo(cadastro.getPainelCampos().getTitulo().getText());
		filme.setSinopse(cadastro.getPainelCampos().getSinopse().getText());
		filme.setGenero(String.valueOf(cadastro.getPainelCampos().getGenero().getSelectedItem()));
		filme.setOndeAssistir(cadastro.getPainelComponentes().getOndeAssistir().getGrupo().getSelection().getActionCommand());
		filme.setAssistido(cadastro.getPainelComponentes().getAssitido().isSelected());
		filme.setAvaliacao(cadastro.getPainelComponentes().getAvaliacao().getSelection() );
		
		System.out.println(filme);	
		
		
		
	}

	
}
