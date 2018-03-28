
import javax.swing.JOptionPane;

public class WarmUp {

	public static void main(String[] args) {
String Word = JOptionPane.showInputDialog("Name a word");
String Num = JOptionPane.showInputDialog("Say a number");

int num = Integer.parseInt(Num);

for (int i = 0; i < num; i++) {
	System.out.println(Word);
}
	}
}

