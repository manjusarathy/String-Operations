import java.util.*;
public class Substring
{
	public static void main(String args[])
	{
		String str,sub;
		int i,c,len;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string to print all its sub strings : ");
		str = sc.nextLine();
		len = str.length();
		System.out.println("Substrings of "+str+" are : ");
		for(c=0;c<len;c++)
		{
			for(i=1;i<=len-c;i++)
			{
				sub = str.substring(c, c+i);
				System.out.println(sub);
			}
		}
	}
}