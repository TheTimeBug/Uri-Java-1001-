package practice;
import java.util.Scanner;
import java.text.DecimalFormat; 
public class uri1048 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double salary = input.nextDouble();
		int incriment=0;
		input.close();
		
		if(salary<=400) {
			incriment=15;
		}else if(salary<=800) {
			incriment=12;
		}else if(salary<=1200) {
			incriment=10;
		}else if(salary<=2000) {
			incriment=7;
		}else if(salary>2000) {
			incriment=4;
		}
		
		double new_salary = salary+((salary*incriment)/100);
		DecimalFormat formatter = new DecimalFormat("#0.00");
		System.out.println("Novo salario: "+formatter.format(new_salary));
		System.out.println("Reajuste ganho: "+formatter.format(new_salary-salary));
		System.out.println("Em percentual: "+incriment+" %");

	}

}
