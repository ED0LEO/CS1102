import javax.swing.JOptionPane;

public class parameters {
	//This function have formal parameters named numOne and numTwo.
	//In this specific program their values will be n1 and n2.
	static int CalcDifference(int numOne, int numTwo) {
		 return Math.abs(numOne - numTwo);
	}
	
	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Input first number:"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Input second number:"));
		
		//n1 and n2 are actual parameters for CalcDifference function
		int diff = CalcDifference(n1, n2);
		JOptionPane.showMessageDialog(null,"The difference is " + diff);
	}
	
}
