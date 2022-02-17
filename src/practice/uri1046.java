package practice;
import java.util.Scanner;
public class uri1046 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int start,end,time;
		
		start= input.nextInt();
		end= input.nextInt();
		
		if(start>end) {
			time = (24-start)+end;
		}else if(start==end) {
			time =24;
		}
		else {
			time = end-start;
		}
		System.out.println("O JOGO DUROU "+time+" HORA(S)");

	}

}
