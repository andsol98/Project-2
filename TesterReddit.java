package helloWorld;
import java.util.Scanner;

public class TesterReddit {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	
		boolean done = true;
		System.out.println("Hi, I am a Bot! Want to find out what I can do?");
		System.out.println("I can help you analyze any post you want from the reddit files.");
		System.out.println("And load you with information for any of the 6,466 posts.");
		while (done)
		{
			System.out.println("Enter any word or phrase you want to search for?");
			String searchKeyWord = sc.nextLine();
			System.out.println("These are the posts containing the word/phrase you were looking for: ");
			redditReader myreader = new redditReader();
			myreader.getPostsReddit("redditPosts.txt",searchKeyWord);
			System.out.println("Do you want to analyze any of the following posts?");
			String ans = sc.next();
			if (ans.equalsIgnoreCase("yes"))
			{
				System.out.println("Which post number do you want more information on?");
				int postNumber = sc.nextInt();

				redditReader reader2 = new redditReader();
				reader2.getAuthorFile("redditAuthors.txt",postNumber);

				redditReader reader3 = new redditReader();
				reader3.getUpvotesFile("redditUpvotes.txt",postNumber);

				redditReader reader4 = new redditReader();
				reader4.getCommentsFile("redditComments.txt",postNumber);

				System.out.println("Want to search for another word/phrase?");
				String answ = sc.next();

				if (answ.equalsIgnoreCase("yes")) {
					searchKeyWord = sc.nextLine();
				}else if (answ.equalsIgnoreCase("no")){
					System.out.println("Hope I could keep up to your expectations!");
					System.out.println("Thank you for trying me out and I hope to see you again!");
					done = false;
				}
			}
			else if (ans.equalsIgnoreCase("no")){
				System.out.println("Want to search for another word/phrase?");
				String answ1 = sc.next();
				if (answ1.equalsIgnoreCase("yes")) {
					System.out.println("What is the word/phrase you want me to find?");
					searchKeyWord = sc.nextLine();
				}else if (answ1.equalsIgnoreCase("no")){
					System.out.println("Hope I could keep up to your expectations!");
					System.out.println("Thank you for trying me out and I hope to see you again!");
					done = false;
				}
			}
		}





	}
}








