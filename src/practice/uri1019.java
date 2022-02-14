package practice;
import java.util.Scanner; //used to take input form user
//import java.text.DecimalFormat; //used as number formatter
//import java.lang.Math; //import for java  math operation
public class uri1019 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int time= input.nextInt();
		input.close();
		
		int hour=0,minute=0;
		
		if(time>3600) {
			hour = time/3600;
			time = time%3600;
		}
		 if(time>60) {
			minute = time/60;
			time = time%60;
		}
		
		System.out.println(hour+":"+minute+":"+time);
		

	}

}
