package practice;
import java.util.Scanner; //used to take input form user
import java.text.DecimalFormat; //used as number formatter

public class uri1011 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in); //input class creator
		double pi = 3.14159;
		double area;
		double redius = input.nextDouble();
		input.close();
		
		double ar = (double)4/(double)3;  //type casting data
		area=ar*pi*redius*redius*redius;
		
		DecimalFormat formatter = new DecimalFormat("#0.000"); //formatting data acording output;
		System.out.println("VOLUME = " + formatter.format(area));
		
	}
}
