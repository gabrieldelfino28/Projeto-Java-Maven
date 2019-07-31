package aula;

import javax.swing.JOptionPane;

public class App 
{
	public static int somar(int x, int y) {
		return x + y;
	}
	
	public static int subtrair(int x, int y) {
		return x - y;
	}
	
	public static int multiplicar(int x, int y) {
		return x * y;
	}
	
	public static int dividir(int x, int y) {
		return x / y;
	}
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º número"));
        JOptionPane.showMessageDialog(null, "Total da Soma: " + somar(a,b) + "\nTotal da Subtração: " + subtrair(a,b) + "\nTotal da Multiplicação: " + multiplicar(a,b) + "\nTotal da Divisão: " + dividir(a,b));
    }
}
