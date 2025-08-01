package day5;
import java.util.*;
public class Vowels_and_cons {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String s=sc.nextLine().toLowerCase();
		int v=0,c=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				v++;
			}
			else {
				c++;
			}
		}
		System.out.println("No of vowels:"+v);
		System.out.println("No of constants:"+c);
	}

}
