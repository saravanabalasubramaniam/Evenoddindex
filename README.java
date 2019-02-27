import java.io.*;
import java.util.*;
class Evenodd
{
  public static void main(String args[])
  {
	Scanner input=new Scanner(System.in);
	String b=input.nextLine();
	String c="",d="";
	for(int i=0;i<b.length();i++)
	{
		if(i%2==0)
		{
			c=c+b.charAt(i);
		}
	}
	System.out.println(c);
	for(int i=0;i<b.length();i++)
	{
		if(i%2!=0)
		{
			d=d+b.charAt(i);
		}
	}
	System.out.println(d);
  }
}
