import java.io.*;
import java.util.*;
class Evenodd
{
  public static void main(String args[])
  {
	Scanner input=new Scanner(System.in);
	String b=input.nextLine();
	for(int i=0;i<b.length();i++)
	{
		if(i%2==0)
		{
			System.out.print(b.charAt(i));
		}
	}
	System.out.print("  ");
	for(int i=0;i<b.length();i++)
	{
		if(i%2!=0)
		{
			System.out.print(b.charAt(i));
		}
	}
  }
}
