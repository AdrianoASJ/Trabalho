import javax.swing.JOptionPane;

public class Timess {
	public void classificacao() {

		 String nome = JOptionPane.showInputDialog("Digite o Nome do Time");
		 String regiao = JOptionPane.showInputDialog("Digite a Região dos integrantes");
		 String posicao1 = JOptionPane.showInputDialog("Digite o nome do (Top Laner)");
		 String posicao2 = JOptionPane.showInputDialog("Digite o nome do (Jungler)");
		 String posicao3 = JOptionPane.showInputDialog("Digite o nome do (Mid Laner)");
		 String posicao4 = JOptionPane.showInputDialog("Digite o nome do (ADC)");
		 String posicao5 = JOptionPane.showInputDialog("Digite o nome do (Suporte)");
		 
		 
		 String Times = "NOME DO TIME: "+ nome + 
				"\n\nA REGIÃO: "+ regiao + 
				"\n\nTop Laner: "+ posicao1+
				"\n\nJungler: "+ posicao2+ 
				"\n\nMid Laner: "+ posicao3+ 
				"\n\nADC: "+ posicao4+ 
				"\n\nSuporte: "+ posicao5;
		
		JOptionPane.showMessageDialog(null, Times);
		System.exit(0);
		
	}
}
