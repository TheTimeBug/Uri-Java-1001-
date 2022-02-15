package practice;
import java.util.Scanner;
public class uri1067 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.close();
		for(int i=1;i<=number;i+=2) {
			System.out.println(i);
		}

	}

}
