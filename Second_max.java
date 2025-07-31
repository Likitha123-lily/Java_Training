package day3;

import java.util.Scanner;

public class Second_max {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements in the array:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int f=arr[0];
		int s=arr[1];
		for(int i=0;i<n;i++) {
			if(f<arr[i]) {
				s=f;
				f=arr[i];
			}
		}
		System.out.println(s);
	}

}
