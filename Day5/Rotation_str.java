package day5;

import java.util.*;;

public class Rotation_str {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a 1st String:");
		String s1=sc.nextLine();
		System.out.println("Enter a 2nd String:");
		String s2=sc.nextLine();
		String sum=s1+s1;
		if(s1.length()==s2.length()&&sum.contains(s2)) {
		System.out.println("rotating String");
				
			}
		else {
			System.out.println("Not rotating String");
		}
		
		}

	}


