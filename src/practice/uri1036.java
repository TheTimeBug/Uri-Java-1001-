package practice;
import java.util.Scanner; //used to take input form user
import java.text.DecimalFormat; //used as number formatter
import java.lang.Math; //import for java  math operation
public class uri1036 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float a,b,c,root,r1 = 0,r2=0;
		a = input.nextFloat();
		b = input.nextFloat();
		c = input.nextFloat();
		input.close();
		
		root = (b*b)-(4*a*c);
		
		 if(root>0 && a!=0) {
			  r1 = (float) (-b +Math.sqrt(root))/(2*a);
			  r2 = (float) (-b -Math.sqrt(root))/(2*a);

			  DecimalFormat formatter = new DecimalFormat("#0.00000"); //formatting data acording output;
			System.out.println("R1 = "+formatter.format(r1));
			System.out.println("R2 = "+formatter.format(r2));
		 }else {
			 System.out.println("Impossivel calcular");
		 }
	}

}
