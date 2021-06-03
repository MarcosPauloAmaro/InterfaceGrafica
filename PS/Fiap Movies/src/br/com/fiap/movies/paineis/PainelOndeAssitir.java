package br.com.fiap.movies.paineis;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PainelOndeAssitir extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JRadioButton netflix = new JRadioButton("Favoraveis");
	private JRadioButton prime = new JRadioButton("Perigosas");
	private JRadioButton pirateBay = new JRadioButton("Ideais");
	
	private ButtonGroup grupo = new ButtonGroup();
	
	public PainelOndeAssitir() {
		setLayout(new GridLayout(4,1));
		init();
	}

	private void init() {
		getGrupo().add(netflix);
		getGrupo().add(prime);
		getGrupo().add(pirateBay);
		
		netflix.setActionCommand("Favoraveis");
		prime.setActionCommand("Perigosas");
		pirateBay.setActionCommand("Ideais");
		
		add(new JLabel("Condicoes de Pouso"));
		add(netflix);
		add(prime);
		add(pirateBay);
		
	}

	public ButtonGroup getGrupo() {
		return grupo;
	}

}
