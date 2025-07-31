package day3;

import java.util.Scanner;

public class Move_0_to_end {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements in the array:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int temp=0,pos=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				temp=arr[pos];
				arr[pos]=arr[i];
				arr[i]=temp;
				pos++;
				
			}
			
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
