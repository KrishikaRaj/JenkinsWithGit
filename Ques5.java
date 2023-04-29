package exceptionLab;
import java.util.Scanner;

class MyException extends Exception
{
	MyException()
	{
		System.out.println("Number should be greater than 10");
	}
}

public class Ques5
{
	int a,b,c;
	void checkNumber() throws MyException
	{
		if(a<10 || b<10 || c<10)
		{
			throw new MyException();
		}
		else
		{
			System.out.println("Addition is: "+(a+b+c));
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Ques5 q = new Ques5();
		System.out.println("Enter the three numbers:\na: \nb: \nc: ");
		q.a=sc.nextInt();
		q.b=sc.nextInt();
		q.c=sc.nextInt();
		try
		{
			q.checkNumber();	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
