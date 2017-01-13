import java.util.Scanner;

public class myreader
{
	Scanner scanner;
	public myreader ()
	{
		scanner = new Scanner(System.in);
	}
	public int read ()
	{
		return scanner.nextInt();
	}
}