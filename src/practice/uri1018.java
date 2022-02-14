package practice;
import java.util.Scanner; //used to take input form user
//import java.text.DecimalFormat; //used as number formatter
//import java.lang.Math; //import for java  math operation
public class uri1018 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int note100=0,note50=0,note20=0,note10=0,note5=0,note2=0,note1=0;
		int note = input.nextInt();
		input.close();
		int store_note= note;
		
		if(note>=100) {
			note100 = note/ 100;
			note = note -(note100*100);
		}
		if(note>=50) {
			note50 = note/50;
			note = note -(note50*50);
		}
		if(note>=20) {
			note20 = note/20;
			note = note -(note20*20);
			
		}
		if(note>=10) {
			note10 = note/10;
			note = note -(note10*10);
		}
		if(note>=5) {
			note5 = note/5;
			note = note -(note5*5);
		}
		if(note>=2) {
			note2 = note/2;
			note = note -(note2*2);
		}
		if(note>=1) {
			note1 = note/1;
			note = note -(note1*1);
		}
		
		System.out.println(store_note);
		System.out.println(note100+" nota(s) de R$ 100,00");
		System.out.println(note50+" nota(s) de R$ 50,00");
		System.out.println(note20+" nota(s) de R$ 20,00");
		System.out.println(note10+" nota(s) de R$ 10,00");
		System.out.println(note5+" nota(s) de R$ 5,00");
		System.out.println(note2+" nota(s) de R$ 2,00");
		System.out.println(note1+" nota(s) de R$ 1,00");
	}

}
