package br.com.fiap.movies;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import br.com.fiap.movies.paineis.PainelCadastro;
import br.com.fiap.movies.paineis.PainelLista;

public class App extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JTabbedPane abas = new JTabbedPane();
	private PainelLista painelLista  = new PainelLista();
	private PainelCadastro painelCadastro = new PainelCadastro();
	
	public static void main(String[] args) {
		App app = new App();
		app.init();
	}

	private void init() {
		abas.add("Cadastro", painelCadastro);
		abas.add("Lista", painelLista);
		
		add(abas);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 400);
		setVisible(true);
	}

}
