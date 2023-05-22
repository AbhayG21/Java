import java.util.*;

 class B {
	public static void main(String args[])
	{
		String arr[]={"babc","cdef","fghiaa"};
		boolean check =true;
		int len=arr.length;
		for(int x=0;x<len-1;x++)
		{
			char a=arr[x].charAt(arr[x].length()-1);
			char b=arr[x+1].charAt(0);
			if(a!=b) check =false;
		}
		char a=arr[0].charAt(0);
		char b=arr[len-1].charAt(arr[len-1].length()-1);
		if(check==true && a==b) System.out.print("yes");
		else System.out.print("no");
		try{
			System.out.println();
		}
		catch(RuntimeException e)
		{

		}
		catch(Exception e)
		{

		}
	}
}