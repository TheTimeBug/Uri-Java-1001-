package practice;
import java.util.Scanner;
public class uri1052 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number  =  input.nextInt();
		String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		input.close();
		System.out.println(monthNames[number-1]);

	}

}
