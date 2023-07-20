package HelpFromSam;

import java.util.*;

public class HelpFromSam {
	
	public static int help(int number)
	{
		int count = 0;
		int mark = 1;
		while(number >= mark)
		{
			number -= mark;
			mark++;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		System.out.println(help(number));
	}

}
