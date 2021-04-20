import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;



public class Teste {
	
	public static void main(String[] args) {
			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch (Exception e) {
				e.printStackTrace();
			}
		
			
			
		JFrame janela = new JFrame("Nac");
		janela.setLayout(new FlowLayout());
		
		JPanel panel = new JPanel(new FlowLayout());
		
		janela.add(new JLabel(new ImageIcon("src/image.jpg")));

		
		JLabel Label = new MeuLabel("Titulo");
		panel.add(Label);
		
		
		
		JTextField text = new JTextField();
		text.setPreferredSize(new Dimension(200, 30));
		text.setBorder(BorderFactory.criar());
		panel.add(text);
		
		JLabel Label1 = new MeuLabel("Sinopse");
		panel.add(Label1);
		JTextArea descricao = new JTextArea();
		descricao.setColumns(30);
		descricao.setRows(2);
		descricao.setBorder(BorderFactory.criar());		
		panel.add(descricao);
		
		
JLabel Labe4 = new MeuLabel("Onde Assistir");
		
		
		
		JCheckBox CheckBox = new JCheckBox("Assistido");
		panel.add(CheckBox);
		
		JLabel Label5 = new MeuLabel("Genero");
		panel.add(Label5);
		
		String[] cidades = {"Acao", "Terror", "Romance"};
		
		
		janela.add(panel, BorderLayout.CENTER);
		

		
		
		
		
		panel.add(new JComboBox<String>(cidades));
		
		
		
		panel.add(Labe4);

        JLabel Label2 = new MeuLabel("Avaliacao");		panel.add(new RadioGroup(List.of("Netflix", "Prime", "ThePirateBay")));

		panel.add(Label2);
        panel.add(new StarRater(5));

        panel.add(new JButton("Salvar"), BorderLayout.SOUTH);
		panel.add(new JButton("Cancelar"), BorderLayout.SOUTH);
        
		janela.setSize(1500, 1500);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		
	}

}