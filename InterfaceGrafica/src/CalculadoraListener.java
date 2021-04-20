import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CalculadoraListener implements ActionListener, MouseListener {
	
	private JTextField txtNumero1;
	private JTextField txtNumero2;
	public CalculadoraListener(JTextField txtNumero1, JTextField txtNumero2) {
	this.txtNumero1 = txtNumero1;
	this.txtNumero2 = txtNumero2;
}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String numero1 = String.valueOf( txtNumero1.getText() );
		String numero2 = String.valueOf( txtNumero2.getText() );
		String soma = numero1 + numero2;
		
		
		JOptionPane.showMessageDialog(null, "Salvo com Sucesso : " + soma);
	
		System.out.println("Titulo: " + numero1);
		System.out.println("Sinopse: " + numero2);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
	txtNumero1.setBackground(Color.RED);
	}
	@Override
	public void mouseExited(MouseEvent e) {
	txtNumero1.setBackground(Color.WHITE);
		
	} 

}
