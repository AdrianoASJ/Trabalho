import javax.swing.JOptionPane;

public class Cadastrar extends Usuario {
	String T1admin;
	String T1default;
	
	public void cadastrando() {
		
		Usuario u1 = new Usuario();
		
		u1.nome = JOptionPane.showInputDialog("Digite seu Nome");
		u1.time = JOptionPane.showInputDialog("Fun��o no Time");
		u1.regiao = JOptionPane.showInputDialog("Digite sua Regi�o");
		
		String tudo = "Seu Nome �: "+ u1.nome + "\nSua fun��o �: "+ u1.time+ 
				"\nSua Regi�o �: "+ u1.regiao + "\n\n Aperte Ok para abrir o Cadastro de Times e Integrantes!";
		
		JOptionPane.showMessageDialog(null, tudo);
		
		
		Timess c2 = new Timess();
		c2.classificacao();
	}
}