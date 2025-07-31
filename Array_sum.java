package day3;

import java.util.Scanner;

public class Array_sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		String str=sc.next();
	int sum=0;
	int num=0;
	for(int i=str.length()-1;i>=0;i--) {
		if(str.charAt(i)=='0') {
			sum = sum + num;
		}else {
			num++;
		}
	}
	System.out.println(sum);
	sc.close();

		
			
		}

	}

