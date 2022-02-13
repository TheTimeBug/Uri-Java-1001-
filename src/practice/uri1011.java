package practice;
import java.util.Scanner; 
import java.text.DecimalFormat;

public class uri1011 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		double pi = 3.14159;
		double area;
		double redius = input.nextDouble();
		double ar = (double)4/(double)3;
		area=ar*pi*redius*redius*redius;
		
		DecimalFormat formatter = new DecimalFormat("#0.000");
		System.out.println("VOLUME = " + formatter.format(area));
		
	}
}
