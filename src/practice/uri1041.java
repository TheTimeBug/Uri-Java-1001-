package practice;
import java.util.Scanner;
public class uri1041 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double  x,y;
		x=input.nextDouble();
		y=input.nextDouble();
		input.close();
		
		if(x==0 && y==0) {
			System.out.println("Origem");
		}else if(x==0 && (y>0 || y<0)) {
			System.out.println("Eixo Y");
		}else if(y==0 && (x>0 || x<0)) {
			System.out.println("Eixo X");
		}
		else if(x>0 && y>0) {
			System.out.println("Q1");
		}else if(x<0 && y>0) {
			System.out.println("Q2");
		}else if(x<0 && y<0) {
			System.out.println("Q3");
		}else if(x>0 && y<0) {
			System.out.println("Q4");
		}

	}

}
