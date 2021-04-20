

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

public class Calculadora extends JFrame {
	
	public void init() {

JTabbedPane abas = new JTabbedPane();
		
		JPanel panelCalculadora = new JPanel();
			 
		
		abas.add("Cadastro", panelCalculadora);
		abas.add("Sobre", new JLabel("Desenvolvido na FIAP"));
		

		
		JLabel Label = new MeuLabel("Titulo");
		panelCalculadora.add(Label);
		
		JTextField text = new JTextField();
		text.setPreferredSize(new Dimension(200, 30));
		text.setBorder(BorderFactory.criar());
		panelCalculadora.add(text);
		
		JTextField text2 = new JTextField();
		text2.setPreferredSize(new Dimension(200, 30));
		text2.setBorder(BorderFactory.criar());
		
		System.out.println(text);
		System.out.println(text2);
		
		
		JLabel Label1 = new MeuLabel("Sinopse");
		panelCalculadora.add(Label1);
		
		panelCalculadora.add(text2);

		
		JLabel Label5 = new MeuLabel("Genero");
		panelCalculadora.add(Label5);
		
		 
		String[] cidades = {"Acao", "Terror", "Romance"};
	
		panelCalculadora.add(new JComboBox<String>(cidades));

		
		JLabel Labe4 = new MeuLabel("Onde Assistir");
		panelCalculadora.add(Labe4);
		
		

        JLabel Label2 = new MeuLabel("Avaliacao");		panelCalculadora.add(new RadioGroup(List.of("Netflix", "Prime", "ThePirateBay")));

		panelCalculadora.add(Label2);
        panelCalculadora.add(new StarRater(5));
		JButton buttonsalvar = new JButton("Salvar");
		

		
		 panelCalculadora.add(buttonsalvar);
	     panelCalculadora.add(new JButton("Cancelar"), BorderLayout.SOUTH);

		
		 panelCalculadora.add(new JLabel(new ImageIcon("src/image.jpg")));

		 
		
		 
		 CalculadoraListener listener = new CalculadoraListener(text,text2);
		 buttonsalvar.addActionListener(listener);
		
		
		add(abas);
		
		setSize(800, 700);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	public static void main(String[] args) {
		new Calculadora().init();
	}

}
