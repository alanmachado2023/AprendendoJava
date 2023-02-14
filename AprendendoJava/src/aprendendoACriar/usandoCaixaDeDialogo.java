package aprendendoACriar;

import javax.swing.JOptionPane;

public class usandoCaixaDeDialogo {

	public static void main(String[] args) {
		
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas");
		
		double carrosNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carrosNumero / pessoaNumero);
		
		double resto =  carrosNumero % pessoaNumero;
		
		if (resto > 1 && divisao > 1) {
			JOptionPane.showMessageDialog(null,"Cada um receberá " + divisao + " carros e sobrará " + (int) resto + " carros");
		}
		else if (resto == 1 && divisao >1){
			JOptionPane.showMessageDialog(null,"Cada um receberá " + divisao + " carros e sobrará " + (int) resto + " carro");
		}
		else if (resto > 1 && divisao ==  1) {
			JOptionPane.showMessageDialog(null,"Cada um receberá " + divisao + " carro e sobrará " + (int) resto + " carros");
		}
		else {
			JOptionPane.showMessageDialog(null,"Cada um receberá " + divisao + " carro para cada e sobrará " + (int) resto + " carro");
		}
	}
}
