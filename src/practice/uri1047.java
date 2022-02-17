package practice;
import java.util.Scanner;
public class uri1047 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int start_h,start_m,end_h,end_m,time_m;
		
		start_h=input.nextInt();
		start_m=input.nextInt();
		end_h=input.nextInt();
		end_m=input.nextInt();
		input.close();
		
		int start  =  (start_h*60)+start_m;
		int end  =  (end_h*60)+end_m;
		
		if(start==end) {
			
			time_m =1440;
		}
		else if(start>end) {
			time_m= (1440-start)+end;
			
		}else {
			time_m=end-start;
		}
		
		System.out.println("O JOGO DUROU "+time_m/60+" HORA(S) E "+time_m%60+" MINUTO(S)");

	}

}
