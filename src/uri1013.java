package practice;

import java.util.Scanner; //used to take input form user
import java.text.DecimalFormat; //used as number formatter
import java.lang.Math; //import for java  math operation
public class uri1013 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //input class creator
		
		int a= input.nextInt();
		int b= input.nextInt();
		int c= input.nextInt();
		
		//finding greater within a and b 
		
		int ab = (a+b+Math.abs(a-b))/2;
		int abc = (ab+c+Math.abs(ab-c))/2;
		
		System.out.println(abc+" eh o maior");
	}

}
