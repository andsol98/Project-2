package helloWorld;
import java.util.*;

public class Scrap {

	public static void main(String[] args) {
		boolean ans = true;
		Scanner in = new Scanner(System.in);
		System.out.print("Start or end: ");
		String ans1 = in.next();
		while (true) {
			if (ans1.equalsIgnoreCase("yes")) {
				System.out.print("Still want to run: ");
				String answ2 = in.next();
				if (answ2.equalsIgnoreCase("yes")) {
					System.out.println("Hi");
				}else if (answ2.equalsIgnoreCase("no")) {
					ans = false;
				}
			}else if (ans1.equalsIgnoreCase("no")) {
				ans = false;
			}

		}
	}

}
