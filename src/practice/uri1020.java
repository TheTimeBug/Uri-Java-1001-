package practice;
import java.util.Scanner;
public class uri1020 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int dayin= input.nextInt();
		input.close();
		
		int year=0,month=0,day=0;
		
		if(dayin>365) {
			year = dayin/365;
			dayin = dayin%365;
		}
		 if(dayin>=30) {
			month = dayin/30;
			dayin = dayin%30;
		}
		 day =dayin;
		
		System.out.println(year+" ano(s)");
		System.out.println(month+" mes(es)");
		System.out.println(day+" dia(s)");
		


	}

}
