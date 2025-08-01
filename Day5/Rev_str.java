package day5;
import java.util.*;
public class Rev_str {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string:");
	String s=sc.nextLine();
	for(int i=s.length()-1;i>=0;i--) {
		System.out.print(s.charAt(i));
	}
	}

}
