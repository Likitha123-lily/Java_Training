package day5;

import java.util.*;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a 1st String:");
		String s1=sc.nextLine();
		System.out.println("Enter a 2nd String:");
		String s2=sc.nextLine();
		int freq[]=new int[26];
		char a[]=s1.toCharArray();
		char c[]=s2.toCharArray();
		if(s1.length()==s2.length()) {
			for(int i=0;i<s1.length();i++) {
				freq[a[i]-97]++;
				freq[c[i]-97]--;
			}
			for(int i=0;i<26;i++) {
				if(freq[i]==0) {
					break;
				}
			}
			System.out.println("Anagram");
		}else{
		System.out.println("Not Anagram");
		}
	}
}
