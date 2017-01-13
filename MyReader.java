import java.util.Scanner;

public class MyReader
{
    Scanner scanner;
    public MyReader()
    {
	Scanner sc = new Scanner(System.in);
    }
    public int read()
    {
	return scanner.nextInt();
    }
    
}