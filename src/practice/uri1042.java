package practice;
import java.util.Scanner;
public class uri1042 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a,b,c;
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		input.close();
		
		int h1=a,h2=b,h3=c,temp=0;
		
		if(h1>=h2) {
		}else {
			temp=h1;
			h1=h2;
			h2=temp;
		}
		if(h1>=h3) {
		}else {
			temp=h1;
			h1=h3;
			h3=temp;
		}
		if(h2>=h3) {
		}else {
			temp=h2;
			h2=h3;
			h3=temp;
		}
		System.out.println(h3+"\n"+h2+"\n"+h1+"\n");
		System.out.println(a+"\n"+b+"\n"+c);

	}

}
