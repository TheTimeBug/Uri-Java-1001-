package practice;
import java.util.Scanner;
import java.lang.Math;
public class uri1044 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		input.close();
		
		if(a>b) {
			int temp = a;
			a=b;
			b=temp;
		}
		System.out.println(a +"  "+ b);
		if(b%a==0) {
			System.out.println("Sao Multiplos");
		}else {
			System.out.println("Nao sao Multiplos");
		}
		

	}

}
