import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class Calculadora2 extends JFrame {
	
	public void init() {
		JTabbedPane abas = new JTabbedPane();
		
		JPanel panelCalculadora = new JPanel();
		JTextField textFieldNumero1 = new JTextField(10);
		JTextField textFieldNumero2 = new JTextField(10);
		JButton buttonCalcular = new JButton("Calcular Soma");
		 panelCalculadora.add(textFieldNumero1);
		 panelCalculadora.add(textFieldNumero2);
		 panelCalculadora.add(buttonCalcular);
		
		 
		 CalculadoraListener listener = new CalculadoraListener(textFieldNumero1, textFieldNumero2 );
		 buttonCalcular.addActionListener(listener);
		 textFieldNumero1.addMouseListener(listener);

		abas.add("Calculadora323", panelCalculadora);
		abas.add("Sobre", new JLabel("Desenvolvido na FIAP"));
		
		add(abas);
		
		
		
		
		
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	public static void main(String[] args) {
		new Calculadora().init();
	}

}
