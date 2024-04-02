package Principal;
import javax.swing.JOptionPane;
import Model.Media;

public class Principal {

    public static void main(String[] args) {
        Media tril = new Media();
        tril.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Digite a sua primeira nota")));
        tril.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Digite a sua segunda nota")));
        tril.setNota3(Double.parseDouble(JOptionPane.showInputDialog("Digite a sua terceira nota")));
        
        JOptionPane.showMessageDialog(null, "A media das suas notas é " + tril.getArea());
    }
}