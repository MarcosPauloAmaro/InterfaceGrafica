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



public class App {
	
	public static void main(String[] args) {
			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch (Exception e) {
				e.printStackTrace();
			}
		
			
			
		JFrame janela = new JFrame("Meu App");
		janela.setLayout(new FlowLayout());
		
		JPanel panel = new JPanel(new FlowLayout());
		
		
		
		JLabel Label = new MeuLabel("Bem Vindo");
		panel.add(Label);
		
		JTextField text = new JTextField();
		text.setPreferredSize(new Dimension(200, 30));
		text.setBorder(BorderFactory.criar());
		panel.add(text);
		
		JTextArea descricao = new JTextArea();
		descricao.setColumns(30);
		descricao.setRows(10);
		descricao.setBorder(BorderFactory.criar());		
		panel.add(descricao);
		
		JCheckBox CheckBox = new JCheckBox("Aceito os Termos");
		panel.add(CheckBox);
		
		janela.add(panel, BorderLayout.CENTER);
		janela.add(new JButton("Salvar"), BorderLayout.SOUTH);
		
		
		RadioGroup radioGroup = new RadioGroup(List.of("Boleto", "Cartao"));
		janela.add(radioGroup);
		
		janela.add(new RadioGroup(List.of("Residencial", "Comercial", "Celular")));
		
		String[] cidades = {"Sao Paulo", "Osasco", "Diadema"};
		janela.add(new JComboBox<String>(cidades));
		
		janela.add(new StarRater(5));
		
		janela.add(new JLabel(new ImageIcon("src/image.png")));
		
		
		
		
		janela.setSize(1500, 600);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		
	}

}