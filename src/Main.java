import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    JDialog.setDefaultLookAndFeelDecorated(false);
    Object[] selectionValues = { "Cadastrar novo usuario", "Cadastrar Novo Time",};
    String initialSelection = "Cadastrar novo usuario";
    Object selection = JOptionPane.showInputDialog(null, "\tJogos"
    		+ "\n\nESCOLHA UMA OPÇÃO ABAIXO:",
        "By:Adriano", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
    
    if(selection == "Cadastrar novo usuario"){
    	Cadastrar ca1 = new Cadastrar();
		ca1.cadastrando();
    }
    else if(selection =="Cadastrar Novo Time"){
    	Timess cp1 = new Timess();
		cp1.classificacao();
    }
  }
}
