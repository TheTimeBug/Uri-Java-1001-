package practice;
import java.util.Scanner;
import java.text.DecimalFormat; 
public class uri1012 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a,b,c,TRIANGULO,CIRCULO,TRAPEZIO,QUADRADO,RETANGULO;
		double pi=3.14159;
		a= input.nextDouble();
		b= input.nextDouble();
		c= input.nextDouble();
		input.close();
		TRIANGULO=(double)0.5*a*c;
		CIRCULO=pi*(c*c);
		TRAPEZIO=((a+b)/2)*c;
		QUADRADO=b*b;
		RETANGULO=a*b;
		
		DecimalFormat formatter = new DecimalFormat("#0.000");
		System.out.println("TRIANGULO: "+formatter.format(TRIANGULO));
		System.out.println("CIRCULO: "+formatter.format(CIRCULO));
		System.out.println("TRAPEZIO: "+formatter.format(TRAPEZIO));
		System.out.println("QUADRADO: "+formatter.format(QUADRADO));
		System.out.println("RETANGULO: "+formatter.format(RETANGULO));
		
	}

}
