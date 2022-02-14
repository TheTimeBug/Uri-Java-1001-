package practice;
import java.util.Scanner; //used to take input form user
import java.text.DecimalFormat; //used as number formatter
import java.lang.Math; //import for java  math operation

public class uri1015 {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in); 
		
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		input.close();
		double x = Math.pow((x2-x1), 2);
		double y= Math.pow((y2-y1), 2);
		double point = Math.sqrt(x + y)  ;
		
		DecimalFormat formatter = new DecimalFormat("#0.0000"); //formatting data acording output;
		System.out.println(formatter.format(point));
	
	}

}
