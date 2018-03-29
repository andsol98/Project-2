package helloWorld;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;
public class redditReader {

	String analyze;

	redditReader()
	{

		analyze = "";

	}	
	void getCommentsFile(String fileToRead, int lineNumber)
	{
		redditComments [] theDonaldComments = new redditComments[6466];

		if (lineNumber >= 0 && lineNumber <= 6466)
		{

			try
			{
				FileReader myFileReader = new FileReader(fileToRead);
				BufferedReader myBufferReader = new BufferedReader(myFileReader);
				String line = null;
				int counter = 0;
				while ((line=myBufferReader.readLine()) != null)
				{
					line = myBufferReader.readLine();
					theDonaldComments[counter] = new redditComments(line);
					counter += 1;	
				}

			}
			catch (Exception ex)
			{
				System.out.println("I can not find your file, can you try again with a different input please?");
			}

			System.out.println("The number of comments on this post are: " + theDonaldComments[lineNumber].comment);
		}

		else
		{
			System.out.println("Can you choose a line number between 0 and 6,466 as the number you choose is out of bound");
		}
	}

	void getPostsReddit(String readFile, String keyToFind)
	{
		redditPosts [] theDonaldPosts = new redditPosts[6466];

		try
		{
			FileReader myFileReader=new FileReader(readFile);
			BufferedReader myBufferReader= new BufferedReader(myFileReader);
			String line = null;
			int counter = 0;
			while ((line = myBufferReader.readLine())!=null)
			{
				line = myBufferReader.readLine();
				theDonaldPosts[counter]=new redditPosts(line);
				counter += 1;

				String lineToAnalyzeLowerCase=line.toLowerCase();

				if (lineToAnalyzeLowerCase.contains(keyToFind)) {

					System.out.println(counter + ": " +line);
				}					
			}		
		}
		catch (Exception ex)
		{
			System.out.println("I can not find your file, can you try again with a different input please?");
		}
	}

	void getUpvotesFile(String fileToRead, int lineNumber)
	{
		redditUpvotes [] theDonaldUpvotes=new redditUpvotes[6466];

		if (lineNumber >= 0 && lineNumber <= 6466)
		{
			try
			{
				FileReader myFileReader=new FileReader(fileToRead);
				BufferedReader myBufferReader= new BufferedReader(myFileReader);
				String line = null;
				int counter = 0;
				while ((line=myBufferReader.readLine()) != null)
				{
					line=myBufferReader.readLine();
					theDonaldUpvotes[counter] = new redditUpvotes(line);
					counter+=1;
				}				
			}
			catch (Exception ex)
			{
				System.out.println("Can you choose a line number between 0 and 6,466 as the number you choose is out of bound");
			}

			System.out.println("This post has a score of: " + theDonaldUpvotes[lineNumber].upVotes);
		}

		else
		{
			System.out.println("I can not find your file, can you try again with a different input please?");
		}
	}

	void getAuthorFile(String fileToRead, int lineNumber)
	{
		redditAuthor[] theDonaldAuthors = new redditAuthor[6466];

		if (lineNumber >= 0 && lineNumber <= 6466)
		{
			try
			{
				FileReader myFileReader = new FileReader(fileToRead);
				BufferedReader myBufferReader = new BufferedReader(myFileReader);
				String line = null;
				int counter = 0;
				while ((line = myBufferReader.readLine()) != null)
				{
					line = myBufferReader.readLine();
					theDonaldAuthors[counter] = new redditAuthor(line);
					counter += 1;
				}
			}
			catch (Exception ex)
			{
				System.out.println("I can not find your file, can you try again with a different input please?");
			}
			System.out.println("The author of this post is " + theDonaldAuthors[lineNumber].author);
		}
		else
		{
			System.out.println("Can you choose a line number between 0 and 6,466 as the number you choose is out of bound");
		}
	}



}


